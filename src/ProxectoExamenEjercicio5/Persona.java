package ProxectoExamenEjercicio5;

public class Persona {
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
    public String toString() {
        return "Persona: nombre = " + nombre ;
    }
}

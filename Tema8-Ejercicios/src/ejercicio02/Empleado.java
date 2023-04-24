package ejercicio02;

public class Empleado {

	private String nombre;
	
	
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	@Override
	public String toString() {
		
		return "Empleado " + nombre;
		
	}
	
}

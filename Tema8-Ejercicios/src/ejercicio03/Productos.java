package ejercicio03;

public class Productos {

	protected String nombre;
	
	protected Double precio;
	
	public Productos(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public double calcular(int num) {
		
		double result;
		
		result = precio * num;
		
		return result;
		
	}
	
	@Override
	public String toString() {
		return nombre + " = " + precio + " euros";
	}
	
}

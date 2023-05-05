package ejercicio04;

public class Television extends Electrodomestico {

	int resolucion;
	
	boolean sintonizador;

	public Television() {
		
		super();
		this.resolucion = 20;
		this.sintonizador = false;
		
	}

	public Television(double precioBase, int peso) {
		
		super(precioBase, peso);
		
	}

	public Television(double precioBase, int peso, String colorParam, char consumoEnergParam) {
		super(precioBase, peso, colorParam, consumoEnergParam);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
}

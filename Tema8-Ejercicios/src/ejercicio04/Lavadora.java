package ejercicio04;

public class Lavadora extends Electrodomestico {

	int carga;
	
	private final int CARGA_DEFAULT = 5;

	public Lavadora() {
		
		this.carga = CARGA_DEFAULT;
		
	}

	public Lavadora(double precioBase, int peso) {
		
		super(precioBase, peso);
		this.carga = CARGA_DEFAULT;
		
	}
	
	public Lavadora(int carga, double precioBase, int peso, String colorParam, char consumoEnergParam) {
		
		super(precioBase, peso, colorParam, consumoEnergParam);
		this.carga = carga;
		
	}

	public int getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		
		double precioAplicado = 0;
		
		if (carga >= 30) {
			
			precioAplicado = 50;
			
		}
		
		return super.precioFinal() + precioAplicado;
		
	}
	
}

package ejercicio04;

public class Electrodomestico {

	protected double precioBase;
	
	protected enum color {blanco, negro, rojo, azul, gris};
	
	protected enum consumoEnerg {A, B, C, D, E, F};
	
	protected int peso;
	
	color atributoColor;
	
	consumoEnerg atributoConsumo;
	
	public Electrodomestico() {
		this.precioBase = 100;
		this.peso = 5;
		this.atributoColor = color.blanco;
		this.atributoConsumo = consumoEnerg.F;
	}

	public Electrodomestico(double precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, int peso, String colorParam, char consumoEnergParam) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.atributoColor = color.valueOf(comprobarColor(colorParam));
		this.atributoConsumo = consumoEnerg.valueOf(comprobarConsumoEnergetico(consumoEnergParam));
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public color getColor() {
		return atributoColor;
	}

	public consumoEnerg getConsumoEnerg() {
		return atributoConsumo;
	}

	public int getPeso() {
		return peso;
	}
	
	private String comprobarConsumoEnergetico(char letra) {
		
		String letraStr = String.valueOf(letra);
		
		switch (letraStr) {
		
			case "A", "B", "C", "D", "E", "F" -> {
				 
			}
			
			default -> {
				
				letraStr = String.valueOf(atributoConsumo);
				
			}
		
		}
		
		return letraStr;
		
	}
	
	private String comprobarColor(String color) {

		switch (color) {
		
		case "blanco", "negro", "rojo", "azul", "gris" -> {
			 
		}
		
		default -> {
			
			color = String.valueOf(atributoColor);
			
		}
	
	}
	
	return color;
		
	}
	
	private double precioFinal() {
		
		double precioFinal;
		
		double precioConsumo;
		
		double precioTamano;
		
		switch (getConsumoEnerg()) {
		
			case color.A, "B", "C", "D", "E", "F" -> {
				
				
				
			}
		
		}
		
		return precioFinal;
		
	}
	
}

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
		this.atributoColor = color.valueOf(colorParam);
		this.atributoConsumo = comprobarConsumoEnergetico(consumoEnergParam);
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
	
	private char comprobarConsumoEnergetico(char letra) {
		
		String letraStr = String.valueOf(letra);
		
		switch (letraStr) {
		
		 case "A", "B", "C", "D", "E", "F" -> {
			 
			 
			 
		 }
		
		}
		
		return letra;
		
	}
	
	private String comprobarColor(String color) {

		if (colorSelect != color) {
			
			color = COLOR_DEFAULT;
			
		}
		
		return color;
		
	}
	
	private double precioFinal() {
		
		double precioFinal;
		
		double precioConsumo;
		
		double precioBase;
		
		switch (getConsumoEnerg()) {
		
		
		
		}
		
		return precioFinal;
		
	}
	
}

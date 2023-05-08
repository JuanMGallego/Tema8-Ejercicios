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

	public Television(double precioBase, int peso, String colorParam, char consumoEnergParam, int resolucion,
			boolean sintonizador) {
		super(precioBase, peso, colorParam, consumoEnergParam);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean getSintonizador() {
		return sintonizador;
	}

	public double precioFinal() {

		double precioTotal;

		if (sintonizador) {

			if (resolucion > 40) {

				precioTotal = super.precioFinal() * 1.30 + 50;

			} else {
				return super.precioFinal() + 50;

			}
		
		} else {
			
			if (resolucion > 40) {
				
				return super.precioFinal() * 1.30 ;
				
			} else {
				
				return super.precioFinal();
				
			}
			
		}
		
		return precioTotal;

	}

}

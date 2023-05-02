package ejercicio03;

public class Perecedero extends Productos {

	private int diasACaducar;

	public Perecedero(String nombre, Double precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	public double calcular() {
		
		double result;
		
		switch (diasACaducar) {
		
			case 1 -> {		
				result = precio / 4;
			}
			
			case 2 -> {
				result = precio / 3;
			}
			
			case 3 -> {
				result = precio / 2;
			}
			
			default -> {
				result = precio;
			}
		
		}
		
		return result;
		
	}
	
	@Override
	public String toString() {
		return super.toString() +  "\nDias restantes caducidad: " + diasACaducar + "\n\n";
	}
	
}

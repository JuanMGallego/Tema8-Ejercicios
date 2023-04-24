package ejercicio01;

public class Hora {

	protected int hora;
	protected int minuto;
	
	public Hora (int hora, int minuto) {
		
		if (hora >= 0 || hora <= 23) {
			
			this.hora = hora;
			
		}
		
		if (minuto >= 0 || minuto <= 59) {
			
			this.minuto = minuto;
			
		}

	}
	
	public void inc() {
		
		if (minuto != 59) {
			
			minuto++;
			
		} else {
			
			minuto = 0;
			
		}
		
	}
	
	public boolean setMinutos(int valor) {
		
		boolean valid = false;
		
		if (valor >= 0 || valor <= 59) {
			
			valid = true;
			
			minuto = valor;
			
		}
		
		return valid;
		
	}
	
	public boolean setHora(int valor) {
		
		boolean valid = false;
		
		if (valor >= 0 || valor <= 23) {
			
			valid = true;
			
			hora = valor;
			
		}
		
		return valid;
		
	}
	
	@Override
	public String toString() {
		         
		String tiempo = "";
		
		if (hora < 10) {
			
			tiempo += "0";
			
		}
		
		tiempo += hora + ":";
		
		if (minuto < 10) {
			
			tiempo += "0";
			
		}		
			
		tiempo += minuto;

		return tiempo;
		
	}
	
}

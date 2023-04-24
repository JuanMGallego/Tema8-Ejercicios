package ejercicio01;

public class HoraExacta extends Hora {

	int segundos;
	
	public HoraExacta(int hora, int minuto, int segundos) {
		super(hora, minuto);
		this.segundos = segundos;
	}

	public void setSegundos(int valor) {
		
		if (valor >= 0 || valor <= 59) {
			
			segundos = valor;
			
		}
		
	}
	
	@Override
	public void inc() {
		
		segundos++;
		
		if (segundos >= 60) {
			
			segundos = 0;
			
			super.inc();
			
		}
		
	}
	
	@Override
	public String toString() {
		
		String tiempo = "";
		
		tiempo += super.toString();
		
		if (segundos < 10) {
			
			tiempo += "0";
			
		}
		
		tiempo += ":" + segundos;
		
		return tiempo;
		
	}
	
}

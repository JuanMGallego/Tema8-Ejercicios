package ejercicio03;

public class NoPerecedero extends Productos{

	private String tipo;

	public NoPerecedero(String nombre, Double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return super.toString() +  "\nTipo: " + tipo;
	}

}

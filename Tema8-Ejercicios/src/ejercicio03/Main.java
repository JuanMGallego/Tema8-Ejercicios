package ejercicio03;

public class Main {

	public static void main(String[] args) {
		
		Productos productos[] = new Productos[10];

		productos[0] = new Perecedero("Yogurts", 3.95, 3);
		productos[1] = new NoPerecedero("Camiseta Blanca", 8.99, "Ropa");
		productos[2] = new Perecedero("Tortilla", 4.5, 2);
		productos[3] = new NoPerecedero("Televisi�n", 299.99, "Electr�nica");
		productos[4] = new Perecedero("Queso", 10.99, 1);
		productos[5] = new Perecedero("Pipas", 1.5, 9);
		productos[6] = new NoPerecedero("Pack x10 tenedores", 9.99, "Cocina");
		productos[7] = new NoPerecedero("Libro infantil", 8.45, "Libros");
		productos[8] = new Perecedero("Pack x10 tenedores", 9.99, 23);
		productos[9] = new NoPerecedero("Cuaderno", 1.2, "Papeler�a");

		for (int i = 0; i < productos.length; i++) {

			System.out.println(productos[i]);
			System.out.println("Suma 5 productos: " + productos[i].calcular(5) + "\n\n");
			
		}
		
	}

}

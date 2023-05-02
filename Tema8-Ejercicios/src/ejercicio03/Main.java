package ejercicio03;

public class Main {

	public static void main(String[] args) {
		
		Productos productos[] = new Productos[10];

		productos[0] = new Perecedero("Yogurts", 3.95, 3);
		productos[1] = new NoPerecedero("Camiseta Blanca", 8.99, "Ropa");
		productos[2] = new Perecedero("Tortilla", 4.5, 2);
		productos[3] = new NoPerecedero("Televisión", 299.99, "Electrónica");
		productos[4] = new Perecedero("Queso", 10.99, 1);
		productos[5] = new Perecedero("Pipas", 1.5, 9);
		productos[6] = new NoPerecedero("Pack x10 tenedores", 9.99, "Cocina");
		productos[7] = new NoPerecedero("Libro infantil", 8.45, "Libros");
		productos[8] = new Perecedero("Pack x10 tenedores", 9.99, 23);
		productos[9] = new NoPerecedero("Cuaderno", 1.2, "Papelería");
		
		System.out.println(productos[0]);
		System.out.println(productos[1]);
		System.out.println(productos[2]);
		System.out.println(productos[3]);
		System.out.println(productos[4]);
		System.out.println(productos[5]);
		System.out.println(productos[6]);
		System.out.println(productos[7]);
		System.out.println(productos[8]);
		System.out.println(productos[9]);
		
		System.out.println("Precio total: " + ());
		
	}

}

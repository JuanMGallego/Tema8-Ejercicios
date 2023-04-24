package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int hora = 0;
		int minuto = 0;
		int segundos = 0;
		
		int opcion;
		
		Scanner sc = new Scanner(System.in);
		
		HoraExacta timeExact = new HoraExacta(hora, minuto, segundos);
		
		Hora time = new Hora(timeExact.hora, timeExact.minuto);

		System.out.println("### HORA ###");
		System.out.println("___________________________________");
		System.out.println("|                                 |");
		System.out.println("| 1. Introducir hora              |");
		System.out.println("| 2. Incrementar minutos          |");
		System.out.println("| 3. Incrementar segundos         |");
		System.out.println("| 4. Imprimir hora                |");
		System.out.println("| 5. Imprimir hora exacta         |");
		System.out.println("| 6. Terminar operación           |");
		System.out.println("|_________________________________|");
		System.out.println();

		opcion = sc.nextInt();
		System.out.println();

		while (opcion != 6) {

			switch (opcion) {

			case 1 -> {
				
				System.out.print("Introduzca las horas: ");
				hora = sc.nextInt();
				
				if (!timeExact.setHora(hora)) {
					
					System.out.println("Formato incorrecto");
					
					break;
					
				}
				
				System.out.print("Introduzca los minutos: ");
				minuto = sc.nextInt();
				
				if (!timeExact.setMinutos(minuto)) {
					
					System.out.println("Formato incorrecto");
					
					break;
					
				}
				
				System.out.print("Introduzca los segundos: ");
				segundos = sc.nextInt();
				
				timeExact.setSegundos(segundos); 
				
				System.out.println("Realizado correctamente");

			}

			case 2 -> {

				time.inc();
				
				System.out.println("Realizado correctamente");

			}
			
			case 3 -> {
				
				timeExact.inc();
				
				System.out.println("Realizado correctamente");
				
			}
			
			case 4 -> {
				
				System.out.println(time.toString());
				
			}
			
			case 5 -> {
				
				System.out.println(timeExact.toString());
				
			}
			
			default -> {
				
				System.err.println("Opción no válida");
				
			}

			}

			System.out.println("___________________________________");
			System.out.println("|                                 |");
			System.out.println("| 1. Introducir hora              |");
			System.out.println("| 2. Incrementar minutos          |");
			System.out.println("| 3. Incrementar segundos         |");
			System.out.println("| 4. Imprimir hora                |");
			System.out.println("| 5. Imprimir hora exacta         |");
			System.out.println("| 6. Terminar operación           |");
			System.out.println("|_________________________________|");
			System.out.println();

			opcion = sc.nextInt();
			System.out.println();

		}

		System.out.println("Operación finalizada");
		
		sc.close();
	
	}

}

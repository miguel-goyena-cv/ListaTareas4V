package org.cuatrovientos.ed.listatareas;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipalConBugs {
	
	private String tema = "black";
	
	

	/**
	 * Constructor para crear una nueva instancia con un tema en concreto
	 * @param tema 
	 */
	public MenuPrincipalConBugs(String tema) {
		super();
		this.tema = tema;
	}
	
	
	/**
	 * COnstuctor por defecto, pondremos el tema a White
	 */
	public MenuPrincipalConBugs() {
		super();
		this.tema ="white";
	}



	/**
	 * Método principal que lanza el menú.
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> listaDeTareas = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in); // Necesario para recoger una entrada por teclado en la consola
		int opcionElegidaUsuario = 0;

		do {
			mostrarMenuPrincipal();
			opcionElegidaUsuario = scanner.nextInt();
			scanner.nextLine(); // Recoger la información del Buffer

			switch (opcionElegidaUsuario) {
			case 1:
				anadirTareas(listaDeTareas, scanner);
				break;
			case 2:
				listarTareas(listaDeTareas, scanner);
				break;
			case 3:
				listaDeTareas = null;
				System.out.println("Borrada la lista de tareas...");
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
			}
		} while (opcionElegidaUsuario != 3);

		scanner.close();

	}



	/**
	 * @param listaDeTareas
	 * @param scanner
	 */
	private static void listarTareas(ArrayList<String> listaDeTareas, Scanner scanner) {
		if (listaDeTareas.size() == 0) {
			System.out.println("Lista de tareas vacia");
		}
		for (int i = 0; i < listaDeTareas.size(); i++) {
			System.out.println("Tarea " + i + ": " + listaDeTareas.get(i));
		}
		System.out.print("Pulse cualquier botón para continuar");
		scanner.nextLine();
	}


	/**
	 * Añadimos una nueva tarea a la lista
	 * @param listaDeTareas La lista completa de tareas
	 * @param scanner Para recoger informacion desde teclado
	 */
	private static void anadirTareas(ArrayList<String> listaDeTareas, Scanner scanner) {
		System.out.print("Introduce la descripción de la tarea: ");
		String descripcion = scanner.nextLine();
		listaDeTareas.add(descripcion);
	}


	/**
	 * Muestra el menu principal de nuestra lista de tareas
	 */
	private static void mostrarMenuPrincipal() {
		System.out.println("\n--- Menú de Lista de Tareas ---");
		System.out.println("1. Agregar una tarea");
		System.out.println("2. Mostrar todas las tareas");
		System.out.println("3. Borrar lista tareas");
		System.out.println("4. Salir");
		System.out.print("Selecciona una opción: ");
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

}

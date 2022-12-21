package view;
/*
1.- Añadir curso
2.- Buscar curso
3.- Duración media de cursos
4.- Cursos por temática
5.- Eliminar cursos por precio
6.- Salir*/

import java.util.Scanner;

import model.Curso;
import service.CursosService;

public class CursosView {


	static CursosService service = new CursosService(); 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=Integer.parseInt(sc.nextLine());  // lee opcion elegida
			switch(opcion) {      // evaluamos
			case 1:
				añadirCurso();
				break;
			case 2:
				buscarCurso();
				break;   
			case 3:
				duracionMedia();
				break;
			case 4:
				cursosTematica();
				break;
			case 5:
				eliminarCurso();
				break;
			case 6: System.out.println("--- Adios ---");
			}
		}while(opcion!=6);
		

	}
	
	static void mostrarMenu() {
		
		System.out.println("1.- Añadir curso ");
		System.out.println("2.- Buscar curso ");
		System.out.println("3.- Duración media de cursos");
		System.out.println("4.- Cursos por temática");
		System.out.println("5.- Eliminar cursos por precio");
		System.out.println("6.- Salir");
	}
	
	
	static void añadirCurso() {
		String nom;
		int duracion;
		int precio;
		Boolean existe = false;
		String tematica;
		
		/*do {
			System.out.println("Nombre del curso: ");
			nom= sc.nextLine();
			} while (!service.buscarCurso(nom).getNombre().equalsIgnoreCase(nom));*/
		
		//  no funcionaria porque si no encuentra el curso, devuelve nulo y no se puede acceder al nombre
		
		System.out.println("Nombre del curso: ");
		nom= sc.nextLine();		
		System.out.println("Duración del curso: ");
		duracion=Integer.parseInt(sc.nextLine());
		System.out.println("Precio del curso: ");
		precio=Integer.parseInt(sc.nextLine());
		System.out.println("Tematica del curso: ");
		tematica= sc.nextLine();		
		
		service.añadirCurso(nom, duracion, precio, tematica);
	}
	
	static void buscarCurso() {
		
		System.out.println("¿Qué curso buscas: ");
		Curso curso=service.buscarCurso(sc.nextLine());
		
		// como hacer que busque primero si existe ese curso, y si no existe que diga que no existe
		
		System.out.println("El curso "+curso.getNombre()+" de "+curso.getDuracion()+" horas de duración, y con precio de "+
							curso.getPrecio()+ "€ , fue de la tematica "+curso.getTematica());
							
		
	}
	
	static void duracionMedia () {
		System.out.println("La duración media de los cursos es: " +service.duracionMedia()+" horas");
	}

}

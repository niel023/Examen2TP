package ces.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
	
	static Scanner sc;
	static ArrayList<Persona> listaPersonas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> alumnos = new ArrayList<String>();
		StringBuilder cad =new StringBuilder();

		sc = new Scanner(System.in);
		
		int opcion = 0;
		
		do {
			
			menu();
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			case 0:
				
				break;
			case 1:
				listarPersonas();
				break;
			case 2:
				anadirPersona();
				break;
			case 3:
				eliminarPersona();
				break;
			case 4:
				eliminarTodosContactos();
				break;
			case 5: 
				buscarPersona();
			    break;
			default:
			    System.out.println("Opci�n no v�lida. Introduzca una opci�n v�lida.");
							
			}
		} while(opcion!=0);
		
		

	}
	
	/*@author 
	 * */
	 
	public static void menu() {
		
		  try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
		
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("                           AGENDA DE CONTACTOS   ");
		System.out.println("                   ________________________________");
		System.out.println();
		System.out.println("                          1. Listado completo ");
		System.out.println("                          2. A�adir un contacto  ");
		System.out.println("                          3. Eliminar un contacto ");
		System.out.println("                          4. Eliminar todos los contactos");
		System.out.println("                          5. B�squeda de persona");	
		System.out.println("                          6. Reemplaza contacto");		
		System.out.println("                          0. Salir del programa");
		System.out.println("                          Introduzca una opci�n: ");
		System.out.println("");
		
		
	}
	
	public static void listarPersonas() {
		
	
		
	if(listaPersonas.isEmpty()) {
		System.out.println("La agenda no tiene contactos\n");
		
	}else {
		for(int i=0; i<listaPersonas.size();i++) {
			Persona p = listaPersonas.get(i);
			System.out.printf(" [ %d ]  %s %s (%s) %n",i,p.getNombre(),p.getApellidos(),p.getTelefono());
		}
		System.out.println("");
	}
		
		
	}
	
	public static void anadirPersona() {
		
		
		
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("                         A�adir nuevo contacto: ");
		System.out.println("                   ________________________________");
		System.out.println();
		System.out.println("                   > Introduzca el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("                   > Introduzca los apellidos: ");
		String apellidos = sc.nextLine();
		System.out.println("                   > Introduzca el tel�fono: ");
		String telefono = sc.nextLine();
		
		listaPersonas.add(new Persona(nombre,apellidos,telefono));
		
		System.out.println("");
		
		
		
	}
	
	public static void eliminarPersona() {
		
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("                        Eliminar persona: ");
		System.out.println("                   ________________________________");
		System.out.println();
		System.out.println("                   > Introduzca la posici�n de la persona: ");
		int posicion  = Integer.parseInt(sc.nextLine());
		
		if(posicion<0 || posicion > listaPersonas.size()) {
			System.out.println("Posici�n err�nea");
		}else {
			System.out.printf("�Est� usted seguro de querer eliminar el contacto %s ? (S/N)",posicion);
			String res = sc.nextLine();
			if( res.equalsIgnoreCase("S")) {
				listaPersonas.remove(posicion);
			}
			System.out.println("                   > Contacto eliminado ");	
		}
		
		System.out.println("    ");
	
		
		
	}
	
	public static void buscarPersona() {
		
		System.out.println("       AGENDA DE CONTACTOS   ");
		System.out.println(" ________________________________");
		System.out.println();
		System.out.println("   1. Listado completo ");
		System.out.println("   2. A�adir un contacto  ");
		System.out.println("   3. Eliminar un contacto ");
		System.out.println("   4. Eliminar todos los contactos");
		System.out.println("   5. B�squeda de persona");
		System.out.println("   0. Salir del programa");
		System.out.println("   Introduzca una opci�n: ");
		
		
	}
	
	public static void eliminarTodosContactos() {
		
		System.out.println("       AGENDA DE CONTACTOS   ");
		System.out.println(" ________________________________");
		System.out.println();
		System.out.println("   1. Listado completo ");
		System.out.println("   2. A�adir un contacto  ");
		System.out.println("   3. Eliminar un contacto ");
		System.out.println("   4. Eliminar todos los contactos");
		System.out.println("   5. B�squeda de persona");
		System.out.println("   0. Salir del programa");
		System.out.println("   Introduzca una opci�n: ");
		
		
	}
	

}

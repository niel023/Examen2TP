import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	static Scanner sc;
	static ArrayList<Persona> listaPersonas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO DE INTERFAZ SET Y MAP
		List<String> alumnos = new ArrayList<String>();
		StringBuilder cad =new StringBuilder();
		sc = new Scanner(System.in);
		Persona persona=new Persona("","","");

		int selec=0;

		do{
			

		}while(selec!=0);

	}

	public void Menu()
	{
		System.out.println("1. Listado completo en agenda Set.");
			System.out.println("2. Añadir un contacto en la agenda Set.");
			System.out.println("3. Añadir una lista de contactos a la agenda Set.");
			System.out.println("4. Eliminar un contacto de la agenda Set.");
			System.out.println("5. Eliminar todos los contactos de la aagenda Set.");
			System.out.println("6. Listado completo en agenda Map.");
			System.out.println("7. Añadir contacto en agenda Map.");
			System.out.println("8. Eliminar un contacto en la agenda Map.");
			System.out.println("9. Busqueda de contacto en agenda Map por teléfono.");
			System.out.println("10. Salir del programa.");

	}
 
}

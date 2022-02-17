package stringbuilder;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuilder cad1 = new StringBuilder("Hola mundo");
		StringBuilder cad2 = new StringBuilder("123");
		StringBuilder cad3 = new StringBuilder(23);
		
		System.out.println("Las dos primeras cadenas unidas son "+cad1.append(cad2));
		
		System.out.println("La longitud de la primera cadena es de "+cad1.length()+" caracteres.");
		
		System.out.println("La capacidad de la segunda cadena es de "+cad2.capacity());
		
		System.out.println("La primera cadena invertida es "+cad1.reverse());
		
		cad1.reverse();
		
		cad2.insert(2, "456");
		System.out.println(cad2);
		
		cad1.deleteCharAt(1);
		System.out.println(cad1);
		
		System.out.println(cad2.toString());
		
		cad1.setLength(26);
		
		System.out.println(cad1.charAt(4));

		cad1.insert(4, ",");
		System.out.println(cad1);
		
		System.out.println(cad1.compareTo(cad2));
		
		
		System.out.println(cad1.replace(0, 3, "-----"));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();




		
		System.out.println("SEGUNDO EJERCICIO");
		System.out.println();
		
		
		
		// SEGUNDO EJERCICIO
		
		String palabra; 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase o una palabra para comprobar si es un palindromo.");
		palabra=sc.nextLine();

		System.out.println(palindromo(palabra));

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();




		
		System.out.println("TERCER EJERCICIO");
		System.out.println();


		// TERCER EJERCICIO
		String eliminar;
		String reemplazar;
		int i=0;
		int a=0;
		
		String libro=("En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres cuartas partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años; era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben; aunque, por conjeturas verosímiles, se deja entender que se llamaba Quejana. Pero esto importa poco a nuestro cuento; basta que en la narración dél no se salga un punto de la verdad.") ;
		StringBuilder Libro =new StringBuilder(libro);

		i=libro.length();

		System.out.println("Escriba una frase para eliminarla en el texto. (si quieres eliminar una palabra pequeña como -a- o -no- escribalo con los espacios al principio y al final de la palabra - a -/- no -");
		eliminar=sc.nextLine();
		a=eliminar.length();
		System.out.println("Escriba otra frase para reemplazarla por la primera");
		reemplazar=sc.nextLine();

		System.out.println();
		System.out.println();
		if(libro.contains(eliminar)){

			System.out.println(eliminar(Libro, eliminar,i ,a ));
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println(reemplazar(Libro, reemplazar, eliminar));

		}
		else{
			System.out.println("Esos caracteres no están en el texto.");
		}
		

	}


	public static String eliminar(StringBuilder Libro, String eliminar, int i, int a )
	{
		String f;
		f=Libro.toString();
		int in=0;
		int total=0;
		f=f.replaceAll(eliminar, "");		
		in=f.length();
		total = (i-in)/a; // Para calcular en numero de veces que se elinina una palabra o frase resto el núermo de caracteres que hay en la frase con los caracteres eliminados menos la frase original, y despues lo divido entre el número de caracteres que tiene la frase que yo he querido eliminar.
		return f+"               "+ "Se ha eliminado "+total+" veces";
	}

	public static String reemplazar(StringBuilder Libro, String reemplazar, String eliminar)
	{
		String f;
		f=Libro.toString();

		f=f.replaceAll(eliminar, reemplazar);
		return f;

	}
	

	public static String palindromo(String palabra)
	{
		int i = 0;

		StringBuilder palabra1= new StringBuilder(palabra);
		
		StringBuilder palabra2 = new StringBuilder(palabra);
		
		palabra2.reverse();


		i=palabra2.compareTo(palabra1);
		

		if(i==0)
		{
			return "Es un palindromo";
		}
		else
		{
			return "No es un palindromo";
		}

	}
	      
}

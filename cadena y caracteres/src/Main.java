
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;	
		String cadena1;	
		cadena="CES Juan Pablo II";
		cadena1=" CES Juan Pablo II ";
		String st1 = "Hola mundo ";
		String st2 = "Bien venido :) ";
		String st5 = "Hello world";
		String st6 = "hello world";
		
		System.out.println(cadena);
		int num= cadena.length();
		System.out.println();
		System.out.println("La frase tiene "+num+" caracteres.");
		
		String st4 = st1.concat(st2);
		System.out.println();
		System.out.println(st4);
		
		System.out.println();
		System.out.println("La letra en la posición 3 es: "+ cadena.charAt(2));
		
		System.out.println();
		System.out.println("La letra 'a' está en la posición: "+ cadena.indexOf("a"));
		System.out.println("La letra 'a' está en la posición (a partir de la posición '7'): "+ cadena.indexOf("a", 7));

		System.out.println();
		System.out.println("La frase a partir de la segunda letra es: "+ cadena.substring(2));
		
		System.out.println();
		System.out.println("La frase a partir de la segunda letra hasta la quinta (se cuenta el dos y el cinco) es: "+ cadena.substring(2, 5));
		
		System.out.println();
		System.out.println("La frase a partir de la segunda letra es: "+ cadena.substring(2));
		
		System.out.println();
		System.out.println("La últinma aparición de la letra a es: "+ cadena.lastIndexOf("a"));

		System.out.println();
		System.out.println("La cadena contando las mayusculas son iguales? "+st5.equals(st6));
		
		System.out.println();
		System.out.println("La cadena sin contar las mayusculas son iguales? "+st5.equalsIgnoreCase(st6));
		
		System.out.println();
		System.out.println("La frase entera en minúsculas sería: "+st5.toLowerCase());
		
		System.out.println();
		System.out.println("La frase entera en mayúsculas sería: "+st5.toUpperCase());
		
		System.out.println();
		System.out.println("La frase sin el primer espacio es: "+cadena1.trim());


	}

}

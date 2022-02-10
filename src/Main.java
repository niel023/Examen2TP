import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=0;

		double suma=0;
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<10;i++)
		{

			System.out.println("Dani");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		do
		{
			System.out.println("Escribe un número.");
			a=sc.nextDouble();
			suma=suma+a;


		}while(a!=0);

		System.out.println("La suma de todos los números es de "+suma);




	}

	

}

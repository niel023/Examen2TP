
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp = 160000; //Población de Cádiz estable
		temp = temp + 20000; //Más la población de verano
		ciudad Ciudad = new ciudad();

		Ciudad.printPoblacion("Cadiz", temp, "12003",2);
		temp = ciudad.factorCorrectorCiudad("Cadiz", temp,"12003",2);
		System.out.println("El factor de corrección de esta ciudad es de: " + temp);
		
	

	}

}

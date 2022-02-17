import java.util.Scanner;


public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		
		
		int tama�o;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println();
			System.out.print("Define el tama�o de las matrices: ");
			tama�o=sc.nextInt();
			System.out.println();
			
			if (tama�o<1)
			{
				System.out.print("El tama�o de la matriz no puede ser tan peque�o ");
				System.out.println();
			}
			
		}while(tama�o<1);
		
			
		
		int matriz1[][]=new int[tama�o][tama�o];		
		int matriz2[][]=new int[tama�o][tama�o];	
		
		System.out.println();
		
		for (int x=0; x < matriz1.length; x++) {
			  for (int y=0; y < matriz1[x].length; y++) {
			    matriz1[x][y] = (int) (Math.random()*(20-0+1)+0);
			  }
		}
		
		for (int x=0; x < matriz2.length; x++) {
			  for (int y=0; y < matriz2[x].length; y++) {
			    matriz2[x][y] = (int) (Math.random()*(20-0+1)+0);
			  }
		}
		
		
		
        int[][] producto = new int[matriz2.length][matriz2[0].length]; 

        
        for (int a = 0; a < matriz2[0].length; a++) { // Necesitamos hacer esto por cada columna de la segunda matriz (2)
            
            for (int i = 0; i < matriz1.length; i++) { // Dentro recorremos las filas de la primera (1)
                int suma = 0;
                
                for (int b = 0; b < matriz1[0].length; b++) { // Y cada columna de la primera (1)
                    
                    suma += matriz1[i][b] * matriz2[b][a]; // Multiplicamos y sumamos resultado
                }
                
                producto[i][a] = suma;
            }
        }

      
        System.out.println("El resultado es:");
        System.out.println();
        for (int i = 0; i < matriz2.length; i++) {
            for (int b = 0; b < matriz2[0].length; b++) {
                System.out.printf("%d ", producto[i][b]);
            }
            System.out.print("\n");
        }
	}
}
        
    

		
		
		
		
		
		
				
		
	
	

	




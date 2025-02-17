package Serie1;
import java.util.Scanner; 
import java.util.InputMismatchException;

public class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;  
		for (int i = 0 ; i < 10 ; i++) {
			try {
				System.out.println(" entry un  nombre " + i );
				int nombre = sc.nextInt() ;   
				System.out.println(" vous avez entry le nombre " + nombre); 
				
			} catch (InputMismatchException e ) {
				System.out.println(" Erreur : vous devez entre un nombre entier ! " + i--);
				sc.next() ; 
			}
		}
		
			
	}

}

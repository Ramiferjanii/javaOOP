package tp0;
import java.util.Scanner;  
public class TestPremie {

	public static void main(String[] args) {
		int a ; 
		boolean estPremier = false ; 
		Scanner sc= new Scanner (System.in) ; 
		System.out.println(" saisier un entier ") ; 
		a = sc.nextInt() ; 
		 for (int i = 2 ; i<= Math.sqrt(a) ;  i++ ) {
			 if ( a % i == 0 ) {
				 estPremier =  false 	;
				 break ; 
			 }
			 else 
					 estPremier = true ; 
			 
		 }
		 if  (estPremier ) 
			 System.out.println(" le nombre "  + a + " et un nombre premier ") ; 
		 
		 else 
			 System.out.println(" le nombre "  + a + " et n'est pas un nombre premier ") ;
		 

	}

}

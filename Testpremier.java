package tp0;
import java.util.Scanner ;

public class Testpremier {
	static int  a  ; 
	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in) ; 
	
	System.out.print(" donner un entier " ) ; 
	a = sc.nextInt() ; 
	for ( int i = 2 ; i <= Math.sqrt(a) ; i++) {
	if (a <=1 ) | (a % i == 0  ) {
		System.out.print(a + " est un nombre premier"); 
		
	}
	}
	
	
	
	
	
	
	}
	
	}



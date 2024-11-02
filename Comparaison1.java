package tp0;
import java.util.Scanner;

public class Comparaison1 {

	public static void main(String[] args) {
		int a,b ;   
		Scanner sc= new Scanner (System.in) ; 
		System.out.print(" entre un entier ");
		a = sc.nextInt() ; 
		System.out.print("entre une dexieme entier ") ; 
		b = sc.nextInt() ; 
		if ( a<b) 
			System.out.print( b + " est le maximum ");
		else 
			if (b<a) 
				System.out.print(a+ " est le mximum") ; 
			else
				System.out.print("les deux number sont egaux ") ; 
	}
}

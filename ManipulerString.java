package tp0;
import java.util.Scanner ;

public class ManipulerString {

	public static void main(String[] args) {
		
		String a  ; 
		System.out.println( " entre une chaine de caractere ");
		Scanner sc= new Scanner (System.in) ; 
		a = sc.nextLine() ; 
		System.out.println(" le longeur de la chaine et " + a.length()) ; 
		if ( a.indexOf('a') != -1) { 
			
			System.out.println(" le chaine de carectere a contient la lettre 'a'") ; 
			
		}
		else 
			System.out.println(" le chaine de caractere ne contient pas la lettre 'a'") ; 
		
		

	}

}

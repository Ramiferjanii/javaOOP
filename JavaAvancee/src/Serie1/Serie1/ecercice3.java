package Serie1;

import java.util.* ; 

public class ecercice3 {
	private static Scanner sc = new Scanner(System.in) ; 

	public static void main(String[] args) {
		String[] noms = new String[10] ;
		int i = 0 ; 
		
		while (i<10) {
		try {
			
				System.out.print("Entry le nom " + ((i+1) + " : "));
				String nom = sc.nextLine() ;
				if (nom.isEmpty()) {
					throw new InputMismatchException("  le nom ne peut pas etre vide !") ; 					
				}
				if (!nomValid(nom)) {
					throw new InputMismatchException(" caractere  interdit detecte dans  : '" + nom + "'") ; 					
				}
				noms[i] = nom ; 
				i++ ; 
				
			
			
} catch (InputMismatchException e ) {
				System.out.println("[ERREUR]" + e.getMessage()); 
				sc.nextLine() ; 
				
			} } System.out.println("\nNoms valides saisis : ");
			System.out.print("[") ; 
			for (String nom : noms ) {
				System.out.print(nom + ",") ; 
			} System.out.print("]") ; 
		}
		
		
 	
		
		
		
		
		
	private static boolean nomValid(String nom ) {
		String nomM = nom.toUpperCase() ; 
		for (int i = 0; i < nomM.length() ; i++ ) {
			int code = nomM.codePointAt(i) ; 
			if (code <'A' || code>'Z') {
				return false ; 
			}
		}
		return true ; 
	}

}

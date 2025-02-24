package Serie1;
import java.util.Scanner; 
import java.util.InputMismatchException; 

public class Exercice2 {
	private static Scanner sc = new Scanner(System.in) ; 
	
	
    public static void main(String[] args) {
        	
    	
    	int[] tableau = new int[10] ; 
    	saisieTab(tableau) ; 
    	
    	System.out.println("\n Tableau saisi  : ");
    	System.out.print("[");

    	for (int element : tableau ) {
    		System.out.print(element + ",");
    		
    	}
    	System.out.print("]") ; 
    }
    public static void saisieTab(int[] tab ) {
    	for (int i = 0 ; i < tab.length ; i++) {
    		saisieElement(tab , i ) ; 
    	}
    	
    }
    public static void saisieElement(int[] tab , int index ) {
    	
    	while (true) {
    		try {
    			System.out.println("Entrez l'element " + (index + 1 ) + " /10 :"); 
    			int valeur = sc.nextInt() ; 
    			tab[index] = valeur ; 
    			break ; 
    			
    		} catch(InputMismatchException e) {
    			System.out.println("Erreur : Veuillez entrer un nombre entier valide . ") ;
    			sc.nextLine() ; 
    	}
    }
} 
}
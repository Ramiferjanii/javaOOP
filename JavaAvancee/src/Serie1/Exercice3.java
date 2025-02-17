package Serie1;
import java.util.Scanner; 
import java.util.InputMismatchException; 

public class Exercice3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        String[] n = new String[10]; 

        int i = 0;
        while (i < 10) { 
            try {
                System.out.print("Enter name " + (i + 1) + "/10 :  ");
                String nom = sc.nextLine(); // Read entire line
                if (!estNomValide(nom)) {
                    throw new InputMismatchException("Invalid characters in the name.");
                }
                n[i] = nom;
                i++; 
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                // No need to call sc.nextLine() here since we're already reading lines
            }
        }

        System.out.println("\nNames entered:");
        for (String nom : n) {
            System.out.println(nom);
        }

        sc.close();
    }

    private static boolean estNomValide(String nom) {
        String nomMajuscules = nom.toUpperCase(); 
        for (int i = 0; i < nomMajuscules.length(); i++) {
            int code = nomMajuscules.codePointAt(i); 
            // Allow A-Z and space
            if (code != ' ' && (code < 'A' || code > 'Z')) {
                return false; 
            }
        }
        return true; 
    }
}
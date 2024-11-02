package tp0;
import java.util.Scanner ; 
public class Equation1 {

	public static void main(String[] args) {
	 double delta , x1 = 0  , x2  , a , b , c ; 
	 Scanner sc = new Scanner (System.in)  ;
	 System.out.print(" entre le valeur de a ");
	 a = sc.nextDouble() ; 
	 System.out.print("entre le valeu de  b ");
	 b= sc.nextDouble() ; 
	 System.out.print(" entre le valeur de c ");
	 c  = sc.nextDouble() ; 
	 delta = (b*b) - ( 4*a*c) ; // Math.pow(b  , 2 ) - 4*a*c 
	 if (delta > 0 ) {
		 x1=((-b) -Math.sqrt(delta))/(2*a) ; 
	 	 x2=((-b) + Math.sqrt(delta))/(2*a) ; 
		 System.out.println(" deux solution   " + x1 + " et " + x2 ) ; 
	 }
	 else 
		 System.out.println(" l'equation n'admet pas une  solution réelle  ") ;
   }
}

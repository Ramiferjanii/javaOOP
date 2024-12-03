package tp1;

public class personne {
		private String nom ; 
		private int age ; 
	public static void main(String[] args) {
		personne a = new personne("mouhamed" , 34 ) ; 
		personne b = new personne ("salma") ; 
		personne c = new personne () ; 
		 b.setAge(26) ; 
		 c.setNom("salim") ; 
		 c.setAge(10); 
		 System.out.println(a.getAge()) ; 
		 System.out.println(a) ; 
		 System.out.println(c);
		 System.out.println(b) ; 
	}
	public void setAge(int n) { 
		this.age = n ; 
	}
	public void setNom(String n ) {
		this.nom = n  ; 
		
	}
	public personne(String n  ) {
		this.nom = n ; 
		this.age = 0 ; 
	}
	public personne (String n  , int x ) { 
		this.nom = n ; 
		this.age = x ; 
	}
	public int getAge() {
		 return this.age ; 
	}
	public personne () {
		
	}
	public String toString() {
		return "(*" +nom + " , " + age + "*)" ; 
		
	}
}

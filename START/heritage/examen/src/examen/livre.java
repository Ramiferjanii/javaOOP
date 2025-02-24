package examen;

public class livre {
	private String livre ;
	private String auteur  ; 
	private double prix  ; 
	public livre (String auteur , String livre , double prix) {
		this.auteur = auteur ; 
		this.prix = prix   ;
		this.livre = livre  ; 
	}
	public livre (livre autre_livre ) {
		this.auteur = autre_livre.auteur ; 
		this.livre = autre_livre.livre ; 
		this.prix = autre_livre.prix ;
	}
	public void setPrix(double n) {
		this.prix = n ;
	}
	public void setAuteur(String n) {
		this.auteur = n ; 
	}
	public void setLivre (String n) {
		this.livre = n ; 
	}
	public double getPrix() {
		return this.prix ;
	}
	public String getLivre() {
		return this.livre ;
	}
	public String getAuteur () {
		return this.auteur ; 
		
	}
	public Boolean sameAuthor (livre I) {
		return this.auteur.equals(I.auteur) ; 
	}
	public int comparePrix(livre L) {
		if (this.prix<L.prix) {
			return -1 ; 
		}
		else if (this.prix>L.prix) {
			return 1 ; 
		}
		else {
			return 0 ; 
		}
	}
	public String toString () {
		return "title : " + this.livre + " , auteur : "+ this.auteur + " , prix : " + this.prix  ; 
	}
	
	public static void main(String[] args) {
		livre livre1 = new livre("programme avec java " , " james Con" , 315) ;
		livre livre2 = new livre ("java pour les débiteurs " , "james Con" , 134) ; 
		
		System.out.println(" livre 1 : " + livre1);
		System.out.println(" livre 2 : " + livre2);
		
		
		int result = livre1.comparePrix(livre2) ; 
		if (result == 1) {
			System.out.println(" livre actuel est superieur " );
		} else if (result == -1) {
			System.out.println(" livre actuel est inferieur " );
			
		} else {
			System.out.println(" les deux livre sont egeaux  " );
		}
		
		
		boolean result2 = livre1.sameAuthor(livre2); 
		System.out.println(" reslt author: " + result2);
	}

}

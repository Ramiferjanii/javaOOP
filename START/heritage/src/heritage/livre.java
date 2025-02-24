package heritage;

public class livre extends document  {
	private String auteur  ;
	private int nbp ; 
	
	private livre (	String title ,String auteur , int nbp ) {
		super(title) ;
		this.auteur = auteur ; 
		this.nbp = nbp ; 
	}
	public void affichierInfo () {
		super.affichierInfo();
		System.out.println(" auteru :" +this.auteur );
		System.out.println(" nombre de page  :" +this.nbp );
	}
	
	public static void main(String[] args) {
	

	}

}

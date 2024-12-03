package examen;

public class Date {
	private int jour  ;
	private int mois ; 
	private int an ; 
	public Date (int jourr , int moiss , int ann ) {
		this.jour = jourr  ; 
		this.mois = moiss ; 
		this.an = ann ; 
		
	}
	public Date (Date autreDate ) {
		this.jour=autreDate.jour ; 
		this.mois=autreDate.mois ; 
		this.an = autreDate.an ; 
	}
	
	public int getJour() {
		return jour; 
		
	}
	public int getMois() {
		return mois; 
	}
	public int getAn() {
		return an  ; 
	}
	public Boolean estBissextille() {
		if (( an %  4 == 0 && an % 100 !=0) || (an % 400 == 0 )) {
			return true  ;
		}  else {
			return false ; 
		}
	}
	 public int comparerDates( Date autreDate ) {
		 if ( this.an < autreDate.an ) {
			 return -1 ; 
		 }
		 else if  (this.an > autreDate.an) {
			 return 1 ; 
		 }else {
			 if ( this.mois < autreDate.mois) {
				 return -1 ; 
			 }
			 else if (this.mois> autreDate.mois) {
				 return 1 ; 
			 }
			 else {
				 if ( this.jour < autreDate.jour) {
					 return -1 ; 
				 }
				 else if ( this.jour>autreDate.jour) {
					 return 1 ; 
					 
				 } else {
					 return 0 ; 
				 }
			 }
			 
		 }
		 
	 }
	 public void afficherDate() {
		 System.out.println(" jour : " + jour + "  , mois : " + mois + "  , année :" + an );
	 } 
	 
	public static void main(String[] args) {
		Date date1 = new Date(02 , 10 , 2004) ; 
		Date date2 = new Date(02 , 10 , 2004) ; 
		
		date1.afficherDate();
		date2.afficherDate();
		
		System.out.println(" l'annee " + date1.getAn() + " est bissextille " + date1.estBissextille());
		System.out.println(" l'annee " + date2.getAn() + " est bissextille " + date2.estBissextille());

		int comparaison = date1.comparerDates(date2) ; 
		if (comparaison == -1) {
			System.out.println(" la date 1 est antérieur a  la date 2 ");
			
		} else if (comparaison == 1 ) {
			System.out.println(" la date 1 est postérieur a la date 2 ");
			

		}else {
			System.out.println(" les deux date sont egeaux");
		}

	}

}

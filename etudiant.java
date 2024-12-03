package examen;

public class etudiant {
	private String nom_pre  ; 
	private double note_info ; 
	private float note_math ; 
	public etudiant(String nom_pre , double d , float note_math ) {
		this.nom_pre = nom_pre ; 
		this.note_info = d ; 
		this.note_math = note_math ; 
	}
	public etudiant(etudiant autreEtudiant) {
		this.nom_pre = autreEtudiant.nom_pre ; 
		this.note_info = autreEtudiant.note_info ; 
		this.note_math = autreEtudiant.note_math ; 
	}
	public void setNom(String nom ) {
		this.nom_pre = nom ; 
	}
	public void setNote_math(float noteMath) {
		this.note_math = noteMath ; 
	}
	public void setNote_info( float noteInfo) {
		this.note_info = noteInfo ; 
	}

	public String toString () {
		return " Nom et prénom : " +this.nom_pre + ", note d'informatique : " +  this.note_info + "  ,  note mathématique " + this.note_math  ; 
		
	}
	public int compare_to (etudiant autreEtudiant ) {
		if (this.note_info < autreEtudiant.note_info) {
			return -1 ; 
		}
		else if (this .note_info > autreEtudiant.note_info) {
			return 1 ; 
		}
		else {
			return 0 ; 
		}
		
	}
	public boolean moyenne_math(float note_max ) {
		return this.note_math >= note_max / 2 ; 
	}
	
	
	public static void main(String[] args) {
		etudiant etudiant1 = new etudiant ("ahmed salem", 13.5 , 11 ) ; 
		etudiant etudiant2 = new etudiant ( " mouhamed abdallah " , 14 , 8 )  ;
		System.out.println(etudiant1) ; 
		System.out.println(etudiant2); 
		if (etudiant1.compare_to(etudiant2) == 1 ) {
			System.out.println(" la note d'informatique  l aplus grande  est : " +  etudiant1.note_info) ; 
			
		} else {
			System.out.println(" la nopte d'informatique la plus grande est  : " + etudiant2.note_info) ; 
		}
		float noteMax = 20f ; 
		System.out.println( " la note mathematique  de ahmed salem dépasse ou egale la moyenne  : " + etudiant1.moyenne_math(noteMax));
		

	}

}

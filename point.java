package tp2;

public class point {
		private double  x ;
		private double y ; 
		public point(double x , double y ) {
			this.x=x ; 
			this.y = y ; 
			
		}
		public double getx() {
			 return x ; 
		}
		public void setx(double x) {
			 this.x= x ; 
			 
		}
		public double gety( ) {
			return y ; 
		}
		public void sety( double y ) {
			this.y=y ; 
			
		}
		public void deplacer(double dx , double dy ) {
			 this.x += dx ; 
			 this.y += dy ; 
		}
		public void afficher () {
			System.out.println("x=" + x + " , y=" + y );
		}
		public static double distance(point p1 , point p2) { 
			return Math.sqrt(Math.pow(p2.getx()- p1.getx() , 2 ) +Math.pow(p2.gety() - p1.gety() , 2)) ; 
			
		}
		
	public static void main(String[] args) {
		point p1 = new point (1 , 2 )  ; 
		point p2 = new point (4 , 6 ) ; 
		System.out.println(" coordonner de p1  : ") ; 
		p1.afficher();
		System.out.println(" coordonner de p2 :  ") ; 
		p2.afficher();
		
		double dist = point.distance(p1, p2)  ; 
		System.out.println(" la distance entre p1 et p2 : " + dist) ; 
		

	}

}

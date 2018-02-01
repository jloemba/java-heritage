
public class PointNom extends Point{

	private char nom;
		//
	public PointNom(int x , int y){
		super.initialise(x, y);
	}
	
	public PointNom(int x , int y,char n){
		super.initialise(x, y);
		this.nom = n;
	}
	
		//
	public void initialisePointNom(int abs, int ord, char n){
		super.initialise(abs, ord);
		this.nom = n;
	}
		//
	public void setNom(char n){
		this.nom = n;
	}
	
		//
	public void affCoordNom(){
		System.out.println("Abscisse :"+super.getX()+" - Ordonnées :"+this.getY()+" - Nom du point"+this.nom);
	}
}
	

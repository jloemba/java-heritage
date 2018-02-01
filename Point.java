
public class Point {

	  //
	protected int x, y;
	
	
	  //
	public void initialise (int x, int y) {
		this.x =x; 
		this.y=y; 
	} 
	
	  //
	public void deplace (int dx, int dy) {
		x += dx; y += dy; 
	}
	
	//
	public int getX(){
		return x;
	}
	
	//
	public int getY(){
		return y;
	} 
	
	public void afficheCoord(){ 
		System.out.println("Coordonnées : "+this.x+" "+this.y);
		} 
}

import javax.swing.*;

public class lab05A02 {

	public static void main(String[] args) {
		String point = JOptionPane.showInputDialog("Entrez un point: ","( x , y )").trim();
		int indice = point.indexOf( ',' );
		String sx = point.substring(1, indice).trim();
		String sy = point.substring(indice+1 , point.length()-2 ).trim();
		double x = Double.parseDouble( sx );
		double y = Double.parseDouble( sy );
		System.out.print("Le point (" + x + " , " + y + ") est "  );
		if( x==0.0 && y==0.0) {
			System.out.println(" a l'origine du plan");
	}
		else if( x==0.0 ) {
			System.out.println("sur l'axe des y.");
		}
		else if(y==0.0){
			System.out.println("sur l'axe des x.");
		}
		else if(x>0.0 && y>0.0){
			System.out.println("dans le quadrant 1.");
	    }
		else if(x<0.0 && y>0.0){
			System.out.println("dans le quadrant 2.");
		}
		else if(x<0.0 && y<0.0){
			System.out.println("dans le quadrant 3.");
		}
		
		else if(x>0.0 && y<0.0){
			System.out.println("dans le quadrant 4."); } 
		}
}
		

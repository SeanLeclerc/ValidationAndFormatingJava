import javax.swing.*;
public class lab05L {

	public static void main( String[] args ) {
	    String code = JOptionPane.showInputDialog( "Entrez un code: " );
	    if( estUnCodePostal( code ) ) {
	        System.out.println( "Ce codde est valide" );
	    }
	    else {
	        System.out.println( "Ce code n'est pas valide" );
	    }
	}



	private static boolean estUnCodePostal( String c){
		boolean valide = true;
		c = c.trim();
		c = c.replace(" ","");
		c = c.toUpperCase();
		if( c.length()!=6) {
			valide = false;
		}
		else {
			char car = c.charAt(0);
			if( car<'A' || car>'Z' ) valide = false;
			car = c.charAt(1);
			if( car<'0' || car>'9' ) valide = false;
			car = c.charAt(2);
			if( car<'A' || car>'Z' ) valide = false;
			car = c.charAt(3);
			if( car<'0' || car>'9' ) valide = false;
			car = c.charAt(4);
			if( car<'A' || car>'Z' ) valide = false;
			car = c.charAt(5);
			if( car<'0' || car>'9' ) valide = false;
			
		}
		
		return valide;
	}

}

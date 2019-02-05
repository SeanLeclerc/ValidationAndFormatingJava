package lab05;
import javax.swing.*;


public class lab05K {
	
	public static void main(String[] args ){
		//saisie de linfos
		String s = JOptionPane.showInputDialog("Achat :","0@0.00T11.25").trim();
		//Validation
		int at = s.indexOf(( "@"));
		int t = s.toUpperCase().indexOf("T");
		if( at>0 && t<s.length()-1 && t-at>1) {
		//Decoupage
		int nb = Integer.parseInt(s.substring(0,at).trim() );
		double prix = Double.parseDouble(s.substring(at+1,t).trim());
		double taux = Double.parseDouble(s.substring(t+1).trim());
		//Fabrication chaine solution
		String reponse = 
				String.format("1$12s = %2$10.2f$\n");
	}
	else {
		JOptionPane.showMessageDialog( null, s + ": Format incorrect!" );
	}
		
		
		


	}

}

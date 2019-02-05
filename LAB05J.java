package lab05;
import javax.swing.*;


public class LAB05J {
	
	public static void main(String[] args ){
		//saisie delinfos
		String s = JOptionPane.showInputDialog("Achat :","0@0.00").trim();
		//Validation
		int n = s.indexOf(( "@"));
		if( n>0 && n<s.length()-1 ){
		//Decoupage
		int nb = Integer.parseInt(s.substring(0,n).trim() );
		double prix = Double.parseDouble(s.substring(n+1).trim());
		//Fabrication chaine solution
		String reponse = s + "=" + String.format("%1$1.2f$", nb*prix);
		System.out.println( reponse );
		JOptionPane.showMessageDialog( null , reponse );
	}
	else {
		JOptionPane.showMessageDialog( null, s + ": Format incorrect!" );
	}
		
		
		


	}

}

//=====================================
//Programmeur : Sean Leclerc
//Fichier : lab05A.java
//Date : Sep 28, 2016
//Description :lab05
//======================================
import javax.swing.*;

public class lab05A {
	

	public static void main(String[] args) {
		String nom = JOptionPane.showInputDialog("Nom: ").trim();
		int indice = nom.indexOf(" ");
		if( indice != -1 ) {
		String prenom = nom.substring(0,indice);
		String nomFamille = nom.substring(indice+1).trim();
		System.out.println( nomFamille + " " + prenom);
		
		}
		else {
			System.out.println("Desole, il n'y a pas d'espace...");
		}

	
	}
}



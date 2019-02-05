import javax.swing.*;

public class lab05D {


	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Numero a 10 chiffres: ").trim();
		String p1 = numero.substring(0, 3);
		String p2 = numero.substring(3, 6);
		String p3 = numero.substring(6);
		System.out.println("(" + p1 + ") " + p2 + "-" + p3 );
		
	}
}

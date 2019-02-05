import javax.swing.*;

public class question03 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt( JOptionPane.showInputDialog("").trim());
		int n2 = Integer.parseInt( JOptionPane.showInputDialog("").trim());
		System.out.println(
				n1 + " divise par " + n2 +  
				" egale " + n1/n2 + " reste " + n1%n2);
		
	}

}

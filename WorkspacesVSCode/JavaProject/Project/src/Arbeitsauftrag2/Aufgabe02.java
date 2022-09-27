package Arbeitsauftrag2;

import javax.swing.JOptionPane;

public class Aufgabe02 {
	
	public static void runAufgabe02() {
		String sInput = JOptionPane.showInputDialog("Gebe hier einen Radius ein.");
		double input = Double.parseDouble(sInput);
		
		double dErgebnis = input * 2;
		double aErgebnis = Math.PI * Math.pow(input, 2);
		
		JOptionPane.showMessageDialog(null, "Der Durchmesser ist " + dErgebnis + ". Und der Fl�cheninhalt betr�gt " + aErgebnis + ".");
		
		
	}
	
}

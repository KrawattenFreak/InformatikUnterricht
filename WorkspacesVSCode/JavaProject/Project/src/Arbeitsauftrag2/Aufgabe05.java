package Arbeitsauftrag2;

import javax.swing.JOptionPane;

public class Aufgabe05 {

	public static void runAufgabe05() {
		
		String passwort;
		
		double Geld = 136.34;
		
		
		boolean validated = false;
		boolean validated2 = false;
		
		do {
			passwort = JOptionPane.showInputDialog("Gebe deine Pin ein:");
			
			
			if(passwort.equals("187") ) {
				validated = true;
			} else {
				JOptionPane.showMessageDialog(null, "Du hast das falsche Passwort eingegeben.");
			}
			
			
		} while (validated == false);
		
		
		do {
			String sAbheben = JOptionPane.showInputDialog("Wie viel Cash willst du abheben? Du hast momentan "+ Geld + "� auf deinem Konto.");
			Double abheben = Double.parseDouble(sAbheben);
			
			
			//FINAL ABHEBEN
			Geld = Geld - abheben;		
			
			if (Geld < 0) {
				Geld = Geld + abheben;
				JOptionPane.showMessageDialog(null, "Du keks, du kannst doch nicht mehr Geld abheben als du doch eigentlich auf deinem Konto hast.");
				
			} else {
				JOptionPane.showMessageDialog(null, "Okey. Du hast nun nur noch " + Geld + "� auf deinem Konto du Sohn.");
				validated2 = true;
			}
			
			
		} while (validated2 == false);
		
	}
}

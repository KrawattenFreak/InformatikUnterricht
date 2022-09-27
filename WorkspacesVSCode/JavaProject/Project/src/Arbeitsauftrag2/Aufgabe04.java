package Arbeitsauftrag2;

import javax.swing.JOptionPane;

public class Aufgabe04 {
	
	public static void runAufgabe04() {
		String sSprittPreis = JOptionPane.showInputDialog("Bitte gebe hier den aktuellen Sprittpreis ein. (pro Liter)");
		String sDurchschnittlicherVerbrauch = JOptionPane.showInputDialog("Bitte gebe hier deinen durschschnittlichen Verbrauch des Spritts ein. (Liter pro Kilometer)");
		String sAnzahlGefahrenerKilometer = JOptionPane.showInputDialog("Bitte gebe hier die Anzahl der gefahrenen Kilometer ein. (Kilometer)");
		
		double sprittpreis = Double.parseDouble(sSprittPreis);
		double durchschnittlicherVerbrauch = Double.parseDouble(sDurchschnittlicherVerbrauch);
		double anzahlGefahrenerKilometer = Double.parseDouble(sAnzahlGefahrenerKilometer);
		
		double ergebnis = sprittpreis  * durchschnittlicherVerbrauch  * anzahlGefahrenerKilometer;
		
		JOptionPane.showMessageDialog(null, "Nun, der Endpreis bel�uft sich auf " + ergebnis + "�." );
	}
	
}

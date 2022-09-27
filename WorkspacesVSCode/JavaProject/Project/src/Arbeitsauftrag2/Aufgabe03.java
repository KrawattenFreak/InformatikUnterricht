package Arbeitsauftrag2;

import javax.swing.JOptionPane;

public class Aufgabe03 {
	
	public static void runAufgabe03() {
		String name = JOptionPane.showInputDialog("Hallo, wie hei�t du?");
		String sJahr = JOptionPane.showInputDialog("Welches Jahr haben wir, " + name + "?");
		String sGeborenesJahr = JOptionPane.showInputDialog("In welchem Jahr bist du geboren?");
		String sSchonGeburtstag = JOptionPane.showInputDialog("Hattest du in diesem Jahr schon Geburstag?");
		
		int jahr = Integer.parseInt(sJahr);
		int geborenesJahr = Integer.parseInt(sGeborenesJahr);
		
		boolean schonGeburstag;
		
		switch (sSchonGeburtstag) {
			case "Ja":
				schonGeburstag = true;
				break;
			case "Yes":
				schonGeburstag = true;
				break;
			case "ja":
				schonGeburstag = true;
				break;
			case "jes":
				schonGeburstag = true;
				break;
			case "yes":
				schonGeburstag = true;
				break;
			case "genau":
				schonGeburstag = true;
				break;
			case "Genau":
				schonGeburstag = true;
				break;
			default:
				schonGeburstag = false;
				break;
		}

		
		int zusatz = 0;
		if(schonGeburstag == false) {
			zusatz = 1;
		}
		
		int Ergebnis = jahr - geborenesJahr - zusatz;
		
		JOptionPane.showMessageDialog(null, "Dann bist du " + Ergebnis + " alt.");
		
	}
}

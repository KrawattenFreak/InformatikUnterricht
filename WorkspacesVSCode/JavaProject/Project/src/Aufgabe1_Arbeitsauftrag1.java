import javax.swing.JOptionPane;

public class Aufgabe1_Arbeitsauftrag1 {
    
    public static void run() {

        String method = JOptionPane.showInputDialog("Von welcher Einheit aus möchtest du umwandeln?");

        if (method.equals("€")) {
            String sWert = JOptionPane.showInputDialog("Gebe den Wert in € ein!");
            Double Wert = Double.parseDouble(sWert);

            Double ergebnisDollar = Wert * 1.0523;
            Double ergebnisAustralischerDollar = Wert * 1.4751;

            JOptionPane.showMessageDialog(null, "Dein Betrag ist in Dollar: " + ergebnisDollar + "$ und im australischen Dollar: " + ergebnisAustralischerDollar + " AUD.");

        } else if (method.equals("$")) {
            String sWert = JOptionPane.showInputDialog("Gebe den Wert in $ ein!");
            Double Wert = Double.parseDouble(sWert);

            Double ergebnisEUR = Wert * 0.9497;
            Double ergebnisAustralischerDollar = Wert * 1.4025;

            JOptionPane.showMessageDialog(null, "Dein Betrag ist in Euro: " + ergebnisEUR + "€ und im australischen Dollar: " + ergebnisAustralischerDollar + " AUD.");

        } else if (method.equals("AUD")) {
            
            String sWert = JOptionPane.showInputDialog("Gebe den Wert in AUD ein!");
            Double Wert = Double.parseDouble(sWert);

            Double ergebnisEUR = Wert * 1.05;
            Double ergebnisDollar = Wert * 0.71;

            JOptionPane.showMessageDialog(null, "Dein Betrag ist in Euro: " + ergebnisEUR + "€ und im australischen Dollar: " + ergebnisDollar + "$.");

        } else {
            JOptionPane.showMessageDialog(null, "Benutze bitte €, $ oder AUD.");
        }
        
        

            



    }


}

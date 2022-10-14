package JavaKlassen01;

import javax.swing.JOptionPane;

public class Aufgabe01 {
    float Gegenzahl (float Zahl) {
        return - Zahl;
    }

    float Kehrwert (float Zahl) {
        return 1/Zahl;
    }

    float Multiplikation (float Zahl) {
        String Abfrage2 = JOptionPane.showInputDialog("Gebe noch eine zweite Zahl.");
        float Abfrage2Zahl = Float.parseFloat(Abfrage2);
        return Zahl * Abfrage2Zahl;
    }

    void anzeigen(String Text, float Zahl) {
        JOptionPane.showMessageDialog(null, Text + " ist " + Zahl);
    }

    public static void main(String[] args) {
        Aufgabe01 Taschenrechner = new Aufgabe01();
        String Eingabe = JOptionPane.showInputDialog("Gib eine Zahl ein.");
        float Zahl = Float.parseFloat(Eingabe);
        Taschenrechner.anzeigen("Gegegnzahl: ", Taschenrechner.Gegenzahl(Zahl));
        Taschenrechner.anzeigen("Kehrwert: ", Taschenrechner.Kehrwert(Zahl));
        Taschenrechner.anzeigen("Multiplikation", Taschenrechner.Multiplikation(Zahl));
    }
}
package JavaKlassen01;

import javax.swing.JOptionPane;

public class Mathe {
    float Gegenzahl (float Zahl) {
        return - Zahl;
    }

    float Kehrwert (float Zahl) {
        return 1/Zahl;
    }

    void azeigen(String Text, float Zahl) {
        JOptionPane.showMessageDialog(null, Text + " ist " + Zahl);
    }

    public static void main(String[] args) {
        Mathe Taschenrechner = new Mathe();
        String Eingabe = JOptionPane.showInputDialog("Gib eine Zahl ein.");
        float Zahl = Float.parseFloat(Eingabe);
        Taschenrechner.azeigen("Gegegnzahl: ", Taschenrechner.Gegenzahl(Zahl));
        Taschenrechner.azeigen("Kehrwert: ", Taschenrechner.Kehrwert(Zahl));
    }
}
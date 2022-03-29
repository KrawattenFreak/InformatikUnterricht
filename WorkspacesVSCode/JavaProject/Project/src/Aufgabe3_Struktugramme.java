import javax.swing.JOptionPane;

public class Aufgabe3_Struktugramme {

    public static void run() {

        String Eingabe = JOptionPane.showInputDialog("Gebe hier eine Zahl ein");
        float Kehrwert = 1 / Float.valueOf(Eingabe);

        float Gegenzahl = Float.valueOf(Eingabe) * - 1;

        JOptionPane.showMessageDialog(null, "Der Kehrwert von deiner Zahl ist " + Kehrwert + " und die Gegenzahl ist " + Gegenzahl + ".");


    }
}

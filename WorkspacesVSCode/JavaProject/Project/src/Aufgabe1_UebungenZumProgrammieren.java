import javax.swing.JOptionPane;

public class Aufgabe1_UebungenZumProgrammieren {
    
    public static void run() {

        String SAlter = JOptionPane.showInputDialog("Gebe dein Alter ein.");
        String Name = JOptionPane.showInputDialog("Gebe deinen Name ein.");
        String Geschlecht = JOptionPane.showInputDialog("Gebe dein Geschlecht an.");

        int Alter = Integer.valueOf(SAlter);

        if (Alter < 18) {
            JOptionPane.showMessageDialog(null, "Hallo " + Name + "!");
        } else if (Geschlecht.equals("Männlich")) {
            JOptionPane.showMessageDialog(null, "Guten Tag Herr " + Name + "!");
        }else if (Geschlecht.equals("Weiblich")) {
            JOptionPane.showMessageDialog(null, "Guten Tag Frau " + Name + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Ein schwerliegender Fehler ist aufgetreten.");
        }

        

    }

}

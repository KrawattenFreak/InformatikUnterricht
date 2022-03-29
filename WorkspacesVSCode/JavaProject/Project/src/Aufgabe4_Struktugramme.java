import javax.swing.JOptionPane;

public class Aufgabe4_Struktugramme {
    
    public static void run() { 
        
        String Eingabe = JOptionPane.showInputDialog("Kennwort eingeben:");

        String Kennwort = "a";

        System.out.println(Kennwort);
        System.out.println(Eingabe);

        if (Eingabe.equals(Kennwort)) {
            JOptionPane.showMessageDialog(null, "Alles OK");
        } else {
            JOptionPane.showMessageDialog(null, "Zugriff verweigert");
        }
    
    }
}

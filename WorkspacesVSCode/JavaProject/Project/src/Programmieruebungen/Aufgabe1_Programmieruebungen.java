package Programmieruebungen;
import javax.swing.JOptionPane;

public class Aufgabe1_Programmieruebungen {

    public static void run() {

        String eingabe = JOptionPane.showInputDialog("Gib eine Note ein.");

        switch(eingabe) {
            case "1": 
                JOptionPane.showMessageDialog(null, "Die Note 1 steht für Sehr Gut!");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Die Note 2 steht für Gut!");
                break;
            case "3": 
                JOptionPane.showMessageDialog(null, "Die Note 3 steht für Befriedigend.");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Die Note 4 steht für Ausreichend.");
                break;
            case "5": 
                JOptionPane.showMessageDialog(null, "Die Note 5 steht für Mangelhaft.");
                break;
            case "6":
                JOptionPane.showMessageDialog(null, "Die Note 6 steht für Ungenügend.");
                break;

            default: 
                System.out.println("Fehler, keine richtige Eingabe.");
                break;



        }

    }
    
}

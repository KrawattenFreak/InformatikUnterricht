import javax.swing.JOptionPane;

public class Aufgabe2_UebungenZumProgrammieren {
    
    public static void run() {
        
        double player1 = Double.parseDouble(JOptionPane.showInputDialog("Spieler 1"));

        double player2 = Double.parseDouble(JOptionPane.showInputDialog("Spieler 2"));

        double drandomNumber = Math.random() * 100;
        
        System.out.println("Die Zahl ist " + drandomNumber + ".");

        if (Math.abs(drandomNumber - player1) > Math.abs(drandomNumber - player2)) {
            System.out.println("Spieler 2 hat gewonnnen!");

        } else {
            System.out.println("Spieler 1 hat gewonnen!");
            
        }

    }

}

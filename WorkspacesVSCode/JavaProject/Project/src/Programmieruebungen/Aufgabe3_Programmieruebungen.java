package Programmieruebungen;
import javax.swing.JOptionPane;

public class Aufgabe3_Programmieruebungen {
    
    public static void run() {
        
        String input = JOptionPane.showInputDialog("Gebe hier die Note ein, die du gerne umwandeln möchtest.");
        
        //Hier habe ich eventuell etwas benutzt, das wir noch nicht im Unterricht hatten. Hier würde man anosnten einfach mit If-Statements oder Switch-Case-Statements fortfahren.
        String[] dictionary = new String[]{"6", "5-", "5", "5+", "4-", "4", "4+", "3-", "3", "3+", "2-", "2", "2+", "1-", "1", "1+"};

        System.out.println("Die besagt Note entspricht einer " + dictionary[Integer.parseInt(input)]);

    }
        

}
    


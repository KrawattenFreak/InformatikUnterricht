import javax.swing.JOptionPane;

public class Aufgabe3_Programmieruebungen {
    
    public static void run() {
        
        String input = JOptionPane.showInputDialog("Gebe hier die Note ein, die du gerne umwandeln möchtest.");
        
        //for (int i = 0; i<= 15; i++) {
        //    if (i == Integer.parseInt(input)){
        //        float ergebnis = (-2/7)* Float.valueOf(i) + (37/7);
        //        System.out.println(ergebnis);
        //}

            String[] dictionary = new String[]{"6", "5-", "5", "5+", "4-", "4", "4+", "3-", "3", "3+", "2-", "2", "2+", "1-", "1", "1+"};

            System.out.println("Die besagt Note entspricht einer " + dictionary[Integer.parseInt(input)]);

    }
        

}
    


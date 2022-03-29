import javax.swing.JOptionPane;

public class Aufgabe4_Programmieruebungen {
    
    public static void runA() {
        String shoehe  = JOptionPane.showInputDialog("Gebe hier die Höhe in cm ein.");
        String sradius = JOptionPane.showInputDialog("Gebe hier den Radius in cm ein.");

        double hoehe = Float.parseFloat(shoehe);
        double radius = Float.parseFloat(sradius);

        double volume = radius * radius * Math.PI * hoehe;
        double oberflaeche = 2 * Math.PI * radius * hoehe + 2 * (radius * radius * Math.PI);
        
        JOptionPane.showMessageDialog(null, "Das Volumen ist " + volume + "cm3 und die Oberfläche " + oberflaeche + "cm2.");

    }

    public static void runB() {
        String sradius = JOptionPane.showInputDialog("Gebe hier den Radius in cm ein.");

        double radius = Float.parseFloat(sradius);

        double umfang = 2 * Math.PI * radius;
        double oberflaeche = 4 * Math.PI * ( radius * radius );
        double volume = 4/3 * Math.PI * ( radius * radius * radius ); 

        JOptionPane.showMessageDialog(null, "Das Volumen ist " + volume + "cm3, die Oberfläche " + oberflaeche + "cm2 und der Umfang " + umfang + "cm.");

    }

    public static void runC() {
        String slaengeA = JOptionPane.showInputDialog("Gib Seitenlänge a an.");
        String slaengeB = JOptionPane.showInputDialog("Gib Seitenlänge b an.");
        String slaengeC = JOptionPane.showInputDialog("Gib Seitenlänge c an.");

        double laengeA = Float.parseFloat(slaengeA);
        double laengeB = Float.parseFloat(slaengeB);
        double laengeC = Float.parseFloat(slaengeC);

        double volume = laengeA * laengeB * laengeC;
        double oberflaeche = 2 * ( laengeA * laengeB ) + 2 * ( laengeB * laengeC ) + 2 * ( laengeA * laengeC );
        double raumdiagonale = Math.pow( Math.pow(laengeA, 2) + Math.pow(laengeB, 2) + Math.pow(laengeC, 2) , 0.5 );
        double gesamtkantenlänge = ( 4 * laengeA ) + ( 4 * laengeB ) + ( 4 * laengeC );

        JOptionPane.showMessageDialog(null, "Das Volumen ist " + volume + "cm3, die Oberfläche " + oberflaeche + "cm2, die Raumdiagonale " + raumdiagonale + "cm und die Gesamtkantenlänge " + gesamtkantenlänge + "cm.");

    }

}

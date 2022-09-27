package Arbeitsauftrag1;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Aufgabe3_Arbeitsauftrag1 {

    public static void run() {

        boolean valid;

        do {
            valid = true;
            String sInput = JOptionPane.showInputDialog("Von welcher Fläche möchtest du die Daten berechnen lassen?");

            if (sInput.equals("Dreieck")){
                String sInputA = JOptionPane.showInputDialog("Gebe die Länge von Seite A ein. ");
                String sInputB = JOptionPane.showInputDialog("Gebe die Länge von Seite B ein. ");
                double inputA = Double.parseDouble(sInputA);
                double inputB = Double.parseDouble(sInputB);

                double ergebnisFlaecheninhalt = (inputA * inputB) / 2;

                double ergebnisUmfang = inputA + inputB + Math.pow( Math.pow(inputA, 2) + Math.pow(inputB, 2), 0.5) ;
                
                JOptionPane.showMessageDialog(null, "Der Flächeninhalt beträgt: " + ergebnisFlaecheninhalt + " und der Umfang beträgt: " + ergebnisUmfang + ".");


            } else if (sInput.equals("Rechteck")) {
                String sInputA = JOptionPane.showInputDialog("Gebe die Länge von Seite A ein. ");
                String sInputB = JOptionPane.showInputDialog("Gebe die Länge von Seite B ein. ");
                double inputA = Double.parseDouble(sInputA);
                double inputB = Double.parseDouble(sInputB);

                double ergebnisFlaecheninhalt = inputA * inputB;
                double ergebnisUmfang = ( 2 * inputA ) + ( 2 * inputB );
                
                JOptionPane.showMessageDialog(null, "Der Flächeninhalt beträgt: " + ergebnisFlaecheninhalt + " und der Umfang beträgt: " + ergebnisUmfang + ".");


            } else if (sInput.equals("Trapez")) {
                String sInputA = JOptionPane.showInputDialog("Gebe die Länge von Seite A ein. ");
                String sInputB = JOptionPane.showInputDialog("Gebe die Länge von Seite B ein. ");
                String sInputC = JOptionPane.showInputDialog("Gebe die Länge von Seite C ein. ");
                String sInputD = JOptionPane.showInputDialog("Gebe die Länge von Seite D ein. ");
                String sInputH = JOptionPane.showInputDialog("Gebe die Länge von Hähe h ein. ");
                double inputA = Double.parseDouble(sInputA);
                double inputB = Double.parseDouble(sInputB);
                double inputC = Double.parseDouble(sInputC);
                double inputD = Double.parseDouble(sInputD);
                double inputH = Double.parseDouble(sInputH);

                double ergebnisUmfang = inputA + inputB + inputC + inputD;
                double ergebnisFlaecheninhalt = (( inputA + inputC ) * inputH) /2;
                
                JOptionPane.showMessageDialog(null, "Der Flächeninhalt beträgt: " + ergebnisFlaecheninhalt + " und der Umfang beträgt: " + ergebnisUmfang + ".");

            } else if (sInput.equals("Kreis")) {

                String sInputR = JOptionPane.showInputDialog("Gebe den Radius des Kreises an.");
                double inputR = Double.parseDouble(sInputR);

                double ergebnisUmfang = 2 * inputR * Math.PI;
                double ergebnisFlaecheninhalt = Math.pow(inputR, 2) * Math.PI;

                JOptionPane.showMessageDialog(null, "Der Flächeninhalt beträgt: " + ergebnisFlaecheninhalt + " und der Umfang beträgt: " + ergebnisUmfang + ".");

            } else {
                JOptionPane.showMessageDialog(null, "Bitte gebe folgendes ein: Dreieck, Rechteck, Trapez oder Kreis.");
                valid = false;
            }
        } while (valid == false);

    }


}

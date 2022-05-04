import javax.swing.JOptionPane;

public class Aufgabe4_Arbeitsauftrag1 {
    
    public static void run() {

        //DAS WAS HINTERLEGT WIRD
        double Bildschirm = 700;
        double Prozessor = 500;
        double Grafikkarte = 1500;
        double Maus = 14;

        double brieftasche = 10000;
        //NICHT VERGESSEN AUCH UNTEN IM CODE DAS ZU ÄNDERN!

        double gesamtpreis = 0;

        boolean valid1;
        boolean fertig = false;

        do {
            do {
                valid1 = false;
                String eingabe1 = JOptionPane.showInputDialog("Was möchtest du kaufen? Wenn du zur Kasse gehen möchtest, gebe 'FERTIG' ein");

                if (eingabe1.equals("Bildschirm")) {
                    boolean valid2;
                    do {
                        valid2 = false;
                        String sAmount = JOptionPane.showInputDialog("Wie viele möchtest du kaufen?");
                        int amount = Integer.parseInt(sAmount);

                        if(amount > 0 ) {
                            gesamtpreis = gesamtpreis + amount * Bildschirm;
                            valid1 = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Du hast einen ungültigen Wert eingegeben. Probiere es erneut.");
                        }
                        
                    } while (valid2 = false);

                } else if (eingabe1.equals("Prozessor")) {
                    boolean valid2;
                    do {
                        valid2 = false;
                        String sAmount = JOptionPane.showInputDialog("Wie viele möchtest du kaufen?");
                        int amount = Integer.parseInt(sAmount);

                        if(amount > 0 ) {
                            gesamtpreis = gesamtpreis + amount * Prozessor;
                            valid1 = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Du hast einen ungültigen Wert eingegeben. Probiere es erneut.");
                        }
                        
                    } while (valid2 = false);
                } else if (eingabe1.equals("Grafikkarte")) {
                    boolean valid2;
                    do {
                        valid2 = false;
                        String sAmount = JOptionPane.showInputDialog("Wie viele möchtest du kaufen?");
                        int amount = Integer.parseInt(sAmount);

                        if(amount > 0 ) {
                            gesamtpreis = gesamtpreis + amount * Grafikkarte;
                            valid1 = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Du hast einen ungültigen Wert eingegeben. Probiere es erneut.");
                        }
                        
                    } while (valid2 = false);
                } else if (eingabe1.equals("Maus")) {
                    boolean valid2;
                    do {
                        valid2 = false;
                        String sAmount = JOptionPane.showInputDialog("Wie viele möchtest du kaufen?");
                        int amount = Integer.parseInt(sAmount);

                        if(amount > 0 ) {
                            gesamtpreis = gesamtpreis + amount * Maus;
                            valid1 = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Du hast einen ungültigen Wert eingegeben. Probiere es erneut.");
                        }
                        
                    } while (valid2 = false);

                } else if(eingabe1.equals("FERTIG")) {

                    fertig = true;
                    valid1 = true;

                } else {
                    JOptionPane.showMessageDialog(null, "Gebe bitte eines der folgenden Waren ein: Bildschirm, Prozessor, Grafikkarte und Maus.");
                }



            } while (valid1 == false);

            JOptionPane.showMessageDialog(null, "Dein Momenaner Einkaufskorb hat aktuell folgenden Wert: " + gesamtpreis + "€.");

        } while (fertig == false);

        JOptionPane.showMessageDialog(null, "Die Gesamtsumme beträgt: " + gesamtpreis + "€. Dir wird nun das Geld abgezogen.");

        if (brieftasche < gesamtpreis) {
            JOptionPane.showMessageDialog(null, "Du hast zu wenig Geld, du kannst dir das alles nicht leisten, weil du ein Geringverdiender bist.");
        } else if (brieftasche == gesamtpreis) {
            JOptionPane.showMessageDialog(null, "Oha, gerade noch genug Geld gehabt mein Lieber Kunde!");
        } else if (brieftasche > gesamtpreis) {
            JOptionPane.showMessageDialog(null, "Erfolgreich abgebucht! Haben Sie Spaß!");

        } else {
            JOptionPane.showMessageDialog(null, "Kann es sein dass du ein Hacker bist?");
        }


    }
}

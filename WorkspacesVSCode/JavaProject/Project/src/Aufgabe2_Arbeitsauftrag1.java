import javax.swing.JOptionPane;

public class Aufgabe2_Arbeitsauftrag1 {
    public static void run() {

        int pointsUser = 0;
        int pointsComputer = 0;



        for (int i = 0; i < 5; i++) {

            int zAuswahlUser = 0;

            boolean valid;

            do {
            
                valid = true;                
                
                String sAuswahlUser = JOptionPane.showInputDialog("Schere, Stein oder Papier?");
                switch(sAuswahlUser) {
                    case "Stein": 
                        zAuswahlUser = 0;
                        break;

                    case "Schere":
                        zAuswahlUser = 1;
                        break;

                    case "Papier":
                        zAuswahlUser = 2;
                        break;
                    default: 
                        JOptionPane.showMessageDialog(null, "Du hast etwas falsches eingegeben. Versuche es erneut.");
                        valid = false;
                }
            } while (valid == false);


            double zAuswahlComputer = Math.round( Math.random()* 2 );

            String sAuswahlComputer = "Nichts.";

            if (zAuswahlComputer == 0) {
                sAuswahlComputer = "Stein";
            } else if (zAuswahlComputer == 1) {
                sAuswahlComputer = "Schere";
            } else if (zAuswahlComputer == 2) {
                sAuswahlComputer = "Papier";
            } else { System.out.println("Irgendwie hat sich der Computer verrechnet: " + zAuswahlComputer);}
            
            
        

            switch (zAuswahlUser) {
                case 0: 
                    if(zAuswahlComputer == 2) {
                        pointsComputer++;
                        JOptionPane.showMessageDialog(null, "Der Computer hat die Runde mit " + sAuswahlComputer +  " gewonnen." );
                    } else
                    if(zAuswahlComputer == 1) {
                        pointsUser++;
                        JOptionPane.showMessageDialog(null, "Du hast gegen " + sAuswahlComputer +  " gewonnen." );
                    } else {
                        JOptionPane.showMessageDialog(null, "Ihr beide hattet " + sAuswahlComputer + "." );
                    }
                    break;

                case 1: 
                    
                    if(zAuswahlComputer == 0) {
                        pointsComputer++;
                        JOptionPane.showMessageDialog(null, "Der Computer hat die Runde mit " + sAuswahlComputer +  " gewonnen." );
                    }else
                    if(zAuswahlComputer == 2) {
                        pointsUser++;
                        JOptionPane.showMessageDialog(null, "Du hast gegen " + sAuswahlComputer +  " gewonnen." );
                    }else {
                        JOptionPane.showMessageDialog(null, "Ihr beide hattet " + sAuswahlComputer + "." );
                    }
                    break;

                case 2: 
                    
                    if(zAuswahlComputer == 1) {
                        pointsComputer++;
                        JOptionPane.showMessageDialog(null, "Der Computer hat die Runde mit " + sAuswahlComputer +  " gewonnen." );
                    }else
                    if(zAuswahlComputer == 0) {
                        pointsUser++;
                        JOptionPane.showMessageDialog(null, "Du hast gegen " + sAuswahlComputer +  " gewonnen." );
                    }else {
                        JOptionPane.showMessageDialog(null, "Ihr beide hattet " + sAuswahlComputer + "." );
                    }
                    break;
            }
        }

        if(pointsComputer > pointsUser) {
            JOptionPane.showMessageDialog(null, "Der Computer hat gewonnen. Tut mir leid :(");
        } else if(pointsComputer < pointsUser) {
            JOptionPane.showMessageDialog(null, "Du hast gewonnen! :)");
        } else {
            JOptionPane.showMessageDialog(null, "Lustigerweise gibt es einen Gleichstand. xD");
        }



    }

}

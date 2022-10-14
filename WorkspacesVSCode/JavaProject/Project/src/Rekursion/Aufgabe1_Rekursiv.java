package Rekursion;

public class Aufgabe1_Rekursiv {

    static int fakulität(int n) {
        if (n == 1) {
            return n;
        } else {
            return fakulität(n-1) * n;
        }


    }

    public static void main(String[] args) {

        System.out.print(fakulität(4));

    }

}

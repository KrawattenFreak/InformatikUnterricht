package Rekursion;

public class Aufgabe1_Iterativ {

    static int fakultiät(int n) {

        int ergebnis = 1;

        for(int i = 0; i > n; i++) {
            ergebnis *= i;
        }
        return ergebnis;
    }

    public static void main(String[] args) {

        System.out.println(fakultiät(7));

    }


}

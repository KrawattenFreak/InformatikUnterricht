package JavaKlassen01;

public class Aufgabe02 {

    static int a = 0;
    static int b = 1;


    static int nextFibonacci () {
        int c = a + b;
        a = b;
        b = c;
        return a;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(nextFibonacci());
        }
    }


}

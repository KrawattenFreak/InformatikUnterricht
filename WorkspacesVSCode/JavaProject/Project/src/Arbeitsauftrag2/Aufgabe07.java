package Arbeitsauftrag2;

public class Aufgabe07 {

	public static void runAufgabe07() {
		
		for (int i = 100; i <= 200; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("--------------------------------------");
		
		for (int i = 100; i <= 200; i++) {
			if (i % 5 != 0) {
				if (i % 4 == 0) {
					System.out.println(i);
				}
			}
		}
		
		System.out.println("---------------------------------------");

		
		for (int i = 100; i <= 200; i++) {
			int e = 0;
			for (int j = 1; j <= i/2; j++) {
				if (i%j == 0) {
					e++;
				}
			}
			if(e == 1) {
				System.out.println(i);
			}
			
		}
		
	}
}

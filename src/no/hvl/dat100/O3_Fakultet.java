package no.hvl.dat100;

import java.util.Scanner;

public class O3_Fakultet {

	public static void main(String[] args) {

		Scanner skanner = new Scanner(System.in);
		System.out.println("Skriv inn et positivt fakultet n: ");
		int n = skanner.nextInt();
		
		
		if (n <= 0) {
			System.out.println("Skriv inn en fakultet som er større enn null");
		} else {
			long fakultet = 1;
			for (int i = 1; i <= n; i++) {
				fakultet *= i;
			}
			System.out.println("fakulet av: " + n + " er: " + fakultet);
		}
		skanner.close();
	}

}

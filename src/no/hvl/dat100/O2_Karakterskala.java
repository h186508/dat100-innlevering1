package no.hvl.dat100;

import java.util.Scanner;

public class O2_Karakterskala {

	public static void main(String[] args) {
		Scanner skanner = new Scanner(System.in);
		int poeng;
		
			for (int i = 0; i < 10; i++) {
	            do {
	                System.out.print("Enter points (0-100): ");
	                poeng = skanner.nextInt();
	                if (poeng < 0 || poeng > 100) {
	                    System.out.println("Invalid input. Please try again.");
	                }
	            } while (poeng < 0 || poeng > 100);
	            
	            String Karakter;
	            if (poeng >= 90) {
	            	Karakter = "A";
	            } else if (poeng >= 80) {
	            	Karakter = "B";
	            } else if (poeng >= 60) {
	            	Karakter = "C";
	            } else if (poeng >= 50) {
	            	Karakter = "D";
	            } else if (poeng >= 40) {
	            	Karakter = "E";
	            } else {
	            	Karakter = "F";
	            }
	            System.out.println("Karakter: " + Karakter);
			
		}
		skanner.close();
		}
	}
package application;

import java.util.Scanner;

import entities.EvenNumbers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to enter? ");
		int n = sc.nextInt();
		
		EvenNumbers[] vect = new EvenNumbers[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Input a number: ");
			int number = sc.nextInt();
			vect[i] = new EvenNumbers(number);
		}
		
		System.out.println();
		
		int quantity = 0;
		System.out.println("EVEN NUMBERS:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumber() % 2 == 0) {
				System.out.print(vect[i].getNumber() + "  ");
				quantity += 1;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("EVEN QUANTITY = "+ quantity);
		
		sc.close();
	}

}

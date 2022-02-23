package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double itemPrice, payTend;
		System.out.println("What is the price of them item? ");
		itemPrice = scanner.nextDouble();

		System.out.println("What was the amount tendered? ");
		payTend = scanner.nextDouble();

		if (itemPrice > payTend) {
			System.out.println("Incorrect amount entered, please try again");

		} else if (itemPrice == payTend) {
			System.out.println("Exact change");

		} else if (payTend > itemPrice) {

			double changeDue;
			changeDue = payTend - itemPrice;
			int change100 = (int) changeDue / 100;
			if(change100 != 0) {
				System.out.println("The change in $100 is " + change100);
			}
			changeDue = changeDue % 100;

			int change50 = (int) changeDue / 50;
			if(change50 != 0) {
				System.out.println("The change in $50 is " + change50);				
			}
			changeDue = changeDue % 50;

			int change20 = (int) changeDue / 20;
			if(change20 != 0) {
				System.out.println("The change in $20 is " + change20);	
			}
			changeDue = changeDue % 20;

			int change10 = (int) changeDue / 10;
			if(change10 !=0) {
				System.out.println("The change in $10 is " + change10);
			}
			changeDue = changeDue % 10;

			int change5 = (int) changeDue / 5;
			if(change5 !=0) {
				System.out.println("The change in $5 is " + change5);
			}
			changeDue = changeDue % 5;

			int change1 = (int) changeDue / 1;
			if(change1 != 0) {
				System.out.println("The change in $1 is " + change1);
			}
			changeDue = changeDue % 1;

			changeDue = changeDue * 100;
			changeDue = Math.round(changeDue); 
			int changeQuart = (int)changeDue / 25;
			if(changeQuart != 0) {
				System.out.println("The change in quarters is " + (int) changeQuart);
			}
			changeDue = changeDue % 25;

			int changeDimes = (int)changeDue / 10;
			if(changeDimes != 0) {
				System.out.println("The change in dimes is " + (int) changeDimes);
			}
			changeDue = changeDue % 10;

			int changeNickels = (int)changeDue / 5;
			if(changeNickels != 0) {
				System.out.println("The change in nickels is " + (int) changeNickels);
			}
			changeDue = (int) changeDue % 5;

			int changePennies = (int)changeDue / 1;
			if(changePennies != 0) {
				System.out.println("The change in pennies is " + (int) changePennies);
			}
		}
		scanner.close();

	}
}

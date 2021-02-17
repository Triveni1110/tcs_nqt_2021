package tcs_nqt_2021;

import java.util.Scanner;

public class AutomaticVendingMachine {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to CCD");
		System.out.println("Enter your choice");

		char mainMenu = scan.next().charAt(0);
		int submenu = scan.nextInt();

		switch (mainMenu) {
		case 'c':
			switch (submenu) {
			case 1:
				System.out.println("You have chosen Espresso Cofee");
				break;
			case 2:
				System.out.println("You have chosen Cappuccino Coffee");
				break;
			case 3:
				System.out.println("You have chosen Latte Coffee");
				break;
			default:
				System.out.println("Wrong subMenu choice");
			}
			break;
		case 't':
			switch (submenu) {
			case 1:
				System.out.println("You have chosen Plain Tea");
				break;
			case 2:
				System.out.println("You have chosen Assam Tea");
				break;
			case 3:
				System.out.println("You have chosen Ginger Tea");
				break;
			case 4:
				System.out.println("You have chosen Cardamom Tea");
				break;
			case 5:
				System.out.println("You have chosen Masala Tea");
				break;
			case 6:
				System.out.println("You have chosen Lemon Tea");
				break;
			case 7:
				System.out.println("You have chosen Green Tea");
				break;
			case 8:
				System.out.println("You have chosen Organic Darjeeling Tea");
				break;

			default:
				System.out.println("Wrong subMenu choice");
			}
			break;
		case 's':
			switch (submenu) {
			case 1:
				System.out.println("You have chosen Hot and Sour Soup");
				break;
			case 2:
				System.out.println("You have chosen Veg Corn Soup");
				break;
			case 3:
				System.out.println("You have chosen Tomato Soup");
				break;
			case 4:
				System.out.println("You have chosen Spicy Tomato Soup");
				break;
			default:
				System.out.println("Wrong submenu choice");
			}
			break;
		case 'b':
			switch (submenu) {
			case 1:
				System.out.println("You have chosen Hot Chocolate Drink");
				break;
			case 2:
				System.out.println("You have chosen Badam Drink");
				break;
			case 3:
				System.out.println("You have chosen Badam-Pista Drink");
				break;

			default:
				System.out.println("Wrong submenu choice");
			}
			break;
		default:
			System.out.println("Not valid input");

		}
	}
}

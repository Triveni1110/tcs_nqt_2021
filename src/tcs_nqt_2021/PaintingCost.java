package tcs_nqt_2021;

import java.util.Scanner;

/**
 * Problem Statement
 * 
 * We want to estimate the cost of painting a property. Interior wall painting
 * cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
 * 
 * Take input as 1. Number of Interior walls 2. Number of Exterior walls 3.
 * Surface Area of each Interior 4. Wall in units of square feet Surface Area of
 * each Exterior Wall in units of square feet
 * 
 * If a user enters zero as the number of walls then skip Surface area values as
 * User may don’t want to paint that wall.
 * 
 * Calculate and display the total cost of painting the property
 * 
 * @author hp
 *
 */
public class PaintingCost {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of interior walls:");
		int noOfIwall = scan.nextInt();

		System.out.println("Enter the number of exterior walls:");
		int noOfEwall = scan.nextInt();

		Double irate = 18d;
		Double erate = 12d;

		Double cost = 0d;

		if (noOfEwall < 0 && noOfEwall < 0) {
			System.out.println("INVALID INPUT");
		} else if (noOfEwall == 0 && noOfIwall == 0) {
			System.out.println("" + cost);
		} else {
			while (noOfIwall > 0) {
				cost = cost + (scan.nextDouble()) * irate;
				noOfIwall--;
			}
			while (noOfEwall > 0) {
				cost = cost + (scan.nextDouble()) * erate;
				noOfEwall--;
			}
			System.out.println("" + cost);

		}

	}
}

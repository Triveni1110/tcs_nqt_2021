package tcs_nqt_2021;

import java.util.Scanner;

/**
 * There is a JAR full of candies for sale at a mall counter. JAR has the
 * capacity N, that is JAR can contain maximum N candies when JAR is full. At
 * any point of time. JAR can have M number of Candies where M<=N. Candies are
 * served to the customers. JAR is never remain empty as when last k candies are
 * left. JAR if refilled with new candies in such a way that JAR get full.
 * 
 * Write a code to implement above scenario. Display JAR at counter with
 * available number of candies.
 * 
 * 
 * 
 * Input should be the number of candies one customer can order at point of
 * time. Update the JAR after each purchase and display JAR at Counter.
 * 
 * Output should give number of Candies sold and updated number of Candies in
 * JAR.
 * 
 * If Input is more than candies in JAR, return: “INVALID INPUT”
 * 
 * Given,
 * 
 * N=10, where N is NUMBER OF CANDIES AVAILABLE
 * 
 * K =< 5, where k is number of minimum candies that must be inside JAR ever.
 * 
 * @author hp
 *
 */
public class MaxAvailableCandyJar {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int availableCandies = 10;
		int minRequiredCandies = 5;

		System.out.println("Enter the no of candies required");
		int requestCandies = scan.nextInt();
		int soldCandies = 0;

		// candies available to distribute is between 1 and 5
		if (requestCandies >= 1 && requestCandies <= 5) {
			soldCandies = requestCandies;
			availableCandies = availableCandies - requestCandies;

			System.out.println("Available candies:" + availableCandies);
			System.out.println("Sold candies:" + soldCandies);
		} else {
			System.out.println("INVALID INPUT");
		}
	}

}

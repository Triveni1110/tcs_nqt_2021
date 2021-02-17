package tcs_nqt_2021;

import java.util.Scanner;

/**
 * 
 * Problem Statement
 * 
 * A washing machine works on the principle of Fuzzy System, the weight of
 * clothes put inside it for washing is uncertain But based on weight measured
 * by sensors, it decides time and water level which can be changed by menus
 * given on the machine control area.
 * 
 * For low level water, the time estimate is 25 minutes, where approximately
 * weight is between 2000 grams or any nonzero positive number below that.
 * 
 * For medium level water, the time estimate is 35 minutes, where approximately
 * weight is between 2001 grams and 4000 grams.
 * 
 * For high level water, the time estimate is 45 minutes, where approximately
 * weight is above 4000 grams.
 * 
 * Assume the capacity of machine is maximum 7000 grams
 * 
 * Where approximately weight is zero, time estimate is 0 minutes.
 * 
 * Write a function which takes a numeric weight in the range [0,7000] as input
 * and produces estimated time as output is: “OVERLOADED”, and for all other
 * inputs, the output statement is
 * 
 * “INVALID INPUT”.
 * 
 * Input should be in the form of integer value –
 * 
 * Output must have the following format –
 * 
 * Time Estimated: Minutes
 * 
 * @author hp
 *
 */
public class WashingMachineTime {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int inputWeight = scan.nextInt();

		estimateTime(inputWeight);

	}

	private static void estimateTime(int inputWeight) {

		if (inputWeight >= 0 && inputWeight <= 7000) {
			if (inputWeight == 0) {
				System.out.println("TIME ESTIMATE: 0 min");
			} else if (inputWeight >= 1 && inputWeight <= 2000) {
				System.out.println("TIME ESTIMATE: 25 min");
			} else if (inputWeight >= 2001 && inputWeight <= 4000) {
				System.out.println("TIME ESTIMATE: 35 min");
			} else if (inputWeight > 4000) {
				System.out.println("TIME ESTIMATE: 45 min");
			}
		} else {
			System.out.println("INVALID INPUT");
		}
	}

}

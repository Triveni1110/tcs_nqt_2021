package tcs_nqt_2021;

import java.util.Scanner;

/**
 * Problem Statement
 * 
 * There are total n number of Monkeys sitting on the branches of a huge Tree.
 * As travelers offer Bananas and Peanuts, the Monkeys jump down the Tree. If
 * every Monkey can eat k Bananas and j Peanuts. If total m number of Bananas
 * and p number of Peanuts are offered by travelers, calculate how many Monkeys
 * remain on the Tree after some of them jumped down to eat. At a time one
 * Monkeys gets down and finishes eating and go to the other side of the road.
 * The Monkey who climbed down does not climb up again after eating until the
 * other Monkeys finish eating. Monkey can either eat k Bananas or j Peanuts. If
 * for last Monkey there are less than k Bananas left on the ground or less than
 * j Peanuts left on the ground, only that Monkey can eat Bananas(<k) along with
 * the Peanuts(<j). Write code to take inputs as n, m, p, k, j and return the
 * number of Monkeys left on the Tree. Where, n= Total no of Monkeys k= Number
 * of eatable Bananas by Single Monkey (Monkey that jumped down last may get
 * less than k Bananas) j = Number of eatable Peanuts by single Monkey(Monkey
 * that jumped down last may get less than j Peanuts) m = Total number of
 * Bananas p = Total number of Peanuts Remember that the Monkeys always eat
 * Bananas and Peanuts, so there is no possibility of k and j having a value
 * zero
 * 
 * @author hp
 *
 */
public class MonkeyTraveller {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int totalMonkey = scan.nextInt();
		int oneMonkeyBanana = scan.nextInt();
		int oneMonkeyPeanut = scan.nextInt();
		int totalBanana = scan.nextInt();
		int totalPeanut = scan.nextInt();
		leftMonkey(totalMonkey, totalBanana, totalPeanut, oneMonkeyBanana, oneMonkeyPeanut);
	}

	private static void leftMonkey(int totalMonkey, int totalBanana, int totalPeanut, int oneMonkeyBanana,
			int oneMonkeyPeanut) {
		int availableMonkey = 0;

		if (oneMonkeyBanana > 0)
			availableMonkey = availableMonkey + totalBanana / oneMonkeyBanana;
		if (oneMonkeyPeanut > 0)
			availableMonkey = availableMonkey + totalPeanut / oneMonkeyPeanut;

		System.out.println(availableMonkey);
	}

}

package tcs_nqt_2021;

import java.util.Scanner;

/**
 * Selection of MPCS exams include a fitness test which is conducted on ground.
 * 
 * There will be a batch of 3 trainees, appearing for running test in track for
 * 3 rounds. You need to record their oxygen level after every round.
 * 
 * After trainee are finished with all rounds, calculate for each trainee his
 * average oxygen level over the 3 rounds and select one with highest oxygen
 * level as the most fit trainee.
 * 
 * If more than one trainee attains the same highest average level, they all
 * need to be selected.
 * 
 * Display the most fit trainee (or trainees) and the highest average oxygen
 * level.
 * 
 * Note:
 * 
 * 1.The oxygen value entered should not be accepted if it is not in the range
 * between 1 and 100.
 * 
 * 2.If the calculated maximum average oxygen value of trainees is below 70 then
 * declare the trainees as unfit with meaningful message as
 * 
 * 3.All trainees are unfit. Average Oxygen Values should be rounded.
 * 
 * 
 * implemented using 1-d array but can be best implemeted as 2-d array
 * @author hp
 *
 */
public class MostFitTrainee {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int oxygenArray[] = new int[9];
		int temp = 0;

		for (int i = 0; i < oxygenArray.length; i++) {
			temp = scan.nextInt();
			if (temp >= 1 && temp <= 100) {
				oxygenArray[i] = temp;
			} else {
				System.out.println("NOT VALID");

			}
		}
		for (int i : oxygenArray) {
			System.out.println(i);
		}
		int avgp1 = 0;
		int avgp2 = 0;
		int avgp3 = 0;

		for (int i = 0; i < oxygenArray.length; i++) {
			if (i % 3 == 0) {
				avgp1 = avgp1 + oxygenArray[i];
			} else if (i % 3 == 1) {
				avgp2 = avgp2 + oxygenArray[i];
			} else if (i % 3 == 2) {
				avgp3 = avgp3 + oxygenArray[i];
			}

		}

		avgp1 = Math.round(avgp1 / 3);
		avgp2 = Math.round(avgp2 / 3);
		avgp3 = Math.round(avgp3 / 3);

		int max = 0;
		if (avgp1 < 70 && avgp2 < 70 && avgp3 < 70) {
			System.out.println("All Players are unfit");
		} else {
			max = avgp1;
			if (max > avgp2) {
				if (max > avgp3) {
					System.out.println("Team Player 1 is having maximum oxygen level ie :" + temp);
				} else if (avgp3 > max) {
					System.out.println("Team Player 3 is having max");
				} else if (max == avgp3) {
					System.out.println("team player 1 and 3 both are having same ");
				}
			} else if (max == avgp2) {
				System.out.println("Team player 1 and 2 both are having the same oxygen level");
			} else if (max < avgp2) {
				System.out.println("Team player 2 is having the max oxygen level");
			}

		}
	}

}

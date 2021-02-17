package tcs_nqt_2021;

import java.util.Scanner;

/**
 * Problem Statement
 * 
 * The Caesar cipher is a type of substitution cipher in which each alphabet in
 * the plaintext or messages is shifted by a number of places down the alphabet.
 * For example,with a shift of 1, P would be replaced by Q, Q would become R,
 * and so on. To pass an encrypted message from one person to another, it is
 * first necessary that both parties have the ‘Key’ for the cipher, so that the
 * sender may encrypt and the receiver may decrypt it. Key is the number of
 * OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25
 * positions as there are 26 total alphabets.
 * 
 * As we are designing custom Caesar Cipher, in addition to alphabets, we are
 * considering numeric digits from 0 to 9. Digits can also be shifted by key
 * places. For Example, if a given plain text contains any digit with values 5
 * and key =2, then 5 will be replaced by 7, “-”(minus sign) will remain as it
 * is.
 * 
 * Key value less than 0 should result into “INVALID INPUT”
 * 
 * @author hp
 *
 */
public class CeaserCipher {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the input text:");
		// since we need to give another line of input from the same scan object so its
		// better to use nextLine function else it is will next input from the previous
		// one only
		String originalText = scan.nextLine();

		System.out.println("Enter the key of cipher");
		int key = scan.nextInt();

//		String typeOfKey = (Character.isAlphabetic(key)) ? "alphabet" : "digit";

		ceaserCipher(originalText, key);
	}

	private static void ceaserCipher(String originalText, int key) {

		char[] encryptedArray = new char[originalText.length()];

		for (int i = 0; i < originalText.length(); i++) {
			if (Character.isAlphabetic(originalText.charAt(i))) {
				if (Character.isUpperCase(originalText.charAt(i))) {
					encryptedArray[i] = (char) ((originalText.charAt(i) - 'A' + key) % 26 + 'A');
				}if (Character.isLowerCase(originalText.charAt(i))) {
					encryptedArray[i] = (char) ((originalText.charAt(i) - 97 + key) % 26 + 97);
				}
			} else if (Character.isDigit(originalText.charAt(i))) {
				encryptedArray[i] = (char) ((originalText.charAt(i) + key - '0') % 10 + '0');

			} else {
				encryptedArray[i] = originalText.charAt(i);
			}
		}

		String output = String.valueOf(encryptedArray);
		System.out.println(output);
	}

}

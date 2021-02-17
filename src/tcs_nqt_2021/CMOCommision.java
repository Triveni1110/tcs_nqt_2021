package tcs_nqt_2021;

import java.util.Scanner;

/**
 * Chain Marketing Organization has has a scheme for income generation, through
 * which its members generate income for themselves. The scheme is such that
 * suppose A joins the scheme and makes R and V to join this scheme then A is
 * Parent Member of R and V who are child Members. When any member joins the
 * scheme then the parent gets total commission of 10% from each of its child
 * members. Child members receive commission of 5% respectively. If a Parent
 * member does not have any member joined under him, then he gets commission of
 * 5%. Take name of the members joining the scheme as input. Display how many
 * members joined the scheme including parent member.Calculate the Total
 * commission gained by each members in the scheme. The fixed amount for joining
 * the scheme is Rs.5000 on which commission will be generated SchemeAmount =
 * 5000
 * 
 * @author hp
 *
 */
public class CMOCommision {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		Double fixedSchemeDeposit = 5000d;

		Double commision = 0d;

		String primaryMember = scan.nextLine();

		boolean isParent = scan.nextBoolean();

		String childMember;
		String[] childMemberArray;
		int childNum;
		Double childCommision = 0d;

		if (isParent) {
			childMember = scan.next();
			childMemberArray = childMember.split(",");
			childNum = childMemberArray.length;
			childCommision = fixedSchemeDeposit / 20;
			commision = fixedSchemeDeposit / 10;

			System.out.println("Total Member:" + (1 + childNum));

			System.out.println(" " + primaryMember + " " + commision);

			for (int i = 0; i < childMemberArray.length; i++) {
				System.out.println(" " + childMemberArray[i] + " " + childCommision);
			}
		} else {
			System.out.println("Total Member:" + 1);
			commision = fixedSchemeDeposit / 20;
			System.out.println("" + primaryMember + " " + commision);
		}

	}

}

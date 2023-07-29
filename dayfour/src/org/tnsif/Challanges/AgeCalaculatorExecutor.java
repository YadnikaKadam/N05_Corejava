/*Ask a user for there birth year encoded as 2 digit(like"62") and for the current year,
 * also encoded as 2 digit(like"99")Write a program to find users current age in years
  */

package org.tnsif.Challanges;

import java.util.Scanner;

public class AgeCalaculatorExecutor {
	static void ageCalculator(int by, int cy)
	{
		if(cy>by)
			System.out.println(cy-by);
		else
			System.out.println((100-by)+cy);
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the birthyear and "  +"currentYear");
		int by=s.nextInt();
		int cy=s.nextInt();
		ageCalculator(by,cy);

	}

}

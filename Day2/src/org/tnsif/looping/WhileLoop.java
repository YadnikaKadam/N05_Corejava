//Program to demonstrate on While loop

package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(n>=i)
		{
			System.out.print(n+" ");
			n--;
		}
		
		
		s.close();

	}

}

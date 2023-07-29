/* Pratik is so much intrested in gardening and hence he plants more tress in his garden.
 * He plant trees in rectangular fashion with the order of rows and columns and No the trees in row wise order.
 * He planted the mango tree only in first row first column and last column.So ,given the tree number and 
 * rows and column.Your task to find out whether the given tree is mango tree or not.input n=5 no of
 *  rows and column t=11 tree no.
 *  */

package org.tnsif.Challanges;

import java.util.Scanner;

public class MangoTreeExecutor {
	
	static void isMangoTree(int n, int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a Mango Tree");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of n and t:");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
		
		
		

	}

}

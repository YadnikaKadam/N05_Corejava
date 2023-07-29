package org.tnsif.Challanges;

import java.util.Scanner;

/*There are N people Standing in a Circle waiting to be executed.
 * The counting out begging at some point the circle and proxy around the circle in a fix direction.
 * In each step a certain no of people are skip and next person is executed.
 * The elimination proxys around the circle (which is becoming smaller and smaller as the executed people 
 * are removed ),until only the last person remain, who is given freedong.
 * Given the Total no of person N an a no K which is indicate that k-1 person are skiped and 
 * the K person killed in circle.The task are choose the person initial circle that survive*/
public class CircleChallange {
	
	static int survive(int n, int k)
	{
		if(n==1)
			return 1;
		else
			return (survive(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));

	}

}

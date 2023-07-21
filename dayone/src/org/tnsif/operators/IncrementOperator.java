//Program to demonstrate on pre and post increment

package org.tnsif.operators;

public class IncrementOperator {

	public static void main(String[] args) {
		int p=11, q=2;
		int x=p++;
		int y=p+q;
		++q;
		System.out.println(p);
		System.out.println(q);
	}

}

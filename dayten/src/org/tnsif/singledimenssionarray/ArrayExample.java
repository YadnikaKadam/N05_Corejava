package org.tnsif.singledimenssionarray;
//program to demonstrate on array using compile-time input value
public class ArrayExample {

	public static void main(String[] args) {
		//declaration and initialization of an array at compile time
		int arr[]= {44,24,53,2,45};
		System.out.println("The array of 2nd index is:"+arr[2]);
		//to print all the values of an array
		for(int i:arr)
		{
			System.out.println(i+"");
		}
		

	}

}

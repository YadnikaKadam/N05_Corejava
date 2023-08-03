//Program to demonstrate on Compile time Polymorphism 
package org.tnsif.polymorphism;

import java.util.Scanner;

class Bollywood
{
	String str1, str2 , str3;
	//method overloading based on changing the no.of arguments 
	static void display(String str1, String str2)
	{
		System.out.println(str1+" Loves "+str2);
	}
	static void display(String str1, String str2, String str3)
	{
		System.out.println(str1+" Loves "+str2+" As well As "+str3);
	}
	
}

//driver class

public class MethodOverloading {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		Bollywood.display(str1,str2);
		Bollywood.display(str1,str2,str3);
		s.close();
		

	}

}

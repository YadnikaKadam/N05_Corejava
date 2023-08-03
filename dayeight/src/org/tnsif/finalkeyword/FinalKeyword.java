package org.tnsif.finalkeyword;
//Program to demonstrate on final Keyword with variable
public class FinalKeyword {
	
	//The blank final field NUM may not have been initialized
	//final int NUM;
	final float SALARY=78000.67f;
	
	public void print()
	{
		//SALARY=76544.98f; we can't change the value of final variable
		System.out.println("Salary is:"+SALARY);
	}

}

package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	
	int x;
	ThisKeywordDemoFour()
	{
		//invoking current
		this(34);
		System.out.println("Default Constructor");
	}
	ThisKeywordDemoFour(int x)
	{
		this.x=x;
		System.out.println("Parameterize Constructor:"+x);
	}

	public static void main(String[] args) {
		ThisKeywordDemoFour t=new ThisKeywordDemoFour();
		
		

	}

}

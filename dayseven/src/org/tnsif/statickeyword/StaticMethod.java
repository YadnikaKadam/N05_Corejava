package org.tnsif.statickeyword;

public class StaticMethod {
	
	int x=2;
	static String clgname="MET";
	/*If any method outside the main fun and if you want to access that method
	 * inside main function, we have to make that method as a static*/
	public static void print()
	{
		System.out.println(clgname);
		/*We can't use non-static variable inside any
		 * static method*/
		//System.out.println(x);
		
	}

	public static void main(String[] args) {
		print();

	}

}

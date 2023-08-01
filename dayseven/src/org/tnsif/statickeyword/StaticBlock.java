package org.tnsif.statickeyword;

public class StaticBlock {
	
	static float salary;
	String companyName;
	/*static block is used to initialize the staticc variable
	 * we can't assign a value for any non-static variable inside */
	static {
		//companyName="Accenture";
		salary=56748.53f;
		
	}
	static void print()
	{
		System.out.println(salary);
	}

	public static void main(String[] args) {
		print();

	}

}

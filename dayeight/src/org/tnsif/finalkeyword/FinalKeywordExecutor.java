package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalKeyword f=new FinalKeyword();
		//SALARY=76544.98f; we can't change the value of final variable
		f.print();
		
		Cricle c=new Cricle();
		c.printTypeShape();
		c.printTypeShape(c.area);
		

	}

}

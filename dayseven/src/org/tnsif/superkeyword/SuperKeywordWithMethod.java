package org.tnsif.superkeyword;

class Sports
{
	String sportsName="Cricket";
	void display()
	{
		System.out.println("Sports name is:"+sportsName);
	}
}
class Cricket extends Sports
{
	int noOfPlayer=11;
	void display()
	{
		/*if parent and child class methods are same and if we want to 
		 * call parent class method inside the child class then use
		 * super.methodname */
		
		super.display();
		System.out.println("No. Of Player is:"+noOfPlayer);
	}
	
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		c.display();

	}

}

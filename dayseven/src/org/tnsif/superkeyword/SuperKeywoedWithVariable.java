package org.tnsif.superkeyword;

class State
{
	String statename="Punjab";
	
}
class Capital extends State
{
	String statename="Hariyana";
	String capital="Chanigarh";
	
	public void display()
	{
		/*super keyword with variable is used to call parent class
		 * variable if and only if parent and child class variable name
		 * are same*/
		System.out.println(super.statename); //punjab
		System.out.println(statename); //hariyana
		
	}
}
//driver class
public class SuperKeywoedWithVariable {

	public static void main(String[] args) {
		Capital c=new Capital();
		c.display();
		
	}

}

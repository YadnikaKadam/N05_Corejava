// Driver class
//program to demonstrate Class and Object

package org.tnsif.classobj;

public class SandwichExecutor {
	public static void main(String[] args) {
		
		//object creation
		Sandwich obj= new Sandwich();
		obj.breadType="Brown bread";
		obj.noOfSlice=6;
		
		//method call
		obj.display();
	}

}

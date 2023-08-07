package org.tnsif.interfacedemo;

public interface DebitCard {
	/*BY DEFAULT ALL THE VARIABLE INSIDE AN INTERFACE IS PUBLIC STATIC FINAL
	 * AND IF IT FINAL THEN WE MUST HAVE TO INITIALIZED VALUE FOR THAT VARIABLE*/
	long cardno=7654338975L;
	// we can't use concrete method inside an interface 
		//by default , method inside an interface is an abstract
	void displayCardDetails();
	/*default method and static method is the new features of java8
	which can use , inside an interface*/
	default void display()
	{
		System.out.println("Default method");
	}
	//static method 
	static void print()
	{
		System.out.println("Static method");
	}

}

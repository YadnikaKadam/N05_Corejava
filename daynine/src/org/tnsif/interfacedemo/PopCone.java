package org.tnsif.interfacedemo;
/*Functional interface
 * An interface which contains an exactly one abstract method then that 
 * interface is known as functional interface*/

/*below annotation ensure that we have to use exactly one abstract method inside an interface*/
@FunctionalInterface
public interface PopCone {
	//abstract method
	void displayReceipe();
	
	//void display();

}

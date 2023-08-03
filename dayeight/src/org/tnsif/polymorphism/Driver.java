package org.tnsif.polymorphism;
// we can't override any static method
public class Driver {

	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.eat();
		t.run(); // we can't override any static method

	}

}

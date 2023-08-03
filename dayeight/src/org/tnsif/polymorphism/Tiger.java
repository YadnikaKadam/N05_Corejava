package org.tnsif.polymorphism;

public class Tiger extends Animal{
	void eat()
	{
		System.out.println("eating:child");
	}
	// we can't override any static method
	static void run()
	{
		System.out.println("run:child");
	}

}

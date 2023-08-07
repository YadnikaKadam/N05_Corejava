package org.tnsif.interfacedemo;
//driver class
//program to demonstrate on an interface
public class InterfaceExecutor {

	public static void main(String[] args) {
		/*we can't create an interface
		 * DebitCard d=new DebitCard();*/
		
		SBIDebitCard s=new SBIDebitCard();
		s.displayCardDetails();
		/*we can call default method of an interface using the obj of implementable class*/
		s.display();
		/*Print is a static method inside an interface to call print()
		 * method , we have to use interfacename.method name()*/
		DebitCard.print();
		
		CheesePopCorn c=new CheesePopCorn();
		c.displayReceipe();
		
		Person p=new Person();
		p.showDrinkNaame();
		
		
	}

}

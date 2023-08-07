package org.tnsif.interfacedemo;
//implement class or child class
//program to demonstrate
public class Person  implements ColdDrink, Alcohol{

	@Override
	public void showDrinkNaame() {
		System.out.println(brand+"" +alcoholname+"" +name);
		
	}

}

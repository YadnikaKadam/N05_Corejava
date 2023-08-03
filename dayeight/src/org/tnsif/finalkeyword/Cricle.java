package org.tnsif.finalkeyword;

public class Cricle extends Shape{
	
	final float area=36.6f;
	//final method
	//Can not override the final method from shape
	/*void printShapeType()
	{
		System.out.println(shapeName);
	}*/
	public void printTypeShape(float area)
	{
		System.out.println(area +"sq.cm");
	
	}

}

//It can be used to refer instance variable of current class

package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
		//default variable
	int x,y;
	
	void setData(int x, int y)
	{
		//we can change also parameter like a,b  Or x=a and y=b
		this.x=x;
		this.y=y;
		
	}
	void display()
	{
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		ThisKeywordDemoOne t=new ThisKeywordDemoOne();
		t.setData(3,4);
		t.display();

	}

}

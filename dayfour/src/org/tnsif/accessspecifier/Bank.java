//Program to demonstrate on Access Specifier

package org.tnsif.accessspecifier;
public class Bank {
	//different access specifier
	public String bankName;
	private int pinNo;
	long accountNo=233521564322355L;
	//public method
	public void displayPublic()
	{
		System.out.println("Bank Name is: "+bankName);
		
	}
	//private method
	private void displayPrivate()
	{
		System.out.println("Pin No. is:"+pinNo);
	}
	//Default Method
	void displayDefault()
	{
		System.out.println("Account No. is:"+accountNo);
	}
	
	 
	
}

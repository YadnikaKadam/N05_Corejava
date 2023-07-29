//Program to demonstrate on Encapsulation
/*Encapsulation achieves the data hiding using private
 * access specifier
 */
package org.tnsif.encapsulation;

public class HDFC {
	//private data member
	private long accountNo;
	private int cvvNo;
	private String accountType;
	private int pinNo;
	
	//getters and setters
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "HDFC [accountNo=" + accountNo + ", cvvNo=" + cvvNo + ", accountType=" + accountType + ", pinNo=" + pinNo
				+ "]";
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

}

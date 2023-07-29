//Program to demonstrate on Access Specifier
//Bank driver class

package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifier.Bank;

public class BankExecuter {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.bankName="SBI";
		b.displayPublic();
		
		/*pinNo and displayPrivate() method are private,
		 * so we can't access into another class and
		 * another package, only we can access private
		 * data members inside the same class*/
		//b.pinNo;
		//b.displayPrivate()
		
		/*Account No and displayDefault() method are default that why,
		 * We are not able to access into another package 
		 * only we can access within the same package*/
		//b.accountNo;
		//b.displayDefault();
	}

}

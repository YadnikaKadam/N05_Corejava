//Program to demonstrate on Default and Parameterize constructor

package org.tnsif.classobj;

public class Citizen {
	//data members
	String citizenType;
	long aadharNo;
	String gender;
	String city;
	//default constructor
		Citizen()
		{
			System.out.println("Demonstration on default constructor");

		}

    //Parameterize Constructor
	public Citizen(String citizenType, long aadharNo, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}

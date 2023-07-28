package org.tnsif.singleinheritance;
//Derived class
public class Student  extends Citizen{
	
	//private data members
	private int rollno;
	private String collageName;
	
	public Student()
	{
		//super()- It calls to parent class default constructor
		super();
		System.out.println("Child class-Default Constructor");
	}
	//parameterized constructor
	public Student(String city, int pincode, long aadharNo, long contactNo, int rollno, String collageName)
	{
		super(city, pincode, aadharNo, contactNo);
		this.rollno=rollno;
		this.collageName=collageName;
		
	}
	//getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collageName=" + collageName + ", toString()=" + super.toString() + "]";
	}
	
	
	

}

package org.tnsif.hierarchicalinheritance;
//child class
public class Snowcone extends Android{
	
	private int version;
	//getters and setters
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Snowcone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	//parameterized constructor

	public Snowcone(String brandName, String slotType,int version) {
		super(brandName, slotType);
		this.version=version;
	}

	
	
	
}

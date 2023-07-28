package org.tnsif.hierarchicalinheritance;
//base class
public class Android {
	
	private String brandName;
	private String slotType;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	@Override
	public String toString() {
		return "Android [brandName=" + brandName + ", slotType=" + slotType + ", toString()=" + super.toString() + "]";
	}
	public Android() {
		super();
		System.out.println("Default Constructor")
	}
	public Android(String brandName, String slotType) {
		super();
		this.brandName = brandName;
		this.slotType = slotType;
	}
	
	

}

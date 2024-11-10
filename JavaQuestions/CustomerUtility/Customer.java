//DO NOT ADD/EDIT THE CODE 

public class Customer {
	private String name;
	private String address;
	private String pinCode;
	private String productType;
	private int warrantyPeriod;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	public Customer(String name, String address, String pinCode, String productType, int warrantyPeriod) {
		super();
		this.name = name;
		this.address = address;
		this.pinCode = pinCode;
		this.productType = productType;
		this.warrantyPeriod = warrantyPeriod;
	}	 	  	      	 		     	     	        	 	
	
	public Customer()
	{
		super();
	}
	@Override
	public String toString() {
		return name+" "+address+" "+pinCode+" "+productType+" "+warrantyPeriod;
	}
	
}	
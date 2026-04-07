package inventoryHome;

public class Home {

	private int squareFeet;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String modelName;
	private String saleStatus;
	
	public Home() {
		squareFeet = 0;
		address = "NO ADDRESS";
		city = "NO CITY";
		state = "NO STATE";
		zipCode = "NO ZIP";
		modelName = "NO MODEL NAME";
		saleStatus = "NO SALE STATUS";
		
	}
	public Home(int setSquareFeet, String setAddress, String setCity, String setState, String setZip, String setModelName, String setSaleStatus) {
		this.squareFeet = setSquareFeet;
		this.address = setAddress;
		this.city = setCity;
		this.state = setState;
		this.zipCode = setZip;
		this.modelName = setModelName;
		this.saleStatus = setSaleStatus;
	}
	public int getSquareFeet() {
		return squareFeet;
	}
	
	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getSaleStatus() {
		return saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}
	public String toString() {
		return ("Address: "+ this.getAddress() + " |City: " + this.getCity() + " |State: " + this.getState() + " |Zip Code: " + this.getZipCode() +
				" |Model Name: " + this.getModelName() + " |Square Footage: " + this.getSquareFeet() + " |Sale Status: " + this.getSaleStatus());
	}
}

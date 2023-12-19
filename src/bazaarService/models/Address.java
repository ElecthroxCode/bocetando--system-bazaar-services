package bazaarService.models;

public class Address {
	private String street;
	private String numberHouse;
	private String sector;
	
	public Address() {
		super();
	}
	public Address(String street, String numberHouse, String sector) {
		super();
		this.street = street;
		this.numberHouse = numberHouse;
		this.sector = sector;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumberHouse() {
		return numberHouse;
	}
	public void setNumberHouse(String numberHouse) {
		this.numberHouse = numberHouse;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	@Override
	public String toString() {
		return "DIRECCIÓN [street=" + street + ", numberHouse=" + numberHouse + ", sector=" + sector + "]";
	}
	
}

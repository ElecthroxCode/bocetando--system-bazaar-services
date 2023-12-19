package bazaarService.models;

public class Customer extends User{
	private String DNI;

	
	public Customer() {
		super();
	}
	

	public Customer(Long id, String fullname, String phone, String email, Address address) {
		super(id, fullname, phone, email, address);
	}

	

	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	@Override
	public String toString() {
		return "Customer [DNI=" + DNI + super.toString() + "]";
	}
	 
	
}

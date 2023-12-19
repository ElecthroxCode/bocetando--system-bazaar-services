package bazaarService.models;

public abstract  class User {
	protected Long id;
	protected String fullname;
	protected String phone;
	protected String email, rol = "cliente";
	protected Address address = new Address();
	
	
	public User() {
		super();
	}

	public User(Long id, String fullname, String phone, String email, Address address) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "id=" + id + ", fullname=" + fullname + ", phone=" + phone + ", email=" + email + ", rol=" + rol
				+ ", address=" + address;
	}
	
	
}

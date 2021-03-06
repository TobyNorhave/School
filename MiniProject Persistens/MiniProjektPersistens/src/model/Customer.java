package model;

public class Customer {
	private Integer id;
	private String name;
	private String address;
	private String zipcode;
	private String city;
	private String phoneno;
	private String email;
	
	public Customer(Integer id, String name, String address, String zipcode, String city, String phoneno, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.phoneno = phoneno;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", zipcode=" + zipcode + ", city=" + city
				+ ", phoneno=" + phoneno + ", email=" + email + "]";
	}

	

}

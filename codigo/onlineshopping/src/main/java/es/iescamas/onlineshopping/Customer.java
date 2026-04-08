package es.iescamas.onlineshopping;

public class Customer {
	private String id;
	private Address address;
	private Phone phone;
	private String email;
	private Account account;
	private Web_User web_user;

	public Customer(String id, Address address, Phone phone, String email, Account account, Web_User web_user) {
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.account = account;
		this.web_user = web_user;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Phone getPhone() {
		return phone;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Web_User getWeb_user() {
		return web_user;
	}
	
	public void setWeb_user(Web_User web_user) {
		this.web_user = web_user;
	}
	
}

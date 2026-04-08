package es.iescamas.onlineshopping;

public class Web_User {
	private String login_id;
	private String password;
	private UserState state;
	private Customer customer;
	private Shopping_Cart shopping_cart;
	
	public Web_User(String login_id, String password, UserState state, Customer customer, Shopping_Cart shopping_cart) {
		this.login_id = login_id;
		this.password = password;
		this.state = state;
		this.customer = customer;
		this.shopping_cart = shopping_cart;
	}
	
	public String getLogin_id() {
		return login_id;
	}
	
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserState getState() {
		return state;
	}
	
	public void setState(UserState state) {
		this.state = state;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Shopping_Cart getShopping_cart() {
		return shopping_cart;
	}
	
	public void setShopping_cart(Shopping_Cart shopping_cart) {
		this.shopping_cart = shopping_cart;
	}
	
}

package es.iescamas.onlineshopping;

import java.sql.Date;

public class Account {
		private String id;
		private Address billing_address;
		private Boolean is_closed;
		private Date open;
		private Date close;
		private Customer customer;
		private Order order;
		private Payment payment;
		private Shopping_Cart shopping_cart;
		
		public Account(String id, Address billing_address, Boolean is_closed, Date open, Date close, Customer customer, Order order, Payment payment, Shopping_Cart shopping_cart) {
			this.id = id;
			this.billing_address = billing_address;
			this.is_closed = is_closed;
			this.open = open;
			this.close = close;
			this.customer = customer;
			this.order = order;
			this.payment = payment;
			this.shopping_cart = shopping_cart;
		}
		
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		
		public Address getBilling_address() {
			return billing_address;
		}
		
		public void setBilling_address(Address billing_address) {
			this.billing_address = billing_address;
		}
		
		public Boolean getIs_closed() {
			return is_closed;
		}
		
		public void setIs_closed(Boolean is_closed) {
			this.is_closed = is_closed;
		}
		
		public Date getOpen() {
			return open;
		}
		
		public void setOpen(Date open) {
			this.open = open;
		}
		
		public Date getClose() {
			return close;
		}
		
		public void setClose(Date close) {
			this.close = close;
		}
		
		public Customer getCustomer() {
			return customer;
		}
		
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		
		public Order getOrder() {
			return order;
		}
		
		public void setOrder(Order order) {
			this.order = order;
		}
		
		public Payment getPayment() {
			return payment;
		}
		
		public void setPayment(Payment payment) {
			this.payment = payment;
		}
		
		public Shopping_Cart getShopping_cart() {
			return shopping_cart;
		}
		
		public void setShopping_cart(Shopping_Cart shopping_cart) {
			this.shopping_cart = shopping_cart;
		}
	}

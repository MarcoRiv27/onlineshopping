package es.iescamas.onlineshopping;

import java.sql.Date;

public class Payment {
	private String id;
	private Date paid;
	private Real roral;
	private String details;
	private Order order;
	private Account account;
	
	public Payment(String id, Date paid, Real roral, String details, Order order, Account account) {
		this.id = id;
		this.paid = paid;
		this.roral = roral;
		this.details = details;
		this.order = order;
		this.account = account;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getPaid() {
		return paid;
	}

	public void setPaid(Date paid) {
		this.paid = paid;
	}

	public Real getRoral() {
		return roral;
	}

	public void setRoral(Real roral) {
		this.roral = roral;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
}

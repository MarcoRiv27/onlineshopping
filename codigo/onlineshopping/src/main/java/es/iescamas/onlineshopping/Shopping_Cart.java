package es.iescamas.onlineshopping;

import java.sql.Date;

public class Shopping_Cart {
private Date created;
private Web_User web_user;
private Customer customer;
private Account account;
private Line_Item line_item;

private	Shopping_Cart(Date created, Web_User web_user, Customer customer, Account account, Line_Item line_item) {
    this.created = created;
    this.web_user = web_user;
    this.customer = customer;
    this.account = account;
    this.line_item = line_item;
	}

public Date getCreated() {
	return created;
}

public void setCreated(Date created) {
	this.created = created;
}

public Web_User getWeb_user() {
	return web_user;
}

public void setWeb_user(Web_User web_user) {
	this.web_user = web_user;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public Line_Item getLine_item() {
    return line_item;
}

public void setLine_item(Line_Item line_item) {
    this.line_item = line_item;
    
}

}
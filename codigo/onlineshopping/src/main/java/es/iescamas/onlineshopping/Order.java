package es.iescamas.onlineshopping;

import java.sql.Date;

public class Order {
private String number;
private Date ordered;
private Date Shipped;
private Address ship_to;
private OrderStatus status;
private Real total;
private Payment payment;
private Account account;
private LineItem line_item;

public Order(String number, Date ordered, Date shipped, Address ship_to, OrderStatus status, Real total, Payment payment, Account account, LineItem line_item) {
    this.number = number;
    this.ordered = ordered;
    Shipped = shipped;
    this.ship_to = ship_to;
    this.status = status;
    this.total = total;
    this.payment = payment;
    this.account = account;
    this.line_item = line_item;
	}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public Date getOrdered() {
	return ordered;
}

public void setOrdered(Date ordered) {
	this.ordered = ordered;
}

public Date getShipped() {
	return Shipped;
}

public void setShipped(Date shipped) {
	Shipped = shipped;
}

public Address getShip_to() {
	return ship_to;
}

public void setShip_to(Address ship_to) {
	this.ship_to = ship_to;
}

public OrderStatus getStatus() {
	return status;
}

public void setStatus(OrderStatus status) {
	this.status = status;
}

public Real getTotal() {
	return total;
}

public void setTotal(Real total) {
	this.total = total;
}

public Payment getPayment() {
	return payment;
}

public void setPayment(Payment payment) {
	this.payment = payment;
}

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public LineItem getLine_item() {
	return line_item;
}

public void setLine_item(LineItem line_item) {
	this.line_item = line_item;
}
    

}

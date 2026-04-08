package es.iescamas.onlineshopping;

public class Line_Item {
private Integer quantity;
private Price price;
private Product product;
private Order order;
private Shopping_Cart shopping_cart;

public Line_Item(Integer quantity, Price price, Product product, Order order, Shopping_Cart shopping_cart) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
    this.order = order;
    this.shopping_cart = shopping_cart;
	}

public Integer getQuantity() {
	return quantity;
}

public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

public Price getPrice() {
	return price;
}

public void setPrice(Price price) {
	this.price = price;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

public Order getOrder() {
	return order;
}

public void setOrder(Order order) {
	this.order = order;
}

public Shopping_Cart getShopping_cart() {
	return shopping_cart;
}

public void setShopping_cart(Shopping_Cart shopping_cart) {
	this.shopping_cart = shopping_cart;
}
   
    
}


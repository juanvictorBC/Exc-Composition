package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	
	
	//compositions >>>
	private Client client;
	
	List<OrderItem> items = new ArrayList<OrderItem>();
	
	
	//contructors >>>
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment =  new Date();
		this.status = status;
		this.client = client;
	}

	//getter and setter >>>
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	//methods

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem lista : items) {
			sum += lista.subTotal();
		}
		return sum;
	}
	
	
	
	
}

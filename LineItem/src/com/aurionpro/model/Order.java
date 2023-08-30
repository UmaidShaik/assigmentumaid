package com.aurionpro.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.*;

public class Order {
	private int id;
	private String date;
	private List<LineItem> items;
	public Order(int id, String date, List<LineItem> items) {
		super();
		this.id = id;
		this.date = date;
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	
	public double CalculateOrderPrice() {
		double totalOrderPrice = 0;
		totalOrderPrice = items.stream().collect(Collectors.summingDouble(LineItem::calculateLineItemCost)) ;
		
        return totalOrderPrice;		
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", items=" + items + "]";
	}
	

}

package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;


public class CustomerTest {

	private static final Product yes = null;

	public static void main(String[] args) {
		List<LineItem> itemList1 = Arrays.asList(
			    new LineItem(01, 3, new Product(1, "coca-cola", 70, 10)), // 90
			    new LineItem(02, 4, new Product(2, "Oats", 100, 10))); // 90
			  
			  List<LineItem> itemList2 = Arrays.asList(
			    new LineItem(01, 2, new Product(1, "Butter", 100, 10)), //90
			    new LineItem(02, 3, new Product(2, "Milk", 100, 10))); //90
			  
			  List<Order> ord1 = Arrays.asList(
			    new Order(11, "2023-01-01", itemList1),
			    new Order(12, "2023-02-01", itemList2));
			  Customer cust1 = new Customer(101, "Umaid", ord1);
			  
			  System.out.println(cust1);
			  System.out.println(cust1.CalculateOrderPrice());
		
	
	}

}

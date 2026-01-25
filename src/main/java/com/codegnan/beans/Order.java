package com.codegnan.beans;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Order {

	private String orderId;
	private String orderName;
	private Customer customer;
	private Item item;
	
	public void displayOrderDetails() {
		System.out.println("Order Details");
		System.out.println("-------------");
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Name: "+orderName);
		System.out.println();
		customer.displayCustomerDetails();
		System.out.println();
		item.displayItemDetails();
	}
}

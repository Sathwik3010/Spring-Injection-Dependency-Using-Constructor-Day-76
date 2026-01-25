package com.codegnan.beans;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Customer {
	private String customerId;
	private String customerName;
	private String customerAddress;
	private String customerMobileNo;

	public void displayCustomerDetails() {
		System.out.println("Customer Details");
		System.out.println("-----------------");
		System.out.println("Customer Id: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Address: " + customerAddress);
		System.out.println("Customer Mobile Number: " + customerMobileNo);
	}

}
package com.codegnan.beans;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item {
	private String itemId;
	private String itemName;
	private String itemPrice;
	
	public void displayItemDetails() {
		System.out.println("Item Details");
		System.out.println("--------------");
		System.out.println("Item Id: "+itemId);
		System.out.println("ItemName : "+itemName);
		System.out.println("ItemPrice : "+itemPrice);
	}
}

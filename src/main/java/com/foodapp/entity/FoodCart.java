package com.foodapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="foodcart_master")
public class FoodCart 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cartid")
	private int cartId;
	
//	List<Item> itemList;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "customerId", referencedColumnName = "id")
	
	
//	private Customer customer;
//	
//	public Customer getCustomer() 
//	{
//		return customer;
//	}
//	public void setCustomer(Customer customer)
//	{
//		this.customer = customer;
//	}
//	public List<Item> getItemList() 
//	{
//		return itemList;
//	}
//	public void setItemList(List<Item> itemList)
//	{
//		this.itemList = itemList;
//	}
	
}

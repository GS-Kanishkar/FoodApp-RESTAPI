package com.foodapp.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name="orders_master")
public class OrderDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int orderId;
	
	@Column(name="order_date") 
	private LocalDateTime orderDate;
	
	
	@Column(name="order_status")
	private String orderStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cartId", referencedColumnName = "cartid")
	private FoodCart cart;
	
	public int getOrderId() 
	{
		return orderId;
	}
	public void setOrderId(int orderId) 
	{
		this.orderId = orderId;
	}
	public LocalDateTime getOrderDate() 
	{
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate)
	{
		this.orderDate = orderDate;
	}
	public FoodCart getCart()
	{
		return cart;
	}
	public void setCart(FoodCart cart) 
	{
		this.cart = cart;
	}
	public String getOrderStatus() 
	{
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus)
	{
		this.orderStatus = orderStatus;
	}
}





package com.foodapp.service;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.dao.IOrderRepository;
import com.foodapp.entity.OrderDetails;



@Service
public class IOrderServiceImpl implements IOrderService
{
	@Autowired
	private IOrderRepository repository;

	
	@Override
	public OrderDetails addOrder(OrderDetails order)
	{
		
		return repository.save(order);
	}

	
	@Override
	public OrderDetails updateOrder(OrderDetails order)
	{
		OrderDetails ord =repository.findById(order.getOrderId()).orElseThrow(
				() -> new EntityNotFoundException("no order found by the id"));
		ord.setOrderStatus(order.getOrderStatus());
		return repository.save(ord); 
	}
	
	
	
	@Override
	public void removeOrder(int orderid) 
	{
		OrderDetails ord = repository.findById(orderid).orElseThrow(
				() -> new EntityNotFoundException("No order found"));
		repository.delete(ord); 
		
	}


	@Override
	public OrderDetails viewOrder(int orderid) 
	{
		return repository.findById(orderid).get();
	}
}

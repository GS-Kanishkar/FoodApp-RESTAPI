package com.foodapp.service;

import java.util.List;

import com.foodapp.entity.Customer;

public interface ICustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public void removeCustomer(int custid);
	public Customer viewCustomer(int custid);
	public List<Customer> viewAllCustomer();
	public List<Customer> getAllCustomer();
}

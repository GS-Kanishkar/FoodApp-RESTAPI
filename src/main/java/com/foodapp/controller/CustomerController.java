package com.foodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.entity.Customer;

import com.foodapp.service.CustomerServiceImpl;

@RestController
public class CustomerController {
	@Autowired
		CustomerServiceImpl custService;
		
		@PostMapping("/customer")
		public void addCustomer(@RequestBody Customer cust) {	
		custService.addCustomer(cust);
		}
		
		
		@GetMapping("/customers") 
		public List<Customer> getAllCustomers(){
			return custService.getAllCustomer();
	     }
		
		
		@GetMapping("/customer/{custid}")
		public Customer getCustomerById(@PathVariable("custid")int custid) {
			return custService.viewCustomer(custid);
		}
		
		
		@DeleteMapping("/customer/{catid}") 
		public void deleteCustomer(@PathVariable int catid) {
			  custService.removeCustomer(catid);
		 }
		  
		  
		 @PutMapping("/customer")
		 public Customer updateCustomer(@RequestBody Customer cust) { 
			  return custService.updateCustomer(cust); 
		  }
}
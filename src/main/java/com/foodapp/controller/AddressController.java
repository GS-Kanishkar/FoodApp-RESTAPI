package com.foodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.entity.Address;
import com.foodapp.service.IAddressServiceImpl;


@RestController
public class AddressController {

	@Autowired
	IAddressServiceImpl addressService;
	
	@GetMapping("/address") 
	public List<Address> viewAllAddress(){
		return addressService.viewAllAddress();
     }
	
	@PostMapping("/address")
	public void addAddress(@RequestBody Address addr) {	
	addressService.addAddress(addr);
	}
}

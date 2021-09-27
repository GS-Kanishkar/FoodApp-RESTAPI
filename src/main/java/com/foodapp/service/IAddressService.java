package com.foodapp.service;

import java.util.List;

import com.foodapp.entity.Address;




public interface IAddressService {

	public List<Address> viewAllAddress();
	public Address addAddress(Address address);
	
}

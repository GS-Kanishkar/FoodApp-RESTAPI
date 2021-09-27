package com.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.dao.IAddressRepository;
import com.foodapp.entity.Address;


@Service
public class IAddressServiceImpl implements IAddressService {

	@Autowired
	private IAddressRepository addressRepository;
	
	@Override
	public List<Address> viewAllAddress() {
		return (List<Address>) addressRepository.findAll();
	}

	@Override
	public Address addAddress(Address address) {
		
		return addressRepository.save(address);
	}
	
	
}

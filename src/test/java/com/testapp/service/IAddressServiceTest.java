package com.testapp.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.foodapp.dao.IAddressRepository;
import com.foodapp.entity.Address;
import com.foodapp.service.IAddressServiceImpl;



@ExtendWith(MockitoExtension.class)
class IAddressServiceTest {

	@Mock
	private IAddressRepository addressRepository;
	@InjectMocks
	private IAddressServiceImpl addressService;
	
	//get all address
	@Test
	void getAllAddressTest() {
		List<Address> list=new ArrayList<Address>();
		
		Address address1 = new Address(1, "1878/2", "West 4th Street", "Thilagar thidal","Chennai", "Tamilnadu","India", "517dd506");
		Address address2 = new Address(2, "1908/3", "East 2nd Street", "Anna nagar","Bangalore","Karnataka", "India", "517506");
		Address address3 = new Address(3, "190/c", "North street", "MG nagar", "Hydrabad","AndraPradesh","India", "578542");
		list.add(address1);
		list.add(address2);
		list.add(address3);
		
		when(addressRepository.findAll()).thenReturn(list);
		List<Address> addressList = addressService.viewAllAddress();
		assertEquals(3, addressList.size());
	}
	
	//Add address
	@Test
	void saveAddressTest() {
		Address address = new Address(4, "190/c", "North street", "MG nagar", "kumbalangi","kerala","India", "1578542");
		when(addressRepository.save(address)).thenReturn(address);
		Address savedAddress = addressService.addAddress(address);
		assertThat(savedAddress).isNotNull();
		assertEquals("kumbalangi",savedAddress.getCity());
	}
	

}


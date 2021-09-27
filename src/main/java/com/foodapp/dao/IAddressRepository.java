package com.foodapp.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.entity.Address;

public interface IAddressRepository extends JpaRepository<Address,Integer> {


}

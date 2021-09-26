package com.foodapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Integer>{

}

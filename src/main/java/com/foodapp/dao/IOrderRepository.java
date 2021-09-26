package com.foodapp.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprintaws.entity.OrderDetails;


@Repository
public interface IOrderRepository extends JpaRepository<OrderDetails,Integer>
{
	
}

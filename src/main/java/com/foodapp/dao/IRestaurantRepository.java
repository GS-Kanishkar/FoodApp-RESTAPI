package com.foodapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.foodapp.entity.Restaurant;

public interface IRestaurantRepository extends JpaRepository<Restaurant,Integer> {
	@Query("SELECT u FROM Restaurant u JOIN FETCH Item a WHERE a.itemid = u.restaurantid")
	public List<Restaurant> findRestaurantByItemName(String itemname);
	

}

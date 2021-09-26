package com.foodapp.service;

import java.util.List;

import com.foodapp.entity.Restaurant;

public interface IRestaurantService {
	
	//Additional Functionality is Getting All the Restaurants
	public List<Restaurant> getAllRestaurant();
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public void removeRestaurant(int restid);
	public List<Restaurant> viewRestaurantByItemName(String name);
	public Restaurant viewRestaurant(Restaurant res);
	public List<Restaurant> viewNearByRestaurant(String location);
	

}

package com.foodapp.service;

import java.util.List;

import com.foodapp.entity.Category;
import com.foodapp.entity.Item;
import com.foodapp.entity.Restaurant;

public interface IItemService {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item viewItem(int id);
	public void removeItem(int id);
	public List<Item> viewAllItem(Category cat);
	public List<Item> viewAllItems(Restaurant res);
	public List<Item> viewAllItemsbyName(String name);

}

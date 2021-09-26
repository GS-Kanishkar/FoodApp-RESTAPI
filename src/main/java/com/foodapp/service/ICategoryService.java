package com.foodapp.service;

import java.util.List;

import com.foodapp.entity.Category;

public interface ICategoryService {
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	public void removeCategory(int catid);
	public Category viewCategory(int cat);
	public List<Category> viewAllCategory();

}

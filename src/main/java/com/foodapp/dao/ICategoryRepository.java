package com.foodapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.entity.Category;

public interface ICategoryRepository extends JpaRepository<Category,Integer>{

}

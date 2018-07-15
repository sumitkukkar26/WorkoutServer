package com.cognizant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}

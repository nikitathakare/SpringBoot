package com.Shoes.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Shoes.entity.Category;
import com.Shoes.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	@Query("Select product from Product product where cid = :cid")
	public List<Product> findbyCategory(@Param("cid") int cid);
	
	@Query("Select category from Category category where name =:name")
	public List<Category> findbyName(@Param("name")String name);
	

	
}

package com.Shoes.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Shoes.entity.Category;
import com.Shoes.entity.Product;
import com.Shoes.entity.PurchaseDetails;

@Repository
public interface ProductDetailsRepo extends JpaRepository<PurchaseDetails, Integer> {
	@Query("Select productdetails from PurchaseDetails productdetails where purchaseDate = :purchaseDate")
	public List<PurchaseDetails> findbyDate(@Param("purchaseDate") String purchaseDate);
	
	@Query("select mo from PurchaseDetails mo join fetch mo.categories c where c.name = :name ")
	public List<PurchaseDetails> findbyCat(@Param("name") String name);

}

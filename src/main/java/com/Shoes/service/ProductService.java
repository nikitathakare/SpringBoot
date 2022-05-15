package com.Shoes.service;

import java.util.List;

import com.Shoes.entity.Category;
import com.Shoes.entity.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Product saveProduct(Product product);
	Product updateProduct(Product product);
	void deleteProduct(int pid);
	Product getProductById(int pid);
	List<Product> getByCategory(int cid);
	//List<Product> searchByCategory(String name);
	
}

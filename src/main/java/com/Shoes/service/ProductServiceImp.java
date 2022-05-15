package com.Shoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Shoes.entity.Category;
import com.Shoes.entity.Product;
import com.Shoes.repo.ProductRepo;

@Service
@Transactional
public class ProductServiceImp implements ProductService {
	//productRepository class
    private ProductRepo productRepository;
    
    @Autowired
    public ProductServiceImp(ProductRepo productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public void deleteProduct(int pid) {
        this.productRepository.deleteById(pid);
    }

    public Product getProductById(int id)
    {
       return productRepository.findById(id).get();
    }
   
	@Override
	public List<Product> getByCategory(int cid) {
		// TODO Auto-generated method stub
		return productRepository.findbyCategory(cid);
	}
	

}

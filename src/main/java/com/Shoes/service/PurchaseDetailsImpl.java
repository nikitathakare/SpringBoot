package com.Shoes.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Shoes.entity.Category;
import com.Shoes.entity.PurchaseDetails;
import com.Shoes.repo.ProductDetailsRepo;
import com.Shoes.repo.ProductRepo;
@Service
@Transactional
public class PurchaseDetailsImpl implements DetailsService {
	private ProductDetailsRepo purchaseRepo;
	@Autowired
	public PurchaseDetailsImpl(ProductDetailsRepo purchaseRepo) {
		super();
		this.purchaseRepo = purchaseRepo;
	}
	@Override
	public List<PurchaseDetails> getDetailBydate(String purchaseDate) {
		//purchaseRepo.findbyDate();
		return purchaseRepo.findbyDate(purchaseDate);
	}
	@Override
	public List<PurchaseDetails> getAll() {
		// TODO Auto-generated method stub
		return purchaseRepo.findAll();
	}
	@Override
	public List<PurchaseDetails> getbyName(String name) {
		// TODO Auto-generated method stub
		return purchaseRepo.findbyCat(name);
	}
	
	
	
	
}

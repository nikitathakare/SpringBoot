package com.Shoes.service;

import java.time.LocalDate;
import java.util.List;

import com.Shoes.entity.Category;
import com.Shoes.entity.PurchaseDetails;
public interface DetailsService {
	
	List<PurchaseDetails> getDetailBydate(String purachseDate);
	List<PurchaseDetails> getAll();
	List<PurchaseDetails> getbyName(String Name);
}

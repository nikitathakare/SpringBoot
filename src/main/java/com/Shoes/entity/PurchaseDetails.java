package com.Shoes.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PurchaseDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseId;
	
	private String purchaseDate;
	private double price;
	
	@OneToMany(mappedBy = "purchaseDetails")
	@JsonIgnoreProperties("purchaseDetails")
	private List<Category> categories = new ArrayList<Category>();
	
	public PurchaseDetails(int purchaseId, String purchaseDate, double price, List<Category> categories) {
		super();
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
		this.price = price;
		this.categories = categories;
	}
	public PurchaseDetails() {
		
	}
	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	

	public String getPurchaseDate() {
		return purchaseDate;
	}



	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	public List<Category> getCategories() {
		return categories;
	}



	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}


	
	
	
	
	
	

}

package com.Shoes.Controller;

import java.time.LocalDate;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Shoes.entity.Product;
import com.Shoes.entity.PurchaseDetails;
import com.Shoes.service.DetailsService;

@Controller
@RequestMapping("/PurchaseDetails")
public class PurchaseDetailsController {
	private DetailsService purchaseDetails;
	
	@Autowired
	public PurchaseDetailsController(DetailsService purchaseDetails) {
		super();
		this.purchaseDetails = purchaseDetails;
	}
	
	@GetMapping("/filter")
	public ResponseEntity<List<PurchaseDetails>> getByDate(@RequestParam("date") String purchaseDate){
		List<PurchaseDetails> details = purchaseDetails.getDetailBydate(purchaseDate);
		return new ResponseEntity<List<PurchaseDetails>>(details,HttpStatus.OK);
		
	}
	@GetMapping("/all")
	 public ResponseEntity<List<PurchaseDetails>> listDetails()
	    {
	    	List<PurchaseDetails> products1=purchaseDetails.getAll();
			return new ResponseEntity<List<PurchaseDetails>>(products1, HttpStatus.OK);

	    }
	
	@GetMapping("/all_cat")
	 public ResponseEntity<List<PurchaseDetails>> CatDetails(@RequestParam("name") String name)
	    {
	    	List<PurchaseDetails> products1=purchaseDetails.getbyName(name);
			return new ResponseEntity<List<PurchaseDetails>>(products1, HttpStatus.OK);

	    }

	
	
	
}


package com.Shoes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Shoes.entity.Category;
import com.Shoes.entity.Product;
import com.Shoes.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	private ProductService ProductSer;
	
	
	@Autowired
	public ProductController(ProductService productSer) {
		super();
		ProductSer = productSer;
	}


	//request to list all the products
    @GetMapping("/all_products")
    public ResponseEntity<List<Product>> listProducts()
    {
    	List<Product> products=ProductSer.getAllProducts();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);

    }

   // @RequestMapping(value = "/products/create_product",method = RequestMethod.POST)
    @PostMapping("/create_product")
    public ResponseEntity<?>  CreateProduct(@RequestBody Product product) // Products is the name of the Entity class and creating a productObjcet from it
    {
        ProductSer.saveProduct(product);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

//    @GetMapping("/products/edit/{id}")
//    public String editProductForm(@PathVariable long id, Model model)
//    {
//        model.addAttribute("product",productService.getProductById(id));
//        return "Products/edit_product";
//    }

  

    //request to Delete product
    @DeleteMapping("delete_product/{pid}")
    public ResponseEntity<?> deleteProduct(@PathVariable int pid)
    {
        ProductSer.deleteProduct(pid);
        return ResponseEntity.ok().build();
    
    }
    
    @GetMapping("getProduct/{pid}")
    public ResponseEntity<?> getProductById(@PathVariable int pid){
    	ProductSer.getProductById(pid);
    	return ResponseEntity.ok().build();
    	
    }
    
    @GetMapping("getCategory/{cid}")
    public ResponseEntity<List<Product>> getCategory(@PathVariable int cid){
    	List<Product> product1=ProductSer.getByCategory(cid);
    	
    	return new ResponseEntity<List<Product>>(product1, HttpStatus.OK);
    }

	
    
}

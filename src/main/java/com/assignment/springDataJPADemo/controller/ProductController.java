package com.assignment.springDataJPADemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.springDataJPADemo.model.Product;
import com.assignment.springDataJPADemo.service.ProductService;

@RestController
@RequestMapping("/product/")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public ResponseEntity<List<Product>> fetchProducts(){
		return new ResponseEntity<List<Product>>(productService.fetchAllProducts(),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Product> addProduct(@RequestBody Product prod){
		return new ResponseEntity<Product>(productService.saveProdcut(prod), HttpStatus.CREATED);
	}
}

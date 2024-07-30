package com.assignment.springDataJPADemo.service;

import java.util.List;

import com.assignment.springDataJPADemo.model.Product;

public interface ProductService {

	List<Product> fetchAllProducts();

	Product saveProdcut(Product prod);

}

package com.assignment.springDataJPADemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.assignment.springDataJPADemo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}

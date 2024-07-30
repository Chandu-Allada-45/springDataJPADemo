package com.assignment.springDataJPADemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.assignment.springDataJPADemo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

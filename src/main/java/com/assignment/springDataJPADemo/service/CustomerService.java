package com.assignment.springDataJPADemo.service;

import java.util.List;

import com.assignment.springDataJPADemo.model.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer cust);

	List<Customer> fetchAllCustomers();

}

package com.assignment.springDataJPADemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.springDataJPADemo.model.Customer;
import com.assignment.springDataJPADemo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer cust) {
		return customerRepository.save(cust);
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(cus -> customers.add(cus));
		return customers;
	}

}

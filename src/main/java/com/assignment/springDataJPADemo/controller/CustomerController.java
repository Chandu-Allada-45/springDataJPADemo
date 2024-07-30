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

import com.assignment.springDataJPADemo.model.Customer;
import com.assignment.springDataJPADemo.service.CustomerService;

@RestController
@RequestMapping("/customer/")
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	@PostMapping("/")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer cust){
		return new ResponseEntity<Customer>(custService.saveCustomer(cust),HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Customer>> fetchCustomers(){
		return new ResponseEntity<List<Customer>>(custService.fetchAllCustomers(),HttpStatus.OK);
	}
	
}

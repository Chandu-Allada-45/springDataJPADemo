package com.assignment.springDataJPADemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.springDataJPADemo.request.OrderRequest;
import com.assignment.springDataJPADemo.response.OrdersResponse;
import com.assignment.springDataJPADemo.service.OrderService;

@RestController
@RequestMapping("/orders/")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/")
	public ResponseEntity<List<OrdersResponse>> fetchProducts(){
		return new ResponseEntity<List<OrdersResponse>>(orderService.fetchAllOrders(),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<OrdersResponse> saveOrder(@RequestBody OrderRequest ordReq){
		return new ResponseEntity<OrdersResponse>(orderService.saveOrder(ordReq),HttpStatus.CREATED);
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<List<OrdersResponse>> fetchOrdersByCustomerId(@PathVariable("id") Long custId){
		return new ResponseEntity<List<OrdersResponse>>(orderService.fetchAllOrdersByCustomerId(custId), HttpStatus.OK);
	}

}

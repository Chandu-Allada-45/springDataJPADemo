package com.assignment.springDataJPADemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.springDataJPADemo.model.Orders;
import com.assignment.springDataJPADemo.repository.CustomerRepository;
import com.assignment.springDataJPADemo.repository.OrderRepository;
import com.assignment.springDataJPADemo.repository.ProductRepository;
import com.assignment.springDataJPADemo.request.OrderRequest;
import com.assignment.springDataJPADemo.response.OrdersResponse;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public OrdersResponse saveOrder(OrderRequest ordReq) {
		Orders order = new Orders();
		order.setOrderQuantity(ordReq.getOrderQuantity());
		order.setCustomer(customerRepository.findById(ordReq.getCustomerId()).get());
		order.setProduct(productRepository.findById(ordReq.getProductId()).get());
		order.setOrderTotal(ordReq.getOrderQuantity()*order.getProduct().getPrice());;
		orderRepository.save(order);
		return orderRepository.findByOrderId(order.getOrderId());
	}
	@Override
	public List<OrdersResponse> fetchAllOrders() {
		return orderRepository.findAllOrders();
	}
	@Override
	public List<OrdersResponse> fetchAllOrdersByCustomerId(Long custId) {
		return orderRepository.findByCustomerId(custId);
	}
	
	

}

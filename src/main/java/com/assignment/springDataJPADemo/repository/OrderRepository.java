package com.assignment.springDataJPADemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.assignment.springDataJPADemo.model.Orders;
import com.assignment.springDataJPADemo.response.OrdersResponse;

public interface OrderRepository extends CrudRepository<Orders, Long> {
	
	@Query("select new com.assignment.springDataJPADemo.response.OrdersResponse(c.customerId, o.orderId, o.orderTotal, o.orderQuantity, p.productName) from Orders o JOIN Customer c ON c.customerId = o.customer.customerId JOIN Product p ON p.productId = o.product.productId WHERE c.customerId = ?1")
	public List<OrdersResponse> findByCustomerId(Long customerId);
	
	@Query("select new com.assignment.springDataJPADemo.response.OrdersResponse(c.customerId, o.orderId, o.orderTotal, o.orderQuantity, p.productName) from Orders o JOIN Customer c ON c.customerId = o.customer.customerId JOIN Product p ON p.productId = o.product.productId")
	public List<OrdersResponse> findAllOrders();
	
	@Query("select new com.assignment.springDataJPADemo.response.OrdersResponse(c.customerId, o.orderId, o.orderTotal, o.orderQuantity, p.productName) from Orders o JOIN Customer c ON c.customerId = o.customer.customerId JOIN Product p ON p.productId = o.product.productId WHERE o.orderId = ?1")
	public OrdersResponse findByOrderId(Long orderId);

}

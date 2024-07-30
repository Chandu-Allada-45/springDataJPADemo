package com.assignment.springDataJPADemo.service;

import java.util.List;

import com.assignment.springDataJPADemo.request.OrderRequest;
import com.assignment.springDataJPADemo.response.OrdersResponse;

public interface OrderService {

	OrdersResponse saveOrder(OrderRequest ordReq);

	List<OrdersResponse> fetchAllOrders();

	List<OrdersResponse> fetchAllOrdersByCustomerId(Long custId);

}

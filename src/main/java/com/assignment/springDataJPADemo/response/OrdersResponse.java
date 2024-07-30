package com.assignment.springDataJPADemo.response;

public class OrdersResponse {
	
	private Long customerId;
	private Long orderId;
	private Double orderTotal;
	private Integer orderQuantity;
	private String productName;
	public OrdersResponse(Long customerId, Long orderId, Double orderTotal, Integer orderQuantity, String productName) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.orderQuantity = orderQuantity;
		this.productName = productName;
	}
	public OrdersResponse() {
		super();
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public Integer getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}

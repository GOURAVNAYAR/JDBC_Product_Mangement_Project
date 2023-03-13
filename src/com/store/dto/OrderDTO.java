package com.store.dto;

import java.util.Date;
import java.util.Set;

public class OrderDTO {

	private long orderId;
	private long productId;
	private Date orderDate;
	private long orderQty;
	private Set<ProductDTO> productSet;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public long getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(long orderQty) {
		this.orderQty = orderQty;
	}
	public Set<ProductDTO> getProductSet() {
		return productSet;
	}
	public void setProductSet(Set<ProductDTO> productSet) {
		this.productSet = productSet;
	}
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", productId=" + productId + ", orderDate=" + orderDate + ", orderQty="
				+ orderQty + ", productSet=" + productSet + "]";
	}
	
}

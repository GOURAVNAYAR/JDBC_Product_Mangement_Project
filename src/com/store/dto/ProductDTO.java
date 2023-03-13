package com.store.dto;

import java.util.Date;

public class ProductDTO {

	private long productId;
	private String productName;
	private String productDetail;
	private float productPrice;
	private long productQty;
	private Date productManDate;
	private Date productExpDate;
	private BranchDTO branch;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public long getProductQty() {
		return productQty;
	}
	public void setProductQty(long productQty) {
		this.productQty = productQty;
	}
	public Date getProductManDate() {
		return productManDate;
	}
	public void setProductManDate(Date productManDate) {
		this.productManDate = productManDate;
	}
	public Date getProductExpDate() {
		return productExpDate;
	}
	public void setProductExpDate(Date productExpDate) {
		this.productExpDate = productExpDate;
	}
	public BranchDTO getBranch() {
		return branch;
	}
	public void setBranch(BranchDTO branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", productDetail="
				+ productDetail + ", productPrice=" + productPrice + ", productQty=" + productQty + ", productManDate="
				+ productManDate + ", productExpDate=" + productExpDate + ", branch=" + branch + "]";
	}
}

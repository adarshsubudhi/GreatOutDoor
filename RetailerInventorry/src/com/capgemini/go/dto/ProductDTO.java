package com.capgemini.go.dto;

public class ProductDTO {
	private String RetailerName;
	private String product;
	public String getRetailerName() {
		return RetailerName;
	}
	public void setRetailerName(String RetailerName) {
		this.RetailerName = RetailerName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private int quantity;
	

}

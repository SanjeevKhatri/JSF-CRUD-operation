package edu.mum.jsf.crud.bean;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	public Product(String productId, String name, int price) {
		this.productId = productId;
		this.name = name;
		this.edit = false;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product() {
	}

	private String productId;
	private boolean edit;
	private String name;
	private int price;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public boolean isEdit() {
		return edit;
	}

	public void setEdit(boolean edit) {
		this.edit = edit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", edit=" + edit + ", name=" + name + "]";
	}

}
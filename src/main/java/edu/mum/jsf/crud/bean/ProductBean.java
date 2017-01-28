
package edu.mum.jsf.crud.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("productBean")
@SessionScoped
public class ProductBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String productId;

	private String name;

	private int price;

	private ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(new Product("F123", "Burger", 5),
			new Product("F142", "Pizza", 20), new Product("F153", "Sandwich", 10)));

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public String editProduct(Product product) {
		product.setEdit(true);
		return null;
	}

	public String deleteProduct(Product product) {
		products.remove(product);
		return null;
	}

	public String saveProducts() {
		for (Product product : products) {
			product.setEdit(false);
		}
		return null;
	}

	public String addProduct() {
		Product product = new Product(productId, name, price);
		products.add(product);
		productId = null;
		name = null;
		price = 0;
		return "product?faces-redirect=true";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
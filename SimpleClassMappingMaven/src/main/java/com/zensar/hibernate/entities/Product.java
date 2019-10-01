package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Veena Kumari
 * @creation Date 1stOct 2019 10:22AM
 * @modification Date 1stOct 2019 10.22AM
 * @version 1.0
 * @copyright Zensar Technologies.All Rights Reserved.
 * @description It is persistent class.
 *
 */
@Entity
@Table(name = "product1")
public class Product
{@Id
	@Column(name = "id")
	private int productId;
	private String name;
	private String brand;
	private float price;
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}


}

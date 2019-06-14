package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer prodId;
	private String prodCode;
	private Double prodMode;
	public Product() {
		super();
	}
	public Product(String prodCode, double prodMode) {
		super();
		this.prodCode = prodCode;
		this.prodMode = prodMode;
	}
	public Product(Integer prodId, String prodCode, double prodMode) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodMode = prodMode;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public double getProdMode() {
		return prodMode;
	}
	public void setProdMode(double prodMode) {
		this.prodMode = prodMode;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodMode=" + prodMode + "]";
	}

}
package com.fantasticCode.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "table_sale")
public class Sale {
	@Id
	@Column(name = "idsale")
	private int idsale;
	
	@Column(name = "nameSale")
	private String nameSale;
	
	@Column(name = "imageSale")
	private String imageSale;
	
	@Column(name = "descriptionSale")
	private String descriptionSale;
	
	@Column(name = "normalPriceSale")
	private float normalPriceSale;
	
	@Column(name = "discPriceSale")
	private float discPriceSale;

	public int getIdsale() {
		return idsale;
	}

	public void setIdsale(int idsale) {
		this.idsale = idsale;
	}

	public String getNameSale() {
		return nameSale;
	}

	public void setNameSale(String nameSale) {
		this.nameSale = nameSale;
	}

	public String getImageSale() {
		return imageSale;
	}

	public void setImageSale(String imageSale) {
		this.imageSale = imageSale;
	}

	public String getDescriptionSale() {
		return descriptionSale;
	}

	public void setDescriptionSale(String descriptionSale) {
		this.descriptionSale = descriptionSale;
	}

	public float getNormalPriceSale() {
		return normalPriceSale;
	}

	public void setNormalPriceSale(float normalPriceSale) {
		this.normalPriceSale = normalPriceSale;
	}

	public float getDiscPriceSale() {
		return discPriceSale;
	}

	public void setDiscPriceSale(float discPriceSale) {
		this.discPriceSale = discPriceSale;
	}

	public Sale(int idsale, String nameSale, String imageSale, String descriptionSale, float normalPriceSale,
			float discPriceSale) {
		super();
		this.idsale = idsale;
		this.nameSale = nameSale;
		this.imageSale = imageSale;
		this.descriptionSale = descriptionSale;
		this.normalPriceSale = normalPriceSale;
		this.discPriceSale = discPriceSale;
	}

	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

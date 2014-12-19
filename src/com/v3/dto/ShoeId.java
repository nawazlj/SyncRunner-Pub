package com.v3.dto;

// Generated Mar 1, 2014 3:23:41 PM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ShoeId generated by hbm2java
 */
@Embeddable
public class ShoeId implements java.io.Serializable {

	private String upc;
	private int idStyle;
	private int idBrand;

	public ShoeId() {
	}

	public ShoeId(String upc, SkuId skuId){
		this.upc = upc;
		this.idBrand = skuId.getIdBrand();
		this.idStyle = skuId.getIdStyle();
	}
	
	public ShoeId(String upc, int idStyle, int idBrand) {
		this.upc = upc;
		this.idStyle = idStyle;
		this.idBrand = idBrand;
	}

	@Column(name = "upc", unique = false, nullable = false, length = 12)
	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	@Column(name = "id_style", unique = false, nullable = false)
	public int getIdStyle() {
		return this.idStyle;
	}

	public void setIdStyle(int idStyle) {
		this.idStyle = idStyle;
	}

	@Column(name = "id_brand", unique = false, nullable = false)
	public int getIdBrand() {
		return this.idBrand;
	}

	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShoeId))
			return false;
		ShoeId castOther = (ShoeId) other;

		return ((this.getUpc() == castOther.getUpc()) || (this.getUpc() != null
				&& castOther.getUpc() != null && this.getUpc().equals(
				castOther.getUpc())))
				&& (this.getIdStyle() == castOther.getIdStyle())
				&& (this.getIdBrand() == castOther.getIdBrand());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUpc() == null ? 0 : this.getUpc().hashCode());
		result = 37 * result + this.getIdStyle();
		result = 37 * result + this.getIdBrand();
		return result;
	}

}

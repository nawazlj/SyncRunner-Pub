package com.v3.dto;

// Generated Mar 1, 2014 3:23:41 PM by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Style generated by hbm2java
 */
@Entity
@Table(name = "style", catalog = "v3_inventory", uniqueConstraints = @UniqueConstraint(columnNames = "style"))
public class Style implements java.io.Serializable {

	private Integer idStyle;
	private String style;
	private Set<Sku> skus = new HashSet<Sku>(0);

	public Style() {
	}

	public Style(String style) {
		this.style = style;
	}

	public Style(String style, Set<Sku> skus) {
		this.style = style;
		this.skus = skus;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_style", unique = true, nullable = false)
	public Integer getIdStyle() {
		return this.idStyle;
	}

	public void setIdStyle(Integer idStyle) {
		this.idStyle = idStyle;
	}

	@Column(name = "style", unique = true, nullable = false, length = 45)
	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "style")
	public Set<Sku> getSkus() {
		return this.skus;
	}

	public void setSkus(Set<Sku> skus) {
		this.skus = skus;
	}
	
	@Override
	public String toString(){
		return getStyle();
	}

}

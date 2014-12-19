package com.v3.dto;

// Generated Feb 22, 2014 3:49:27 PM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Descriptions generated by hbm2java
 */
@Entity
@Table(name = "descriptions", catalog = "v3_inventory")
public class Descriptions implements java.io.Serializable {

	private Integer idDesc;
	private String description;
	private String feature1;
	private String feature2;
	private String feature3;
	private String feature4;

	public Descriptions() {
	}

	public Descriptions(String description, String feature1, String feature2,
			String feature3, String feature4) {
		this.description = description;
		this.feature1 = feature1;
		this.feature2 = feature2;
		this.feature3 = feature3;
		this.feature4 = feature4;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_desc", unique = true, nullable = false)
	public Integer getIdDesc() {
		return this.idDesc;
	}

	public void setIdDesc(Integer idDesc) {
		this.idDesc = idDesc;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "feature1", length = 45)
	public String getFeature1() {
		return this.feature1;
	}

	public void setFeature1(String feature1) {
		this.feature1 = feature1;
	}

	@Column(name = "feature2", length = 45)
	public String getFeature2() {
		return this.feature2;
	}

	public void setFeature2(String feature2) {
		this.feature2 = feature2;
	}

	@Column(name = "feature3", length = 45)
	public String getFeature3() {
		return this.feature3;
	}

	public void setFeature3(String feature3) {
		this.feature3 = feature3;
	}

	@Column(name = "feature4", length = 45)
	public String getFeature4() {
		return this.feature4;
	}

	public void setFeature4(String feature4) {
		this.feature4 = feature4;
	}

}

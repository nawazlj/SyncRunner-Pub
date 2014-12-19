package com.v3.dto;

// Generated Feb 22, 2014 3:49:27 PM by Hibernate Tools 3.6.0

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

/**
 * ShoeModel generated by hbm2java
 */
@Entity
@Table(name = "shoe_model", catalog = "v3_inventory")
public class ShoeModel implements java.io.Serializable {

	private Integer idModel;
	private Set<ShoeHasModels> shoeHasModelses = new HashSet<ShoeHasModels>(0);

	public ShoeModel() {
	}

	public ShoeModel(Set<ShoeHasModels> shoeHasModelses) {
		this.shoeHasModelses = shoeHasModelses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_model", unique = true, nullable = false)
	public Integer getIdModel() {
		return this.idModel;
	}

	public void setIdModel(Integer idModel) {
		this.idModel = idModel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "shoeModel")
	public Set<ShoeHasModels> getShoeHasModelses() {
		return this.shoeHasModelses;
	}

	public void setShoeHasModelses(Set<ShoeHasModels> shoeHasModelses) {
		this.shoeHasModelses = shoeHasModelses;
	}

}
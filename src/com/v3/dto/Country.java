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

/**
 * Country generated by hbm2java
 */
@Entity
@Table(name = "country", catalog = "v3_inventory")
public class Country implements java.io.Serializable {

	private Integer idCountry;
	private String country;
	private Set<City> cities = new HashSet<City>(0);

	public Country() {
	}

	public Country(String country, Set<City> cities) {
		this.country = country;
		this.cities = cities;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_country", unique = true, nullable = false)
	public Integer getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(Integer idCountry) {
		this.idCountry = idCountry;
	}

	@Column(name = "country", length = 45)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	public Set<City> getCities() {
		return this.cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

}

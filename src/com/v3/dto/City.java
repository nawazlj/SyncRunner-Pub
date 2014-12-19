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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name = "city", catalog = "v3_inventory")
public class City implements java.io.Serializable {

	private Integer idCity;
	private Country country;
	private State state;
	private String city;
	private String zip;
	private Set<Address> addresses = new HashSet<Address>(0);

	public City() {
	}

	public City(Country country, State state) {
		this.country = country;
		this.state = state;
	}

	public City(Country country, State state, String city, String zip,
			Set<Address> addresses) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.addresses = addresses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_city", unique = true, nullable = false)
	public Integer getIdCity() {
		return this.idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_country", nullable = false)
	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_state", nullable = false)
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Column(name = "city", length = 45)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "zip", length = 45)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}

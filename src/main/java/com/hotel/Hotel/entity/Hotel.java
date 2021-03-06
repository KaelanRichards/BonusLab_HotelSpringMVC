package com.hotel.Hotel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel_list")
public class Hotel {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hotel_id")
	private int id;
	@Column(name="hotel_name")
	private String name;
	private String city;
	@Column(name="price_per_night")
	private String pricePerNight;
	
	public Hotel() {	
	}
	public Hotel(int id, String name, String city, String pricePerNight) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(String pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", city=" + city + ", pricePerNight=" + pricePerNight + "]";
	}
	
	
}

package com.hotel.Hotel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotel.Hotel.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer>{

	List<Hotel> findByCityOrderByPricePerNightAsc(String city);
	
	@Query("SELECT DISTINCT city FROM Hotel")
	List<Hotel> findByCity();
	
}

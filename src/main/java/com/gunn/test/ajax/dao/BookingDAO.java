package com.gunn.test.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gunn.test.ajax.model.Booking;

@Repository
public interface BookingDAO {

	public List<Booking> selectBookingList();
	
	public int insertBooking(
			@Param("name") String name
			,@Param("yyyymmdd") String yyyymmdd
			,@Param("number") int number
			,@Param("personnel") int personnel
			,@Param("phoneNumber") String phoneNumber
			);
	
	public int deletebooking(@Param("int")int id);
	
	public Booking selectBooking(
			@Param("name") String name,
			@Param("phoneNumber") String phoneNumber);
}

	

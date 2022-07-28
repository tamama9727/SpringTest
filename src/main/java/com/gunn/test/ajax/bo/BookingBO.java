package com.gunn.test.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunn.test.ajax.dao.BookingDAO;
import com.gunn.test.ajax.model.Booking;

@Service
public class BookingBO {

	@Autowired
	private BookingDAO bookingDAO;
	
	public List<Booking> getBookingList(){
		return bookingDAO.selectBookingList();
	}
	
	public int addBooking (String name , String yyyymmdd , int number , int personnel , String phoneNumber) {
		return bookingDAO.insertBooking(name, yyyymmdd, number, personnel, phoneNumber);
	}
	
	public int deleteBooking(int id) {
		return bookingDAO.deletebooking(id);
	}
	
	public Booking getBooking(String name ,  String phoneNumber) {
		return bookingDAO.selectBooking(name, phoneNumber);
	}
}

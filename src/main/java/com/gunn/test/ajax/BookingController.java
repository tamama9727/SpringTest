package com.gunn.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gunn.test.ajax.bo.BookingBO;
import com.gunn.test.ajax.model.Booking;

@Controller
@RequestMapping("/ajax/booking")
public class BookingController {

	//통나무 펜션 예약 목록 보기 리스트 페이지
	
	@Autowired
	private BookingBO bookingBO;
	
	//펜션의 예약 목록 페이지
	@GetMapping("/pension")
	public String bookingList(Model model){
		
		List<Booking> bookingList = bookingBO.getBookingList();
		
		model.addAttribute("bookingList", bookingList);
		
		return"ajax/pensionList";
	}
	
	//펜션의 예약하기 페이지

	@PostMapping("/insert")
	@ResponseBody
	public String addBooking(
			@RequestParam("name") String name
			,@RequestParam("yyyymmdd") String yyyymmdd
			,@RequestParam("number") int number
			,@RequestParam("personnel") int personnel
			,@RequestParam("phoneNumber") String phoneNumber
			) {
		int count = bookingBO.addBooking(name, yyyymmdd, number, personnel, phoneNumber);
		
		return "redirect:/ajax/pensionList";
	}
	
	@GetMapping("/input")
	public String BookingInput() {
		
		return"ajax/pensionBooking";
	}
}

package com.gunn.test.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gunn.test.jsp.model.Realtor;

@Controller
public class RealtorController {
	
	//공인 중개사 정보 전달 받고, 데이터 저장
	@ResponseBody
	public String addRealtor(@ModelAttribute Realtor realtor) {
		
		
		
		return "jsp/addRealtor";
	}
	
}

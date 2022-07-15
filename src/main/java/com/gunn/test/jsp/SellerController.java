package com.gunn.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gunn.test.jsp.bo.SellerBO;
import com.gunn.test.jsp.model.Seller;

@Controller
@RequestMapping("/jsp/seller")
public class SellerController {
	
	@Autowired
	private SellerBO sellerBO;
	
	@PostMapping("/insert")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickname") String nickName
			, @RequestParam("profileImage") String profileImage
			, @RequestParam("temperature") double temperature) {
		
		int count = sellerBO.addSeller(nickName, profileImage, temperature);
		
		return "삽입 결과 : " + count;
		
	}
	
	@GetMapping("/input")
	public String sellerInput() {
		
		return "jsp/sellerInput";
	}
	
	@GetMapping("/info")
	public String sellerInfo(
			@RequestParam(value="id", required=false) Integer id
			, Model model) {
		
		Seller seller = sellerBO.getSeller(id);
		model.addAttribute("result", seller);
		
		return "sellerInfo";
	}
	
	

}
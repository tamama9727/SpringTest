package com.gunn.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gunn.test.mybatis.bo.RealEstateBO;
import com.gunn.test.mybatis.model.RealEstate;

@Controller
public class RealEstateController {
	
	@Autowired
	private RealEstateBO realEstateBO;
	
	// realEstate 정보 하나 json으로 response에 출력
	// id 가 5인 real_estate 행 json으로 response 에 출력
	@RequestMapping("/mybatis/test01/1")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateBO.getRealEstate(id);
		
		return realEstate;
	}
	
	@RequestMapping("/mybatis/test01/2")
	@ResponseBody
	public List<RealEstate> price(@RequestParam("rentPrice") int rentPrice) {
		
		List<RealEstate> list = realEstateBO.getRentPrice(rentPrice);
		
		return list;
		
	}
	
	// area 와 price
	@RequestMapping("/mybatis/test01/3")
	@ResponseBody
	public List<RealEstate> realEstateByAreaPrice(
			@RequestParam("area") int area
			,@RequestParam("price") int price){
	
		return realEstateBO.getRealEstateByAreaPrice(area, price);
	}
	
	//INSERT 
	//객체를 활용해서 INSERT
	//입력 성공한 행의 수를 출력
	@RequestMapping("/mybatis/test02/1")
	@ResponseBody
	public String addRealEstateByobject() {
		RealEstate realEstate =  new RealEstate();
		
		// 받아야 할 값
		//RealtorId , 주소 , 평수 , 타입 , 가격
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		//행의 수를 출력해야하니까 int (몇개의 값이 입력되었는지)
		int count = realEstateBO.addRealEstateByobject(realEstate);
		
		return"입력 성공 (객체를 이용한) : " + count;
	}
	
	//INSERT 2
	//객체 없이 INSERT
	@RequestMapping("/mybatis/test02/2")
	@ResponseBody
	public String addRealEstate(@RequestParam(value = "realtorId") int realtorId) {
		
		int count = realEstateBO.addRealEstate(realtorId , "썅떼빌리버 오피스텔 814호" , 45 , "월세" , 100000, 120);
		return"입력 성공 (객체를 이용하지 않은) : " + count;
	}
	
	//UPDATE
	//id 가 24 인 객체의 type 을 전세로 , price 를 70000으로 변경
	//수정 성공한 행의 수를 return 하시오
	@RequestMapping("/mybatis/test03/1")
	@ResponseBody
	public String updateRealEstate() {
		
		int count = realEstateBO.updateRealEstate(23 , "전세" , 70000);
		return "수정 성송 (update) : " + count;
	}
	
	//DELETE
	@RequestMapping("/mybatis/test04/1")
	@ResponseBody
	public String deleteRealEstate(@RequestParam("id") int id) {
		
		int count = realEstateBO.delteRealEstate(id);
		
		return"삭제 결과 (DELETE):" + count;
	}
	
	
}
	
	

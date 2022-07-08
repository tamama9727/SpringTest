package com.gunn.test.mybatis.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunn.test.mybatis.dao.RealEstateDAO;
import com.gunn.test.mybatis.model.RealEstate;

@Service
public class RealEstateBO {
	
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	//id가 5인 real eatate 정보 전달
	public RealEstate getRealEstate(int id) {
		RealEstate realEstate = realEstateDAO.selectRealEstate(id);
		
		return realEstate;
	}
	
	//rentPrice 가 Param값보다 낮은 매물을 모두 출력
	public List<RealEstate> getRentPrice(int rentPrice) {
		List<RealEstate> list = realEstateDAO.selectPrice(rentPrice);
		
		return list;
	}
	
	public List<RealEstate> getRealEstateByAreaPrice(int area, int price){
		return realEstateDAO.selectRealEstateByAreaPrice(area, price);
		
	}

}

package com.gunn.test.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gunn.test.mybatis.model.RealEstate;

@Repository
public interface RealEstateDAO {

	//id 가 5d인 real estate 정보 전달
	 
	public RealEstate selectRealEstate(@Param("id") int id);
	
	public List<RealEstate> selectPrice(@Param("rentPrice") int rentPrice);
	
	public List<RealEstate> selectRealEstateByAreaPrice(int area, int price);
	
	
	
	
}
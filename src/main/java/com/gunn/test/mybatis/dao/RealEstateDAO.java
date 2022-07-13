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
	
	public List<RealEstate> selectRealEstateByAreaPrice(@Param("area") int area, @Param("price")int price);
	
	public int insertRealEstateByObject(RealEstate realEstate);
	
	public int insertRealEstate(
			@Param("realtorId") int realtorId
			,@Param("address") String address
			,@Param("area") int area
			,@Param("type") String type
			,@Param("price") int Price
			,@Param("rentPrice") int rentPrice
			);

	public int updateRealEstate(
			@Param("id") int id
			,@Param("type") String type
			,@Param("price") int price);

	public int deleteRealEstate(@Param("id") int id);
	
}
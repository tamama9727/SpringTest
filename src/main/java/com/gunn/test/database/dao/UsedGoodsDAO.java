package com.gunn.test.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gunn.test.database.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {
	
	public List<UsedGoods> selectUsedGoodsList();
	
	

}

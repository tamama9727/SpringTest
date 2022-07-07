package com.gunn.test.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunn.test.database.dao.UsedGoodsDAO;
import com.gunn.test.database.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> list = usedGoodsDAO.selectUsedGoodsList();
				
		return list;
		
	}
}

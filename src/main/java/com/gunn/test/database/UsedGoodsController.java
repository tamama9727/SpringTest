package com.gunn.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gunn.test.database.bo.UsedGoodsBO;
import com.gunn.test.database.model.UsedGoods;

@Controller
public class UsedGoodsController {

	@Autowired	
	private UsedGoodsBO usedGoodsBO;
	
	@RequestMapping("/database/test01/1")
	@ResponseBody
	public List<UsedGoods> ex01() {
		List<UsedGoods> list = usedGoodsBO.getUsedGoodsList();
		
		return list;
	}
	
}

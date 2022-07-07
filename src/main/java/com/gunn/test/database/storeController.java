package com.gunn.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gunn.test.database.bo.storeBO;
import com.gunn.test.database.model.store;

@Controller
public class storeController {

	@Autowired
	private storeBO storeBO;
	
	@RequestMapping("/database/test02/1")
	@ResponseBody
	public List<store> test01(){
		List<store> list = storeBO.getStoreList();
		
		return list;
	}
}

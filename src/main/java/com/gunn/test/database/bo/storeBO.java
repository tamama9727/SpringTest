package com.gunn.test.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunn.test.database.dao.storeDAO;
import com.gunn.test.database.model.store;

@Service
public class storeBO {
	
	
	
	@Autowired
	private storeDAO storeDAO;
	
	public List<store> getStoreList(){
		List<store> list = storeDAO.selectStoreList();
		
		return list;
	}
	

}

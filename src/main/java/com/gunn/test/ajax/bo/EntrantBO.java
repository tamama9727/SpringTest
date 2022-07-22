package com.gunn.test.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunn.test.ajax.dao.EntrantDAO;
import com.gunn.test.ajax.model.Entrant;

@Service
public class EntrantBO {
	
	@Autowired
	private EntrantDAO entrantDAO;
	
	public List<Entrant> getEntrantList(){
		return entrantDAO.selectEntrantList();
	}
	
	public int addEntrant(String name , String license) {
		return entrantDAO.insertEntrant(name , license);
	}

}

package com.gunn.test.jsp.bo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunn.test.jsp.dao.SellerDAO;
import com.gunn.test.jsp.model.Seller;

@Service
public class SellerBO {
	
	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickName, String profileImage, double temperature) {
		return sellerDAO.insertSeller(nickName, profileImage, temperature);
	}
	
	public Seller getLastSeller() {
	 	return sellerDAO.selectLastSeller();
	}
	
	public Seller getSeller(Integer id) {
		
		if(id == null) {
			return sellerDAO.selectLastSeller();
		} else {
			return sellerDAO.selectSeller(id);
		}
		
	}


}
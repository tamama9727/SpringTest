package com.gunn.test.jstl.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunn.test.jstl.dao.WeatherhistoryDAO;
import com.gunn.test.jstl.model.Weatherhistory;

@Service
public class WeatherhistoryBO {
	
	@Autowired
	private WeatherhistoryDAO weatherhistoryDAO;
	
	public List<Weatherhistory> getWeatherhistory(){
		
		return weatherhistoryDAO.selectWeatherhistory();
	}
	
	public void addWeatherhistory(
			String date
			, String Weather 
			, double temperatures 
			, double precipitation 
			, String microDust 
			, double windSpeed ) {
		
		return;
		
	}
	

}

package com.gunn.test.jstl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gunn.test.jstl.bo.WeatherhistoryBO;
import com.gunn.test.jstl.model.Weatherhistory;

@RestController
public class WeatherhistoryController {

	@Autowired
	private WeatherhistoryBO weatherhistoryBO;
	
	@RequestMapping("/jstl/weather")
	public List<Weatherhistory> WeatherhistoryTest() {
		
		return weatherhistoryBO.getWeatherhistory();
	}
	
}

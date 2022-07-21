package com.gunn.test.jstl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gunn.test.jstl.bo.WeatherhistoryBO;
import com.gunn.test.jstl.model.Weatherhistory;

@Controller
public class WeatherhistoryController {

	@Autowired
	private WeatherhistoryBO weatherhistoryBO;
	
	@GetMapping("/jstl/weather/list")
	public String WeatherhistoryList(Model  model) {
		List<Weatherhistory>  weatherhistory= weatherhistoryBO.getWeatherhistory();
		model.addAttribute("WeatherhistoryList", weatherhistory);
		
		return "jstl/jstlTest07";
	}
	
	@GetMapping("jstl/weather/input")
	public String Weatherhistoryinput() {
		
		return "jstl/jstlTest08input";
	}
	
	
	public String addWeatherhistory(
		@RequestParam("date")String date	
	  ,@RequestParam("weather")String weather 
	  ,@RequestParam("temperatures")double temperatures 
	  ,@RequestParam("precipitation")double precipitation
	  ,@RequestParam("microDust") String microDust 
	  ,@RequestParam("windSpeed") int windSpeed
			) {
		
		//int count = weatherhistoryBO.addweatherhistory();
		
		return   "입력 완료";
	}
	
	//입력할 jsp를 부를 public 만들고 jsp에서 정보를 입력받고 그 정보를 sql에 저장하는 public
	
}

package com.gunn.test.jstl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gunn.test.jstl.model.Weatherhistory;

@Repository
public interface WeatherhistoryDAO {

	public List<Weatherhistory> selectWeatherhistory();
	
	public int insertWeather(
			@Param("date") String date
			,@Param("weather") String weather 
			,@Param("temperatures") double temperatures 
			,@Param("precipitation") double precipitation 
			,@Param("microDust") String microDust 
			,@Param("windSpeed") double windSpeed
			);
//	return weatherhistoryDAO.insertWeatherhistory(date);
}

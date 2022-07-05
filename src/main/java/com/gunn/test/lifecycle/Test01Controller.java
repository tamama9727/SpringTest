package com.gunn.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/test01")
public class Test01Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String printTest() {
		return "<h1>테스트 프로젝트 완성<h1><h4>해당 프로젝트를 통해서 문제 풀이를 진행 합니다.<h4>";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer>printScore(){
		Map<String, Integer> map = new HashMap<>();
		
		map.put("국어", 85);
		map.put("수학", 90);
		map.put("영어", 80);
		
		return map;
	}

}

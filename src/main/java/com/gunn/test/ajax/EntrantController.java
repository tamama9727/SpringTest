package com.gunn.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gunn.test.ajax.bo.EntrantBO;
import com.gunn.test.ajax.model.Entrant;

@Controller
@RequestMapping("ajax/entrant")
public class EntrantController {
	//favorite 테이블 태체
	@Autowired
	private EntrantBO entrantBO;
	
	@GetMapping("/list")
	public String EntrantList(Model model) {
		List<Entrant> entrantList = entrantBO.getEntrantList();
		
		model.addAttribute("entrantList" , entrantList);
		return "ajax/entrantList";
	}
	
	@PostMapping("/insert")
	@ResponseBody
	public Map<String,String> addEntrant(
			@RequestParam("name") String name
			,@RequestParam("license") String license
			) {
		
		int count = entrantBO.addEntrant(name,license);
		
		Map<String , String> result = new HashMap<>();
		
		if(count == 1) {
			result.put("result", "success");
		}else {
			result.put("result", "fail");
		}
		return result;
		
	}
	
	@GetMapping("/input")
	public String EntrantInput() {
		
		return "ajax/entrantInput";
	}

}

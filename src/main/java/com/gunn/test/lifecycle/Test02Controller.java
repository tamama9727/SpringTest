package com.gunn.test.lifecycle;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gunn.test.lifecycle.model.Board;

@RestController
@RequestMapping("/lesson01/test02")
public class Test02Controller {
	
	
//	public List<Map<String, Object>> printFilm(){
//		List<Map<String, Object>> filmList = new ArrayList<>();
//		
//		Map<String, Object> film = new HashMap<>();
//		film.put("rate", 15);
//		film.put("director", "봉준호");
//		film.put("time", 131);
//		film.put("title", "기생충");
//		

//		
//		return film;
//	}
	@RequestMapping("/1")
	public List<Map<String, Object>>movieList() {
		
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movie = new HashMap<>();
		movie.put("rate", 15);
		movie.put("director", "봉준호");
		movie.put("time", 131);
		movie.put("title", "기생충");
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("rate", 0);
		movie.put("director", "로베르토 베니니");
		movie.put("time", 116);
		movie.put("title", "인생은 아름다워");
		movieList.add(movie);
		
		return movieList;
	}
	
	@RequestMapping("/2")
	public List<Board> boardList() {
		
		List<Board> boardList = new ArrayList<>();
		
		Board content = new Board();
		content.setTitle("안녕하세요 가입인사 드립니다.");
		content.setUser("hagulu");
		content.setContent("안녕하세요 가입했어요 앞으로 잘 부탁드립니다.");
		boardList.add(content);
		
		content = new Board();
		content.setTitle("안녕하세요 가입인사 드립니다.222");
		content.setUser("hagulu222");
		content.setContent("안녕하세요 가입했어요 앞으로 잘 부탁드립니다.222");
		boardList.add(content);
	
		content = new Board();
		content.setTitle("안녕하세요 가입인사 드립니다.333");
		content.setUser("hagulu333");
		content.setContent("안녕하세요 가입했어요 앞으로 잘 부탁드립니다.333");
		boardList.add(content);
		
		return boardList;
	}
	@RequestMapping("/3")
	public ResponseEntity<Board> entity() {
		
		Board content = new Board();
		content.setTitle("안녕하세요 가입인사 드립니다.");
		content.setUser("hagulu");
		content.setContent("안녕하세요 가입했어요 앞으로 잘 부탁드립니다.");
		
		ResponseEntity<Board> entity = new ResponseEntity(content, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	

}

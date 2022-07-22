package com.gunn.test.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gunn.test.ajax.model.Entrant;

@Repository
public interface EntrantDAO {
	
	public List<Entrant> selectEntrantList();
	
	public int insertEntrant(
			@Param("name") String name
			,@Param("license") String license);

}

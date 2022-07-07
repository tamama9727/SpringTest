package com.gunn.test.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gunn.test.database.model.store;

@Repository
public interface storeDAO {

	public List<store> selectStoreList();
}

package com.revature.dao;

import java.util.List;

import com.revature.model.User;

public interface CrudRepository {
	
	public List<User> findAll();

}
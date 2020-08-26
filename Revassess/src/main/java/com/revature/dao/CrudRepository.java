package com.revature.dao;

import java.util.Set;

public interface CrudRepository<T> {
	
	public Set<T> findAll();
	
	public T save();
	
	public T findById(int i);
	
	public boolean update(T t);
	
	public boolean deleteById(int i);

}
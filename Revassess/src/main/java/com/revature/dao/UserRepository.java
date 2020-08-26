package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import com.revature.model.User;
import com.revature.config.ConnectionUtil;

public class UserRepository implements CrudRepository {
	
	@Override
	public Set<User> findAll() {
		try(Connection conn = ConnectionUtil.connect()) {
			String sql = "SELECT * FROM users;";
			Statement statement = conn.createStatement();
			Set<User> set = null;
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				User u = new User();
				u.setName(result.getString("first_name")); 
				
				set.add(u);
			}
			return set;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}


	@Override
	public Object save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
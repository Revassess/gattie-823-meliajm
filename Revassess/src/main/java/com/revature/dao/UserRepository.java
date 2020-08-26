package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.User;
import com.revature.config.ConnectionUtil;

public class UserRepository implements CrudRepository {
	
	@Override
	public List<User> findAll() {
		try(Connection conn = ConnectionUtil.connect()) {
			String sql = "SELECT * FROM users;";
			Statement statement = conn.createStatement();
			List<User> list = new ArrayList<>();
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				User u = new User();
				u.setName(result.getString("username")); 
				
				list.add(u);
			}
			return list;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}

}
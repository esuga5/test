package com.internousdev.webproj3.dao;

import java.sql.Connection;

import com.internousdev.webproj3.util.DBConnector;

public class TestDAO {
	public int insert(String username,String password){
		int ret=0;
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();


	}

}

package com.sjsu.cmpe226.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sjsu.cmpe226.database.DBConnection;

public class TestDao {

	public void getTest() {
		Connection connection = DBConnection.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from test");
			rs.next();
			int id = rs.getInt(1);
			String name = rs.getString("name");
			System.out.println("Result is : " + id + " " + name);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

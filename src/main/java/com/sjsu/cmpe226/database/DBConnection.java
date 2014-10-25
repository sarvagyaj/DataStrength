package com.sjsu.cmpe226.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static DBConnection dbConnection = new DBConnection();
	public static final String URL = "jdbc:postgresql://127.0.0.1:5432/stackexchange";
	public static final String USER = "postgres";
	public static final String PASSWORD = "root";
	public static final String DRIVER_CLASS = "org.postgresql.Driver";

	private DBConnection() {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Connection createConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static Connection getConnection() {
		return dbConnection.createConnection();
	}
}

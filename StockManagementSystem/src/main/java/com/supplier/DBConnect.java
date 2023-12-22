package com.supplier;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static String url = "jdbc:mysql://localhost:3306/oop_webapp";
	private static String username = "root";
	private static String password = "_Ama25__";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			
			
		}
		catch(Exception e) {
			System.out.println("database connection is not success");
		}
		return con;
    }
}

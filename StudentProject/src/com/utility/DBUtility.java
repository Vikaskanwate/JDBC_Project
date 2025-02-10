package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
//	singleton pattern 
	@SuppressWarnings("unused")
	private static Connection cn = null;
	
	private DBUtility() {
		
	}
	public static Connection getDB() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}	

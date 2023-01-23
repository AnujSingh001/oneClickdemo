package com.google;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/sb201";
		
		try {
			Connection conn= DriverManager.getConnection(url,"root","8168");
			System.out.println("connected");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

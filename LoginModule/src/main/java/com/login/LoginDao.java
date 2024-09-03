package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginDao {
	String sql = "select * from login where uname=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/sharmaji";
	String username = "root"; 
	String password = "12345";
	public boolean check(String uname, String pass)
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connected to the dataase!");
			
			Connection con = DriverManager.getConnection(url,username,password);
	        System.out.println("Connected to the database!");
			
			PreparedStatement st = con.prepareStatement(sql);
	         st.setString(1, uname);
	         st.setString(2, pass);
	         
	         System.out.println("Executing Query:"+ sql);
	         ResultSet rs = st.executeQuery();
	         
	         if(rs.next())
	         {
	        	 System.out.println("User found in the database.");
	        	 return true;
	         }
	         else {
	        	 System.out.println("User not found in the database.");
	         }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}

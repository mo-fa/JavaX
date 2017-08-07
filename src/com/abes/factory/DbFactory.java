package com.abes.factory;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

public class DbFactory {
	Connection con;
	public Connection getMysqlCon(){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nascom?autoReconnect=true&useSSL=false","root","faisal");	
			if (con != null)
			{
				con.setAutoCommit(false);
			}
		}
		catch(ClassNotFoundException e) { System.out.println(e);}  
		catch(SQLException e){ System.out.println(e);} 
		return con;
	}
}

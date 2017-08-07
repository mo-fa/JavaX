package com.abes.dao;
import java.sql.*;
import com.abes.factory.DbFactory;
import com.abes.model.Employee;

public class EmpDAO {
	
	PreparedStatement ps;
	DbFactory df;
	Connection con;
	int result;
	
	public EmpDAO() 
	{
		df = new DbFactory();
		con=df.getMysqlCon();
	}
    
	public int required(Employee e){
		try {
			ps = con.prepareStatement("INSERT INTO emp_tab values (?,?,?)");
			ps.setInt(1,e.getEmpId());
			ps.setString(2,e.getEmpName());
			ps.setInt(3,e.getSalary());
			result = ps.executeUpdate();
			if(result>0){
				con.commit();
			}
			}

		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return result;
	}
}

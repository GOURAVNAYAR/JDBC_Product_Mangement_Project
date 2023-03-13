package com.strore.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.JDBCConnection;

public class JDBCConnectionTest {

	public static void main(String[] args) {
		
		try {
		//Create Statement 	
		Statement stmt = JDBCConnection.getConnection()
				.createStatement();
		//execute query and get result set
		ResultSet rs = stmt.executeQuery("select * from product");
		
		System.out.println("Product Id\tProduct Name\tProduct Detail\tProduct Proice\tProduct Qty");
		while(rs.next()) {
			System.out.print(rs.getLong(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getFloat(4)+"\t");
			System.out.print(rs.getLong(5));
			System.out.println();
		}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

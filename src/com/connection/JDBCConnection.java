package com.connection;

import java.sql.Connection; //
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//Load Driver
		Class.forName("com.mysql.jdbc.Driver");
		//Create Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecorse_batch_2?characterEncoding=utf8", "root", "root");
		return con;
	}
}

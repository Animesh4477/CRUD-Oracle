package com.animesh;
//STEP 1. Import required packages
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Database {
    // take from properties file
	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static final String DB_USER = "system";
	private static final String DB_PASSWORD = "happy";
	public Connection conn;
	
	public void Database() {
		
	}

	
	public void insertRecord(String query) throws SQLException {

		Statement statement = null;
        
		

		try {
			statement = this.conn.createStatement();

			System.out.println(query);

			// execute insert SQL stetement
			statement.executeUpdate(query);

			System.out.println("Record is inserted into emp table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

		}

	}
	
	
	
	public Connection getDBConnection() {
		

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} 
		catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                               DB_CONNECTION, DB_USER,DB_PASSWORD);
			System.out.println(dbConnection); 
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}
	
	public void close() throws SQLException{
		if (this.conn != null) {
		    this.conn.close();
		}
	}
  
}
 
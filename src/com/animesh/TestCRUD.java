package com.animesh;

import java.sql.Connection;
import java.sql.SQLException;

public class TestCRUD {

	public static void main(String[] args) {
		Database db = new Database();
		Connection con = db.getDBConnection();
		db.conn = con;

		// create, insert, delete, update, truncate
	    try {
	    	String query = "INSERT INTO emp"
					+ "(EMPID, EMPNAME, OCCUPATION) " + "VALUES"
					+ "(1,'Animesh','Engineer')";
	    				
	    	db.insertRecord(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    finally {
	    	try {
	    		db.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
	    }

	}

}

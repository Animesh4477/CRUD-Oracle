package com.animesh;

import java.sql.Connection;
import java.sql.SQLException;

public class Delete1 {

	public static void main(String[] args) {
		Database db = new Database();
		Connection con = db.getDBConnection();
		db.conn = con;

		// create, insert, delete, update, truncate
	    	String query = "DELETE emp WHERE EMPID = 1";
	     /* try{      
	    
	    	  
	    	  //delete employee record
	          //String rows = db.executeUpdate("delete from emp where name = 'Animesh'");
	         // System.out.println("Rows deleted = "+ rows); 	  
	    	  
	     
	    	  
	    	  
	    	//db.executeUpdate(query);
			System.out.println("record is deleted from emp table");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    finally {
	    	try {
	    		db.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
	    }*/

	}

}
package com.animesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
 
public class ExampleCRUD_JDBCOperations {
    
    public static void main(String[] args) throws SQLException {
 
        String url ="jdbc:oracle:thin:@localhost:1521:ORCL"; //update connection string
        
        String user = "system";//add your db user id here
        String password = "happy";//add your db password here
        
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Successfully connected");
        
        //insert employee record into database
        Statement stmt = conn.createStatement();
        int rows = stmt.executeUpdate("insert into employee(EMPNAME) values('Animesh')");
        System.out.println("Rows inserted = "+ rows);
        
        //update employee record
        rows= stmt.executeUpdate("Update employee where name='Animesh'");
        System.out.println("Rows updated = "+ rows);
        
        //read employee records
        ResultSet rs = stmt.executeQuery("Select * from employee");
        while(rs.next()){
            System.out.println("Emp Id : " + rs.getInt("EMPID") + ", Name : " + rs.getString("name") + ", Age : " + rs.getInt("age"));
        }
        
        //delete employee record
        rows = stmt.executeUpdate("delete from employee where name = 'Animesh'");
        System.out.println("Rows deleted = "+ rows);
    }
    
 
}
 
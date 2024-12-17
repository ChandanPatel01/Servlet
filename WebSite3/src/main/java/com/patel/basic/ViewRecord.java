package com.patel.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewRecord extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException , IOException {
    	 String driverName = "com.mysql.cj.jdbc.Driver";
    	 String url = "jdbc:mysql://@localhost:3306/chandan?useSSL=false";
    	 String username = "root";
    	 String password = "Cpatel@123456";
    	 String sql = "Select*from Emp1";
    	 
    	
    	 res.setContentType("text/html");
    	 PrintWriter out = res.getWriter();
    	 
    		 
    	 try { 
    		    Class.forName(driverName);
    		    Connection connection = DriverManager.getConnection(url, username, password);
    		    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		    ResultSet resultSet = preparedStatement.executeQuery();
    		    
    		    out.println("<table border= '1' align='center' width='50%'> ");
    		        out.println("<thead>");
    		           out.println(" <th> UserName </th> <th>password</th> ");
    		        out.println("</thead>");
    		    while(resultSet.next()) {
    		    	out.println("<tr>");
    		    	    out.println("<td> "+resultSet.getString(1)+"</td>");
    		    	    out.println("<td> "+resultSet.getInt(2)+"</td>");
    		    	    
    		    	out.println("</tr>");
    		    }
    		    out.println("</table>");
    		   
    		} 
    		catch (ClassNotFoundException ex) {
    		    out.println(ex);
    		}  
    		catch (SQLException ex) {
    		    out.println(ex);
    		}

    	 

 		out.println("<hr>");
 		out.println("<a href = 'record.html'>Back</a>");
    }
}
package com.patel.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.DigestException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateSignup extends HttpServlet
{
	public void doPost( HttpRequest req,HttpResponse res) throws DigestException, IOException
	{
		String driverName="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://@localhost:3306/chandan ? useSSL=false";
		String username = "root";
		String password = "Captel@123456";
		String sql = "update emp1 set password=? where userName=?";
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String userName = req.getParameter("userName");
		String userPassword = req.getParameter("password");
		
		try {
			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(url,username,password);
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, password);
			
			Integer count = ps.executeUpdate();
			out.println("<h1>"+ count + " Record updated</h1>");
				
		}
		catch(ClassNotFoundException e) {
			out.println(e);
		}
		catch(SQLException e) {
			out.println(e);
		}
		
	}
}
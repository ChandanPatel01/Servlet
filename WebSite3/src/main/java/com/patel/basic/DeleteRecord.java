package com.patel.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteRecord extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String driverName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/chandan?useSSL=false";
        String username = "root";
        String password = "Cpatel@123456";

      
        String sql = "delete  from emp1 where userName = ?";

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        
        String userName = req.getParameter("userName");

        try {
            
            Class.forName(driverName);

            Connection connection = DriverManager.getConnection(url, username, password);

            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,userName);

            

         
          Integer count = preparedStatement.executeUpdate();
            out.println("<h1> "+count+"  Delete record</h1>");
        } 
        catch (ClassNotFoundException ex) {
            out.println(ex);
        } 
        catch (SQLException ex) {
            out.println(ex);
        }

        out.println("<a href='updateFile.html'>Back</a>");
    }
}

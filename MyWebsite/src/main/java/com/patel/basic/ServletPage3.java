package com.patel.basic;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPage3 extends HttpServlet {
     protected void service (HttpServletRequest hreq,HttpServletResponse hres)throws ServletException,IOException{
    	 
    	 PrintWriter out=hres.getWriter();
 		hres.setContentType("text/html");
 		out.println("<html>");
 		out.println("<body>");
 		out.println("<h1>");
 		out.println(" <font color='blue'>Code Excuted..... ");
 		out.println("</h1>");
 		out.println("<hr><br><br>");
		out.println("<a href='index.html'>Home</a>");
 		out.println("</body>");
 		   out.println("</html>");
 			
     }
}


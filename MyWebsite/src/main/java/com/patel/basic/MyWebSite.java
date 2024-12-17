package com.patel.basic;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.Servlet;

public  class MyWebSite implements Servlet {

	public void init (ServletConfig sc)throws ServletException{
		
		
	}
	
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println(" <font color='red'>Jagte raho Bhai ");
		out.println("</h1>");
		out.println("<hr><br><br>");
		out.println("<a href='index.html'>Home</a>");
		out.println("</body>");
		   out.println("</html>");
			
		
	}
	
	public void destroy() {
		
	}
	
	public ServletConfig getServletConfig() {
		return null;
	}
	
	public String getServletInfo() {
		return null;
	}
	
	
	
}
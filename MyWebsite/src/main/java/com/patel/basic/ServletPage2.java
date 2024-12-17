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

public class ServletPage2 extends GenericServlet {
	 public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		 PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>");
			out.println(" <font color='green'>Jagte nhi  raho Bhai ");
			out.println("</h1>");
			out.println("<hr><br><br>");
			out.println("<a href='index.html'>Home</a>");
			out.println("</body>");
			   out.println("</html>");
	 }
	 

}

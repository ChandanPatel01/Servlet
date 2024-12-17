package com.patel.basic;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintTable extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		Integer num = Integer.parseInt(req.getParameter("num"));
		out.println("<table cellpadding='5' cellspacing='3' border='2'  width: 100%; ,background-color:yellow;'>");

		for (int i = 1; i <= 10; i++) {
			out.println("<tr>");
			out.println("<td>  " + num + "   </td>");
			out.println("<td> * </td>");
			out.println("<td>" + i + "</td>");
			out.println("<td> = </td>");
			out.println("<td>" + (num * i) + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<hr>");
		out.println("<a href='index.html'>Home</a>");
		
	}

}

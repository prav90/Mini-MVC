package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.TechSuggestor;

public class TechSelect extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		TechSuggestor suggestor = new TechSuggestor();
//		out.println("Tech Selection Advice <br/>");
		String c = request.getParameter("feature");
//		out.println("Suggested Lanugaes for "+c);
//		for(String lang : suggestor.getLanguageSuggestions(c)) {
//			out.println(lang+"<br/>");
//		}
		request.setAttribute("languages", suggestor.getLanguageSuggestions(c));
		RequestDispatcher view = request.getRequestDispatcher("TechSuggest.jsp");
		view.forward(request, response);
		
	}
}

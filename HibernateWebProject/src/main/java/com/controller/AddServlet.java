package com.controller;

import java.io.PrintWriter;

import com.dao.AddRecord;
import com.entity.Student;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String course = req.getParameter("course");
		
		Student st = new Student(id,name,course);
		
		AddRecord.Add(st);
		
		try(PrintWriter out = res.getWriter()){
			out.println("<h1>Record Inserted Sucessfully</h1>");
			out.println("<a href='index.html'> Return to Index</a>");
		}catch(Exception e) {
			System.out.println("in the AddServlet class" + e);
		}
	}
}	

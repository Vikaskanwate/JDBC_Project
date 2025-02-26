package com.controller;

import java.io.PrintWriter;
import com.dao.UpdateRecord;
import com.entity.Student;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		
		res.setContentType("text/html");
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String course = req.getParameter("course");
		
		Student st = new Student(id,name,course);
		
		UpdateRecord.Update(st);
		
		try(PrintWriter out = res.getWriter()){
			out.println("<h1>Record updated Sucessfully</h1>");
			out.println("<a href='index.html'> Return to Index</a>");
		}catch(Exception e) {
			System.out.println("in the AddServlet class" + e);
		}
	}	
}

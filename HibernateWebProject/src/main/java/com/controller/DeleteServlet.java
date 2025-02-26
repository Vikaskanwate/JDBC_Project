package com.controller;

import java.io.PrintWriter;

import com.dao.DeleteRecord;
import com.entity.Student;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		
		String id = req.getParameter("id");
		
		Student st = new Student();
		
		st.setStudentID(id);
		
		DeleteRecord.Delete(st);
		
		try(PrintWriter out = res.getWriter()){
			out.println("<h1>Record Deleted Sucessfully</h1>");
			out.println("<button><a href='index.html'> Return to Index</a></button>");
		}catch(Exception e) {
			System.out.println("in the DeleteServlet class" + e);
		}
		
	}
}

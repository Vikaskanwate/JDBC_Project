package com.controller;


import java.io.IOException;
import java.io.PrintWriter;

import com.dao.SelectByIdRecord;
import com.entity.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SelectByIdServlet")
public class SelectByIdServlet extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		String id = req.getParameter("id");
		
		Student st = new Student();
		
		st.setStudentID(id);
		
		String a = st.getStudentID();	
		
		Student stud = SelectByIdRecord.SelectById(a);
		
		String sid = stud.getStudentID();
		String course = stud.getCourse();
		String name = stud.getName();
		
		System.out.println(sid);
		System.out.println(course);
		System.out.println(name);
		
		req.setAttribute("sid",sid);
		req.setAttribute("course", course);
		req.setAttribute("name", name);
		
		RequestDispatcher dis = req.getRequestDispatcher("ById.jsp");
		dis.forward(req, res);
	}
}	

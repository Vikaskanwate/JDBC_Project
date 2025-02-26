package com.controller;

import java.io.IOException;
import java.util.List;

import com.dao.SelectRecord;
import com.entity.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		List<Student> stList = SelectRecord.Select();
		if(stList == null) {
			System.out.println("problem");
		}else {
			System.out.println("no");
		}
		req.setAttribute("StudentList",stList);
		
		RequestDispatcher dis = req.getRequestDispatcher("/Select.jsp");
		dis.forward(req, res);
	}
}

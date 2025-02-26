package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.Student;
import com.uitlity.HibernateUtility;

public class SelectRecord {
	
	public static List<Student> Select() {
		
		SessionFactory sf = HibernateUtility.getSessionFactory();
		
		Session s = sf.openSession();
		
		
		String hql = "from Student";
		
		Query<Student> query = s.createQuery(hql,Student.class);
	
		List<Student> st = query.list();
	      if (st != null && !st.isEmpty()) {
	            for (Student student : st) {
	                System.out.println(student);
	            }
	        } else {
	            System.out.println("No students found.");
	        }

		s.close();
		return st;
	}
}

package com.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.uitlity.HibernateUtility;

public class AddRecord {
	
	public static void Add(Student stud) {
		
		SessionFactory sf = HibernateUtility.getSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		s.save(stud);
		
		tx.commit();
		
		s.close();
		
		System.out.println("Record added sucessfully");
	}
}

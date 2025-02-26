package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.uitlity.HibernateUtility;

public class UpdateRecord {
	
	public static void Update(Student stud) {
		
		SessionFactory sf = HibernateUtility.getSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		s.update(stud);
		
		tx.commit();
		
		s.close();
		
		System.out.println("update completed successfully");
	}
}

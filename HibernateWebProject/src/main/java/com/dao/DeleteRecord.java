package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.uitlity.HibernateUtility;

public class DeleteRecord {
	
	public static void Delete(Student stud){
		
		SessionFactory sf = HibernateUtility.getSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		s.delete(stud);
		
		tx.commit();
		
		s.close();
		
		System.out.println("delete sucessfully");
	}
}

package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.uitlity.HibernateUtility;

public class SelectByIdRecord {
	public static Student SelectById(String id){
		
		SessionFactory sf = HibernateUtility.getSessionFactory();
		
		Session s = sf.openSession();
		
		Student st = s.get(Student.class, id);
		
		s.close();
		
		return st;
	}
}
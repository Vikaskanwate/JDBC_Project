package com.uitlity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	
	private HibernateUtility() {
		
	}
	
	private static SessionFactory factory;
	
	public synchronized static SessionFactory getSessionFactory() {
		if(factory == null) {
			return new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
}

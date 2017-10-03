package com.m2i.formation.dao.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final Logger l = Logger.getLogger(HibernateUtil.class);

	private static final SessionFactory sessionFactory;

	static {
		try {
			l.info("Je suis bien dans la SessionFactory");
			// Créer une SessionFactory à partir de hibernate.cfg.xml
			sessionFactory = new Configuration().configure().buildSessionFactory();
			l.info("Je suis bien sorti de la SessionFactory");
		} catch (Throwable ex) {
			// Gestion exception
			l.error("Echec création SessionFactory" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}

package com.m2i.formation.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.m2i.formation.dao.entity.Formation;
import com.m2i.formation.dao.util.HibernateUtil;

public class DemoHibernate {

	private static final Logger l = Logger.getLogger(DemoHibernate.class);

	public void createFormation(Formation f) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(f);
		l.info("Clé primaire :");
		tx.commit();
		session.close();
		

	}

	public void deleteFormation(Formation f) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete(f);
		l.info(" Session deleted :");
		tx.commit();
		session.close();
	}

	public void updateFormation(Formation f) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(f);
		l.info(" Session updated :");
		tx.commit();
		session.close();
	}
	
	public Formation selectFormation(int id) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction tx = session.beginTransaction();
		Formation f = session.load(Formation.class, id);
		l.info(" Le theme est :" + f.getTheme());
		tx.commit();
		session.close();
		
		return f;
		
	}
}

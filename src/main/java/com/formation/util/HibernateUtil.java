package com.formation.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory factory;

	private HibernateUtil() {

		factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();

	}

	public static SessionFactory getConnection() {

		if (factory == null) {
			System.out.println("Nouvelle connexion à la BD");
			new HibernateUtil();

		} else {
			System.out.println("La connexion existe déjà");

		}
		return factory;

	}

}

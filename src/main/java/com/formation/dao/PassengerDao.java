package com.formation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.formation.models.Passenger;
import com.formation.util.HibernateUtil;

public class PassengerDao extends GenericDao<Passenger>{

	@Override
	public Passenger getById(int id) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Passenger p = s.get(Passenger.class, id);
		s.close();
		return p;
	}

	@Override
	public List<Passenger> findAll() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();

		Query query = s.createQuery("FROM passenger");
		List<Passenger> passengers = query.getResultList();
		s.close();
		return passengers;
	}
}

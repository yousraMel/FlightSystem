package com.formation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.formation.models.Seat;
import com.formation.util.HibernateUtil;

public class SeatDao extends GenericDao<Seat>{

	@Override
	public Seat getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seat> findAll() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();

		Query query = s.createQuery("FROM seat");
		List<Seat> seats = query.getResultList();
		s.close();
		return seats;
	}

}

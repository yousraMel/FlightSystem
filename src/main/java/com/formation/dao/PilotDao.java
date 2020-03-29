package com.formation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.formation.models.Pilot;
import com.formation.util.HibernateUtil;

public class PilotDao extends GenericDao<Pilot>{

	@Override
	public Pilot getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pilot> findAll() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();

		Query query = s.createQuery("FROM pilot");
		List<Pilot> pilots = query.getResultList();
		s.close();
		return pilots;
		
	}
	
	

}

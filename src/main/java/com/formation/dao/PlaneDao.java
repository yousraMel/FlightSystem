package com.formation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.formation.idao.IPlaneDao;
import com.formation.models.Plane;
import com.formation.util.HibernateUtil;

public class PlaneDao extends GenericDao<Plane> implements IPlaneDao{

	@Override
	public Plane getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plane> findAll() {
		return null;
	}

	@Override
	public List<Plane> getAll() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		List<Plane> planes = null;
		try {
			Query query = s.createSQLQuery("SELECT * FROM plane").addEntity(Plane.class);
			planes = query.getResultList();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}return planes;
	}
	
	

}

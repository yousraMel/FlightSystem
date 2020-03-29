package com.formation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.formation.idao.IGenericDao;
import com.formation.util.HibernateUtil;

public abstract class GenericDao<G> implements IGenericDao<G> {

	@Override
	public void add(G g){
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(g);
		tx.commit();
		s.close();

	}

	@Override
	public void update(G g) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.update(g);
		tx.commit();
		s.close();

	}

	@Override
	public void delete(G g) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(g);
		tx.commit();
		s.close();

	}

	@Override
	public abstract G getById(int id);

	@Override
	public abstract List<G> findAll();

}

package com.formation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.formation.idao.ICompanyDao;
import com.formation.models.Company;
import com.formation.util.HibernateUtil;



public class CompanyDao extends GenericDao<Company> implements ICompanyDao{

	@Override
	public Company getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> findAll() {
		return null;
	}

	@Override
	public List<Company> getAll() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		List<Company> companies = null;
		try {
			Query query = s.createSQLQuery("SELECT * FROM company").addEntity(Company.class);
			companies = query.getResultList();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}return companies;
	}
	
}

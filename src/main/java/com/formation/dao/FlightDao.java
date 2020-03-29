package com.formation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.formation.idao.IFlightDao;
import com.formation.models.Flight;
import com.formation.util.HibernateUtil;

public class FlightDao extends GenericDao<Flight> implements IFlightDao {

	@Override
	public Flight getById(int id) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Flight flight = null;
		try {
			Query query = s.createNativeQuery("SELECT * FROM flight WHERE flightNb =?1", Flight.class).setParameter(1,id);
			flight = (Flight) query.getSingleResult();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}return flight;
	}

	@Override
	public List<Flight> findAll() {
		// TODO Auto-generated method stub
				return null;
	}
	
	

	@Override
	public List<Flight> getAll() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		List<Flight> flights = null;
		try {
			Query query = s.createSQLQuery("SELECT * FROM flight").addEntity(Flight.class);
			flights = query.getResultList();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}return flights;
	}

	@Override
	public List<Flight> findByCities(Flight f) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		List<Flight> flights = null;
		try {
			Query query = s.createSQLQuery("SELECT * FROM flight WHERE departureCity = '" + f.getDepartureCity() + "' AND arrivalCity = '" + f.getArrivalCity() + "';")
					.addEntity(Flight.class);
			flights = query.getResultList();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}return flights;
		
		
	}
	
	

}

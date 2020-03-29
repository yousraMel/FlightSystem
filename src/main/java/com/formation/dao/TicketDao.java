package com.formation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.formation.idao.iTicketDao;
import com.formation.models.Flight;
import com.formation.models.Ticket;
import com.formation.util.HibernateUtil;

public class TicketDao extends GenericDao<Ticket> implements iTicketDao {

	@Override
	public Ticket getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> findAll() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query query = s.createSQLQuery("SELECT * FROM ticket").addEntity(Ticket.class);
		List<Ticket> tickets = query.getResultList();
		s.close();
		return tickets;
	}

	@Override
	public List<Ticket> findByFlight(Flight flight) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query query = s.createSQLQuery("SELECT * FROM ticket WHERE idFlight = " + flight.getFlightNb() + ";")
				.addEntity(Ticket.class);
		List<Ticket> tickets = query.getResultList();
		s.close();
		return tickets;
	}

}

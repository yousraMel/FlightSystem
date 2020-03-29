package com.formation.idao;

import java.util.List;

import com.formation.models.Flight;
import com.formation.models.Ticket;

public interface iTicketDao {
	
	public List<Ticket> findByFlight(Flight flight);
	

}

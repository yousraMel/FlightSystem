package com.formation.idao;

import java.util.List;

import com.formation.models.Flight;

public interface IFlightDao {
	
	public List<Flight> findByCities(Flight f);
	public List<Flight> getAll();
	
	

}
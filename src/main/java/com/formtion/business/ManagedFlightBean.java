package com.formtion.business;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.formation.dao.FlightDao;
import com.formation.idao.IFlightDao;
import com.formation.idao.IGenericDao;
import com.formation.models.Flight;

@ManagedBean(name="flightBean")
@SessionScoped
public class ManagedFlightBean {

	private IGenericDao<Flight> daoFlG = new FlightDao();
	private IFlightDao daoFl = new FlightDao();
	private Flight flight = new Flight();
	private List<Flight> flightsByCities;
	private List<Flight> flights;

	public ManagedFlightBean() {
		super();
	}

	public ManagedFlightBean(IFlightDao daoFl, Flight flight, List<Flight> flightsByCities) {
		super();
		this.daoFl = daoFl;
		this.flight = flight;
		this.flightsByCities = flightsByCities;
	}
	
	public IFlightDao getDaoFl() {
		return daoFl;
	}

	public void setDaoFl(IFlightDao daoFl) {
		this.daoFl = daoFl;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public IGenericDao<Flight> getDaoFlG() {
		return daoFlG;
	}

	public void setDaoFlG(IGenericDao<Flight> daoFlG) {
		this.daoFlG = daoFlG;
	}

	public List<Flight> citiesFlightsList() {
		System.out.println("citiesflightList:" + flight);
		 return daoFl.findByCities(flight);
	}
	public List<Flight> getFlightsByCities() {
		System.out.println("flightsBycity:" + flight);
		flightsByCities = citiesFlightsList();
		return flightsByCities;
	}

	public void setFlightsByCities(List<Flight> flightsByCities) {
		this.flightsByCities = flightsByCities;
	}
	
	public List<Flight> flightsList() {
		System.out.println("flightList:" + daoFl.getAll());
		 return daoFl.getAll();
	}

	public List<Flight> getFlights() {
		return flightsList();
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
	public String goAllFlightsPage() {
		System.out.println("goAllFlightPage:" +flight);
		return "admin_flights";
	}
	
	public String goFlightsPage() {
		System.out.println("goFlightPage:" +flight);
		return "flights_page";
	}
	

	public String show(Flight flightToUpdate) {
		flight = flightToUpdate;
		System.out.println("flightToUpdate:" + flight);
		return ("flight_form.xhtml");
	}
	public String create() {
		System.out.println("From flight form:" + flight );		
		if(daoFlG.getById(flight.getFlightNb()) == null ) {
			daoFlG.add(flight);
		}else {
			daoFlG.update(flight);
		}
		return ("admin_flights.xhtml");
	}
	
	public void remove(Flight flight) {
		daoFlG.delete(daoFlG.getById(flight.getFlightNb()));
	}
	
	

}

package com.formtion.business;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.formation.dao.PassengerDao;
import com.formation.dao.TicketDao;
import com.formation.idao.IGenericDao;
import com.formation.models.Address;
import com.formation.models.Flight;
import com.formation.models.Passenger;
import com.formation.models.Ticket;


@ManagedBean(name = "ticketBean")
@SessionScoped
public class ManagedBeanTicket {

	private IGenericDao<Ticket> daoTcG = new TicketDao();
	private IGenericDao<Passenger> daoP = new PassengerDao();
	private Ticket ticket = new Ticket();
	private List<Ticket> tickets;
	private Flight selectedFlight = new Flight();
	private Passenger passenger = new Passenger();
	private Date inputBirthDate = new Date();
	private Address address = new Address();

	public ManagedBeanTicket() {
		super();
	}

	public Date getInputBirthDate() {
		return inputBirthDate;
	}

	public void setInputBirthDate(Date inputBirthDate) {
		this.inputBirthDate = inputBirthDate;
	}

	public IGenericDao<Passenger> getDaoP() {
		return daoP;
	}

	public void setDaoP(IGenericDao<Passenger> daoP) {
		this.daoP = daoP;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getSelectedFlight() {
		return selectedFlight;
	}

	public void setSelectedFlight(Flight selectedFlight) {
		this.selectedFlight = selectedFlight;
	}

	public String goBookingForm() {
		return ("booking_form.xhtml");
	}

	public String show(Ticket ticket, Flight flight, Passenger passenger) {
		System.out.println("Flight in ticket" + selectedFlight);
		return ("ticket_page.xhtml");
	}

	public String create() {
		System.out.println("selectedFlight:" + selectedFlight);
		System.out.println("passenger:" + passenger);
		System.out.println("Birth Date :" + inputBirthDate);
		passenger.setAddress(address);
		ticket.setReservationDate(LocalDate.now());
		passenger.setBirthDate(inputBirthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		daoP.add(passenger);
		ticket.setPassenger(passenger);
		ticket.setFlight(selectedFlight);
		daoTcG.add(ticket);
		return show(ticket, selectedFlight, passenger);
	}

	public IGenericDao<Ticket> getDaoTcG() {
		return daoTcG;
	}

	public void setDaoTcG(IGenericDao<Ticket> daoTcG) {
		this.daoTcG = daoTcG;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

}

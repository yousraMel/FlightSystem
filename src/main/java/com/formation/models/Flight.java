package com.formation.models;

import java.text.ParseException; 
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Flight {

	@Id
	private int flightNb;

	@Column(columnDefinition = "DATE")
	private Date departureDate;

	@Column(columnDefinition = "DATE")
	private Date arrivalDate;

	@Column(columnDefinition = "TIME")
	private Date departureTime;

	@Column(columnDefinition = "TIME")
	private Date arrivalTime;

	private String departureCity;

	private String arrivalCity;

	@OneToMany(mappedBy = "flight")
	private List<Ticket> ticketsByFlight;

	@ManyToOne
	@JoinColumn(name = "idPlane")
	private Plane plane;

	@ManyToOne
	@JoinColumn(name = "idCompany")
	private Company company;

	public Flight() {
		super();
	}

	public Flight(int flightNb, Date departureDate, Date arrivalDate, Date departureTime,
			Date arrivalTime, String departureCity, String arrivalCity) {
		super();
		this.flightNb = flightNb;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
	}

	public Flight(int flightNb, Date departureDate, Date arrivalDate, Date departureTime,
			Date arrivalTime, String departureCity, String arrivalCity, List<Ticket> ticketsByFlight, Plane plane,
			Company company) {
		super();
		this.flightNb = flightNb;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.ticketsByFlight = ticketsByFlight;
		this.plane = plane;
		this.company = company;
	}
	
	

	public Flight(int flightNb, Date departureDate, Date arrivalDate, Date departureTime,
			Date arrivalTime, String departureCity, String arrivalCity, Plane plane, Company company) {
		super();
		this.flightNb = flightNb;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.plane = plane;
		this.company = company;
	}

	public int getFlightNb() {
		return flightNb;
	}

	public void setFlightNb(int flightNb) {
		this.flightNb = flightNb;
	}

	public Date getDepartureDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
	
		try {
			departureDate= simpleDateFormat.parse(departureDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("PST")); 
		try {
			arrivalDate= simpleDateFormat.parse(arrivalDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getDepartureTime() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm"); 
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("PST")); 
		try {
			departureTime= simpleDateFormat.parse(departureTime.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm"); 
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("PST")); 
		try {
			arrivalTime= simpleDateFormat.parse(arrivalTime.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public List<Ticket> getTicketsByFlight() {
		return ticketsByFlight;
	}

	public void setTicketsByFlight(List<Ticket> ticketsByFlight) {
		this.ticketsByFlight = ticketsByFlight;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Flight [flightNb=" + flightNb + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", departureCity="
				+ departureCity + ", arrivalCity=" + arrivalCity + "]";
	}

}

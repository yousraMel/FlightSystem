package com.formation.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketNb;

	@Column(columnDefinition = "DATE")
	private LocalDate emmissionDate;

	@Column(columnDefinition = "DATE")
	private LocalDate reservationDate;

	@Column(columnDefinition = "DATE")
	private LocalDate paymentDate;

	@ManyToOne
	@JoinColumn(name = "idPassenger")
	private Passenger passenger;

	@ManyToOne
	@JoinColumn(name = "idFlight")
	private Flight flight;

	public Ticket() {
		super();
	}

	public Ticket(int ticketNb, LocalDate emmissionDate, LocalDate reservationDate, LocalDate paymentDate) {
		super();
		this.ticketNb = ticketNb;
		this.emmissionDate = emmissionDate;
		this.reservationDate = reservationDate;
		this.paymentDate = paymentDate;
	}
	

	public Ticket(LocalDate reservationDate, Passenger passenger, Flight flight) {
		super();
		this.reservationDate = reservationDate;
		this.passenger = passenger;
		this.flight = flight;
	}

	public Ticket(int ticketNb, LocalDate emmissionDate, LocalDate reservationDate, LocalDate paymentDate,
			Passenger passenger, Flight flight) {
		super();
		this.ticketNb = ticketNb;
		this.emmissionDate = emmissionDate;
		this.reservationDate = reservationDate;
		this.paymentDate = paymentDate;
		this.passenger = passenger;
		this.flight = flight;
	}

	public int getTicketNb() {
		return ticketNb;
	}

	public void setTicketNb(int ticketNb) {
		this.ticketNb = ticketNb;
	}

	public LocalDate getEmmissionDate() {
		return emmissionDate;
	}

	public void setEmmissionDate(LocalDate emmissionDate) {
		this.emmissionDate = emmissionDate;
	}

	public LocalDate getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Ticket [ticketNb=" + ticketNb + ", emmissionDate=" + emmissionDate + ", reservationDate="
				+ reservationDate + ", paymentDate=" + paymentDate + "]";
	}

}

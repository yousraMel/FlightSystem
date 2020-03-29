package com.formation.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Passenger {

	@Id
	private int passportNb;

	@Column(nullable = false, length = 14)
	private String firstName;

	@Column(nullable = false, length = 14)
	private String lastName;

	@Column(columnDefinition = "DATE")
	private LocalDate birthDate;

	@Column(unique = true, nullable = false)
	private int mobile;

	@Column(unique = true, nullable = false)
	private String mail;

	@Embedded
	private Address address;

	@OneToMany(mappedBy = "passenger")
	private List<Ticket> ticketsByPassenger;

	public Passenger() {
		super();
	}

	public Passenger(int passportNb, String firstName, String lastName, LocalDate birthDate, int mobile, String mail,
			Address address) {
		super();
		this.passportNb = passportNb;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.mobile = mobile;
		this.mail = mail;
		this.address = address;
	}

	public Passenger(int passportNb, String firstName, String lastName, LocalDate birthDate, int mobile, String mail,
			Address address, List<Ticket> ticketsByPassenger) {
		super();
		this.passportNb = passportNb;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.mobile = mobile;
		this.mail = mail;
		this.address = address;
		this.ticketsByPassenger = ticketsByPassenger;
	}

	public int getPassportNb() {
		return passportNb;
	}

	public void setPassportNb(int passportNb) {
		this.passportNb = passportNb;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Ticket> getTicketsByPassenger() {
		return ticketsByPassenger;
	}

	public void setTicketsByPassenger(List<Ticket> ticketsByPassenger) {
		this.ticketsByPassenger = ticketsByPassenger;
	}

	@Override
	public String toString() {
		return "Passenger [passportNb=" + passportNb + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + ", mobile=" + mobile + ", mail=" + mail + ", address=" + address + "]";
	}

}

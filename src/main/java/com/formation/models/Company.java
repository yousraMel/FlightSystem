package com.formation.models;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

	@Id
	private int companyCode;

	private String name;

	private String mainOffice;

	@Embedded
	private Address address;

	private String turnover;

	@OneToMany(mappedBy = "company")
	private List<Flight> flightsByCompany;

	public Company() {
		super();
	}

	public Company(int companyCode, String name, String mainOffice, Address address, String turnover) {
		super();
		this.companyCode = companyCode;
		this.name = name;
		this.mainOffice = mainOffice;
		this.address = address;
		this.turnover = turnover;
	}
	
	

	public Company(int companyCode, String name, String mainOffice, Address address, String turnover,
			List<Flight> flightsByCompany) {
		super();
		this.companyCode = companyCode;
		this.name = name;
		this.mainOffice = mainOffice;
		this.address = address;
		this.turnover = turnover;
		this.flightsByCompany = flightsByCompany;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companycCode) {
		this.companyCode = companycCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainOffice() {
		return mainOffice;
	}

	public void setMainOffice(String mainOffice) {
		this.mainOffice = mainOffice;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getTurnover() {
		return turnover;
	}

	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	
	public List<Flight> getFlightsByCompany() {
		return flightsByCompany;
	}

	public void setFlightsByCompany(List<Flight> flightsByCompany) {
		this.flightsByCompany = flightsByCompany;
	}

	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", name=" + name + ", mainOffice=" + mainOffice + ", address="
				+ address + ", turnover=" + turnover + "]";
	}

}

package com.formation.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Plane {

	@Id
	private int planeCode;

	private String planeType;

	private String planeModel;

	private int numberOfPassengers;

	@OneToMany(mappedBy = "plane")
	private List<Seat> seatsByPlane;

	@OneToOne
	@JoinColumn(unique = true)
	private Pilot pilot;
	
	@OneToMany(mappedBy = "plane")
	private List<Flight> flightsByPlane;

	public Plane() {
		super();
	}

	public Plane(int planeCode, String planeType, String planeModel, int numberOfPassengers) {
		super();
		this.planeCode = planeCode;
		this.planeType = planeType;
		this.planeModel = planeModel;
		this.numberOfPassengers = numberOfPassengers;
	}

	public Plane(int planeCode, String planeType, String planeModel, int numberOfPassengers, List<Seat> seatsByPlane,
			Pilot pilot) {
		super();
		this.planeCode = planeCode;
		this.planeType = planeType;
		this.planeModel = planeModel;
		this.numberOfPassengers = numberOfPassengers;
		this.seatsByPlane = seatsByPlane;
		this.pilot = pilot;
	}
	
	

	public Plane(int planeCode, String planeType, String planeModel, int numberOfPassengers, Pilot pilot) {
		super();
		this.planeCode = planeCode;
		this.planeType = planeType;
		this.planeModel = planeModel;
		this.numberOfPassengers = numberOfPassengers;
		this.pilot = pilot;
	}

	public int getPlaneCode() {
		return planeCode;
	}

	public void setPlaneCode(int planeCode) {
		this.planeCode = planeCode;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public String getPlaneModel() {
		return planeModel;
	}

	public void setPlaneModel(String planeModel) {
		this.planeModel = planeModel;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public List<Seat> getSeatsByPlane() {
		return seatsByPlane;
	}

	public void setSeatsByPlane(List<Seat> seatsByPlane) {
		this.seatsByPlane = seatsByPlane;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		return "Plane [planeCode=" + planeCode + ", planeType=" + planeType + ", planeModel=" + planeModel
				+ ", numberOfPassengers=" + numberOfPassengers + "]";
	}

}

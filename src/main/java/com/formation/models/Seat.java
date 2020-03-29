package com.formation.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Seat {

	@Id
	private int seatNb;

	private String classe;

	@ManyToOne
	@JoinColumn(name = "idPlane")
	private Plane plane;

	public Seat() {
		super();
	}

	public Seat(int seatNb, String classe) {
		super();
		this.seatNb = seatNb;
		this.classe = classe;
	}

	public Seat(int seatNb, String classe, Plane plane) {
		super();
		this.seatNb = seatNb;
		this.classe = classe;
		this.plane = plane;
	}

	public int getSeatNb() {
		return seatNb;
	}

	public void setSeatNb(int seatNb) {
		this.seatNb = seatNb;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	@Override
	public String toString() {
		return "Seat [seatNb=" + seatNb + ", classe=" + classe + "]";
	}

}

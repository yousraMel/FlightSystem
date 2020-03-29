package com.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pilot {

	@Id
	private int matricul;
	
	@Column(nullable=false, length= 14)
	private String firstName;
	
	@Column(nullable=false, length= 14)
	private String lastName;
	
	private String grade;
	
	public Pilot() {
		super();
	}

	public Pilot(int matricul, String firstName, String lastName, String grade) {
		super();
		this.matricul = matricul;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}

	public int getMatricul() {
		return matricul;
	}

	public void setMatricul(int matricul) {
		this.matricul = matricul;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Pilot [matricul=" + matricul + ", firstName=" + firstName + ", lastName=" + lastName + ", grade="
				+ grade + "]";
	}

}

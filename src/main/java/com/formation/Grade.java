package com.formation;

public enum Grade {
	
	Pilote_Eleve(1), Pilote_Prive(2), Pilote_Cadet(3), Pilote_Officier(4), Pilote_Commandant(5);

	public final int value;
	
	private Grade(int value) {
		this.value = value;
	}
}

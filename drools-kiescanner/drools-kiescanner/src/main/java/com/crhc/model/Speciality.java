package com.crhc.model;

public class Speciality {

	private String speciality;
	
	public Speciality() {
		super();
		
	}
	
	public Speciality(String speciality) {
		super();
		System.out.println("This is Speciality class const setspecilaity"+speciality);
		this.speciality=speciality;
	}

	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		System.out.println("This is speciality class setspecilaity"+speciality);
		this.speciality = speciality;
	}
	
	
	
	@Override
	public String toString() {
		System.out.println("This is request class  stringtostring"+speciality);
		return "Speciality [speciality=" + speciality + "]";
	}

}

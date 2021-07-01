package com.crhc.model;

public class Request {

	//We have used two objects patient and speciality to pass to excel 
	// it has getter and setter method for patient and speciality object
	Patient patient;
	Speciality speciality;
	
	public Request() {
		super();
		
	}
	public Request(Patient patient, Speciality speciality) {
		super();
		this.patient = patient;
		this.speciality = speciality;
	}
	
	public Speciality getSpeciality() {
		return speciality;
	}
	public void setSpeciality(Speciality speciality) {
		System.out.println("This is request class setspecilaity"+speciality);
		this.speciality = speciality;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		System.out.println("This is request class setPatient"+patient);
		this.patient = patient;
	}
	
	@Override
	public String toString() {
		return "Request [patient=" + patient + ", speciality=" + speciality + "]";
	}
}

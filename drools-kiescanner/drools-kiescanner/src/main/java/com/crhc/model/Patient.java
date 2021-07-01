package com.crhc.model;

public class Patient{
	private double age;
	private String categotyReason;
	private String selectedEvent;
	private String selectedEventId;
	private String payer;
	private int annualwellnessdatePriorBy;
	private int proceduredatePriorBy;
	private boolean concussion;
	private boolean establishedPatient;
	private boolean hasPCP;
	private int annualphysicaldatePriorBy;
	private String categotyId;
	private String payerId;
	private String finalselectedEvent;
	
	// this class contains getter and setter methods
	public Patient() {
		super();
		
	}
	
	public Patient(double age, String categotyReason, String selectedEvent, String selectedEventId, String payer,
			int annualwellnessdatePriorBy, int proceduredatePriorBy, boolean concussion, boolean establishedPatient,
			boolean hasPCP, int annualphysicaldatePriorBy, String categotyId,String payerId,String finalselectedEvent){
		super();
		this.age = age;
		this.categotyReason = categotyReason;
		this.selectedEvent = selectedEvent;
		this.selectedEventId = selectedEventId;
		this.payer = payer;
		this.annualwellnessdatePriorBy = annualwellnessdatePriorBy;
		this.proceduredatePriorBy = proceduredatePriorBy;
		this.concussion = concussion;
		this.establishedPatient = establishedPatient;
		this.hasPCP = hasPCP;
		this.annualphysicaldatePriorBy = annualphysicaldatePriorBy;
		this.categotyId=categotyId;
		this.payerId=payerId;
		this.finalselectedEvent=finalselectedEvent;
	}

	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		System.out.println("This is Patiet class setAge"+age);
		this.age = age;
	}
	public String getCategotyReason() {
		return categotyReason;
	}
	public void setCategotyReason(String categotyReason) {
		System.out.println("This is Patiet class setcategor"+categotyReason);
		this.categotyReason = categotyReason;
	}
	public String getSelectedEvent() {
		return selectedEvent;
	}
	public void setSelectedEvent(String selectedEvent) {
		System.out.println("This is Patiet class setSelectedEvent"+selectedEvent);
		this.selectedEvent = selectedEvent;
	}
	public String getSelectedEventId() {
		return selectedEventId;
	}
	public void setSelectedEventId(String selectedEventId) {
		System.out.println("This is Patiet class setselectedid"+selectedEventId);
		this.selectedEventId = selectedEventId;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public int getAnnualwellnessdatePriorBy() {
		return annualwellnessdatePriorBy;
	}
	public void setAnnualwellnessdatePriorBy(int annualwellnessdatePriorBy) {
		this.annualwellnessdatePriorBy = annualwellnessdatePriorBy;
	}
	
	public String getCategotyId() {
		return categotyId;
	}
	public void setCategotyId(String categotyId) {
		System.out.println("This is Patiet class setcategoryid"+categotyId);
		this.categotyId = categotyId;
	}
	
	public String getPayerId() {
		return payerId;
	}
	public void setPayerId(String payerId) {
		System.out.println("This is Patiet class setcategoryid"+categotyId);
		this.payerId = payerId;
	}
	public int getProceduredatePriorBy() {
		return proceduredatePriorBy;
	}
	public void setProceduredatePriorBy(int proceduredatePriorBy) {
		this.proceduredatePriorBy = proceduredatePriorBy;
	}
	public boolean isConcussion() {
		return concussion;
	}
	public void setConcussion(boolean concussion) {
		this.concussion = concussion;
	}
	public boolean isEstablishedPatient() {
		return establishedPatient;
	}
	public void setEstablishedPatient(boolean establishedPatient) {
		this.establishedPatient = establishedPatient;
	}
	public boolean isHasPCP() {
		return hasPCP;
	}
	public void setHasPCP(boolean hasPCP) {
		this.hasPCP = hasPCP;
	}
	public int getAnnualphysicaldatePriorBy() {
		return annualphysicaldatePriorBy;
	}
	public void setAnnualphysicaldatePriorBy(int annualphysicaldatePriorBy) {
		this.annualphysicaldatePriorBy = annualphysicaldatePriorBy;
	}

	@Override
	public String toString() {
		return "Patient [age=" + age + ",categotyId=" + categotyId +", categotyReason=" + categotyReason + ", selectedEvent=" + selectedEvent
				+ ", selectedEventId=" + selectedEventId + ", payer=" + payer + ", annualwellnessdatePriorBy="
				+ annualwellnessdatePriorBy + ", proceduredatePriorBy=" + proceduredatePriorBy + ", concussion="
				+ concussion + ", establishedPatient=" + establishedPatient + ", hasPCP=" + hasPCP
				+ ", annualphysicaldatePriorBy=" + annualphysicaldatePriorBy + ",payerId=" + payerId +",finalselectedEvent=" + finalselectedEvent +"]";
	}

	public String getFinalselectedEvent() {
		return finalselectedEvent;
	}

	public void setFinalselectedEvent(String finalselectedEvent) {
		this.finalselectedEvent = finalselectedEvent;
	}
	
}

package com.crhc.model;

public class Provider {
	private int experience;
	private String providerEvent;
	
	public Provider() {
		super();
		
	}
	
	//getter and setter method for provider
	
	public Provider(int experience,String providerEvent) {
		super();
		
		this.experience = experience;
		this.providerEvent=providerEvent;
	}
	
	
	public int getExperience() {
		return experience;
	}
	public void setAnnualwellnessdatePriorBy(int experience) {
		this.experience = experience;
	}
	
	public String getProviderEvent() {
		return providerEvent;
	}
	public void setProviderEvent(String providerEvent) {
		this.providerEvent = providerEvent;
	}
	
	
	
	@Override
	public String toString() {
		return "Provider [experience=" + experience + ",providerEvent=\" + providerEvent + \"]";
	}

}

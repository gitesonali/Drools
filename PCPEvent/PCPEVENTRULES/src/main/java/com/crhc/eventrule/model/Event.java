package com.crhc.eventrule.model;
/**
 * 
 * @author ADMIN
 *
 */
public class Event {
	 
	private String selectedEvent;
	private String selectedEventId;
	private String firedRules;
	private String finalselectedEvent;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * getter and setter method of the parameters provided
	 * @param selectedEvent
	 * @param selectedEventId
	 * @param firedRules
	 */
	public Event(String selectedEvent,String finalselectedEvent, String selectedEventId, String firedRules) {
		super();
		this.selectedEvent = selectedEvent;
		this.finalselectedEvent=finalselectedEvent;
		this.selectedEventId = selectedEventId;
		this.firedRules = firedRules;
		
	}
	public String getSelectedEvent() {
		System.out.println("This is event class getSelectedEvent"+selectedEvent);
		return selectedEvent;
	}
	public void setSelectedEvent(String selectedEvent) {
		System.out.println("This is event class setSelectedEvent"+selectedEvent);
		this.selectedEvent = selectedEvent;
	}
	public String getSelectedEventId() {
		System.out.println("This is event class getSelectedEvent"+selectedEventId);
		return selectedEventId;
	}
	public void setSelectedEventId(String selectedEventId) {
		System.out.println("This is event class setSelectedEvent"+selectedEventId);
		this.selectedEventId = selectedEventId;
	}
	public String getFiredRules() {
		return firedRules;
	}
	public void setFiredRules(String firedRules) {
		this.firedRules = firedRules;
	}
	@Override
	public String toString() {
		return "Event [selectedEvent=" + selectedEvent + ",finalselectedEvent=" + finalselectedEvent + ",selectedEventId=" + selectedEventId + ", firedRules="
				+ firedRules + "]";
	}
	public String getFinalselectedEvent() {
		return finalselectedEvent;
	}
	public void setFinalselectedEvent(String finalselectedEvent) {
		System.out.println("This is event class setfinalSelectedEvent"+selectedEventId);
		this.finalselectedEvent = finalselectedEvent;
	}


}

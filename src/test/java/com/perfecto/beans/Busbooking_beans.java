package com.perfecto.beans;

import com.qmetry.qaf.automation.data.BaseDataBean;

public class Busbooking_beans extends BaseDataBean {
	
	String departuretime;
	String arrivaltime;
	String busprice;
	
	public String getdeparturetime() {
		return departuretime;
	}
	public void setdepartureTime(String departuretime) {
		this.departuretime = departuretime;
	}

	public String getarrivalTime() {
		return arrivaltime;
	}

	public void setarrivalTime(String arrivalTime) {
		this.arrivaltime = arrivalTime;
	}
	
	public String getbusprice() {
		return busprice;
	}
	
	public void SetPrice(String busprice) {
		this.busprice = busprice;
	}
}

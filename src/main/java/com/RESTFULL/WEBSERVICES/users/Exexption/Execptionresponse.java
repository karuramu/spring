package com.RESTFULL.WEBSERVICES.users.Exexption;

import java.util.Date;

public class Execptionresponse {
private Date timespan;
private String message;
private String details;
public Execptionresponse(Date timespan, String message, String details) {
	super();
	this.timespan = timespan;
	this.message = message;
	this.details = details;
}
public Date getTimespan() {
	return timespan;
}
public String getMessage() {
	return message;
}
public String getDetails() {
	return details;
}
}

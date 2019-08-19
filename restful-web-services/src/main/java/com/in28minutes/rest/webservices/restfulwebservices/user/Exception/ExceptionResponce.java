package com.in28minutes.rest.webservices.restfulwebservices.user.Exception;

import java.util.Date;

public class ExceptionResponce {
	private Date timestamp;
	private String message;
	private String Details;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	public ExceptionResponce(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		Details = details;
	}
	

}

package com.amarsterdam.webservices.restfulwebservice.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message=message;
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}

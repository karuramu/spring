package com.RESTFULL.WEBSERVICES.HelloWord;

public class HelloWord {
	private String pacitance;

	public HelloWord(String pacitance) {
		this.pacitance = pacitance;
	}

	@Override
	public String toString() {
		return "HelloWord [pacitance=" + pacitance + "]";
	}

	public String getanythig() {
		return pacitance;
	}

}

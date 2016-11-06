/*
 Copyright © 2016 Wes Upham and Sarah Hennenkamp
 */
package edu.elon.calculate;

import java.io.Serializable;

public class User implements Serializable {

	private String amount;
	private String rate;
	private String years;
	private String value;

	public User() {
		amount = "";
		rate = "";
		years = "";
		value = "";
	}

	public User(String amount, String rate, String years, String value) {
		this.amount = amount;
		this.rate = rate;
		this.years = years;
		this.value = value;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the rate
	 */
	public String getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}

	/**
	 * @return the years
	 */
	public String getYears() {
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(String years) {
		this.years = years;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}

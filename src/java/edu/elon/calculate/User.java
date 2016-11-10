/*
 Copyright © 2016 Erik Borchers, Sarah Hennenkamp, and Wes Upham
 */
package edu.elon.calculate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class User implements Serializable {

	private ArrayList<Double> list = new ArrayList<Double>();
	private double amount;
	private double rate;
	private double years;
	private double value;
	private int len;

	public User() {
		amount = 0;
		rate = 0;
		years = 0;
		value = 0;
	}

	public User(double amount, double rate, double years) {
		this.amount = amount;
		this.rate = rate;
		this.years = years;
		this.list = doMath(amount, rate, years);
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * @return the years
	 */
	public double getYears() {
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(double years) {
		this.years = years;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * @return the list
	 */
	public ArrayList<Double> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Double> list) {
		this.list = list;
	}

	public int getLen() {
		return list.size();
	}

	/**
	 * @param len the len to set
	 */
	public void setLen(int len) {
		this.len = len;
	}

	/**
	 * Calculates compounded interest
	 *
	 * @param amount initial amount
	 * @param rate rate of interest
	 * @param years number of years compounded
	 * @return value interest earned plus initial amount
	 */
	private ArrayList<Double> doMath(double amount, double rate, double years) {
		for (int i = 1; i <= years; i++) {
			amount = amount + (amount * (rate / 100));
			getList().add((i - 1), amount);
		}
		BigDecimal answer = new BigDecimal(amount);
		amount = answer.doubleValue();
		return getList();
	}

}

/*
 Copyright © 2016 Wes Upham and Sarah Hennenkamp
 */
package edu.elon.calculate;

import java.io.Serializable;

public class User implements Serializable {

	private double amount;
	private double rate;
	private double years;
	private double value;

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
		this.value = doMath(amount,rate,years);
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
	 * Calculates compounded interest
	 *
	 * @param amount initial amount
	 * @param rate rate of interest
	 * @param years number of years compounded
	 * @return value interest earned plus initial amount
	 */
	private double doMath(double amount, double rate, double years) {
		rate = rate / 100;
		value = amount * Math.pow((1 + (rate)), years);
		return value;
	}

}

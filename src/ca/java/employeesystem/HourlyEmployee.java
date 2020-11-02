package ca.java.employeesystem;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
	private double payRate;
	private double hoursWorking;
	
	public HourlyEmployee(String firstName, String lastName, String email, LocalDate startDate, String phoneNum, double payRate, double hoursWorking) {
		super(firstName, lastName, email, startDate, phoneNum);
		setPayRate(payRate);
		setHoursWorking(hoursWorking);
		
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		if(payRate > 0) {
			this.payRate = payRate;
		} else {
			this.payRate = 0;
		}
	}

	public double getHoursWorking() {
		return hoursWorking;
	}

	public void setHoursWorking(double hoursWorking) {
		if(hoursWorking > 0 && hoursWorking <= 40) {
			this.hoursWorking = hoursWorking;
		} else {
			this.hoursWorking = 0;
		}
	}
	@Override
	public double calculateIncome() {
		return Math.floor(payRate * hoursWorking *100)/100;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Pay rate is " + payRate
				+ "\nHours of working is " + hoursWorking
				+ "\nTotal week of income is " + calculateIncome() + "\n";
	}
}

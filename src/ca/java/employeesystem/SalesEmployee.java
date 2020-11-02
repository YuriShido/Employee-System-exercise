package ca.java.employeesystem;

import java.time.LocalDate;

public class SalesEmployee extends Employee{
	private double commitRate;
	private double totalSales;
	
	public SalesEmployee(String firstName, String lastName, String email, LocalDate startDate, String phoneNum, double commitRate, double totalSalse) {
		super(firstName, lastName, email, startDate, phoneNum);
		setCommitRate(commitRate);
		setTotalSalse(totalSalse);
	}

	public double getCommitRate() {
		return commitRate;
	}

	public void setCommitRate(double commitRate) {
		if(commitRate > 0) {
			this.commitRate = commitRate;
		} else {
			this.commitRate = 0;
		}		
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSalse(double totalSales) {
		if(totalSales > 0) {
			this.totalSales = totalSales;
		} else {
			this.totalSales = 0;
		}
	}
	
	@Override
	public double calculateIncome() {
		return Math.floor((commitRate + totalSales)*100)/100;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Commit rate is " + commitRate
				+ "\nTotal sales is " + totalSales
				+ "\nTotal anual income is " + calculateIncome() +"\n";
	}

	
}

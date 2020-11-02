package ca.java.employeesystem;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate startDate;
	private String phoneNum;
	
	
	public Employee(String firstName, String lastName, String email, LocalDate startDate, String phoneNum) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setStartDate(startDate);
		setPhoneNum(phoneNum);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public String getPhoneNum() {
		return phoneNum;
	}
	
	//setter
	public void setFirstName(String firstName) {
		if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	
	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = "Unknown";
		}
	}
	
	
	public void setStartDate(LocalDate startDate) {
		if (Objects.nonNull(startDate)) {
			this.startDate = startDate;
			
		}
	}


	public void setPhoneNum(String phoneNum) {
		if (!phoneNum.isEmpty() && !phoneNum.equalsIgnoreCase(null)) {
			this.phoneNum = phoneNum;
		} else {
			this.phoneNum = "Unknown";
		}
	}
	
	public abstract double calculateIncome();
	
	@Override
	public String toString() {
		return "The name of employee : " + firstName + " " + lastName 
				+ "\nEmail : " + email
				+ "\nStart date : " + startDate
				+ "\nPhone number : " + phoneNum +"\n";
				
	}
	
}



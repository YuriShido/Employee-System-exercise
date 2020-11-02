package ca.java.employeesystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {
	
	public static void printEmployees(ArrayList<Employee> employees) {
		for(Employee e : employees) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		HourlyEmployee hE1 = new HourlyEmployee("Sam", "Smith" , "samsmith.@gmail.com", LocalDate.of(2020, 4, 12), "778 000 999", 16, 35);
		HourlyEmployee hE2 = new HourlyEmployee("Risa", "Harrison", "risaharrison@gmail.com",LocalDate.of(2017, 12, 12), "604 388 5432", 23, 40);
		
		SalesEmployee sE1 = new SalesEmployee("Rose", "Ford", "roseford@gmail.com", LocalDate.of(2010, 8, 5), "778 344 4322", 30000, 20000);
		SalesEmployee sE2 = new SalesEmployee("Alex", "Sander", "alexsander@gmail.com",LocalDate.of(2008, 4, 2) ,"778 888 3333", 40000, 30000);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(hE1);
		employees.add(hE2);
		employees.add(sE1);
		employees.add(sE2);
		
		printEmployees(employees);
		
	}

}

package backend;

import java.io.Serializable;

import customExceptions.SalaryTooBigException;
import customExceptions.SalaryTooSmallException;

public class Faculty extends Person implements Serializable{
	private String title; private double salary;

	public Faculty(String firstName, String lastName, String phoneNumber, Address address, String title, double salary) {
		super(firstName, lastName, phoneNumber, address);
		this.title = title;
		if(salary > 1000000) {
			try {
				throw new SalaryTooBigException();
			} catch (SalaryTooBigException e) {
				System.out.println(e.getMessage());
				this.salary = 100000;
			}
		} else if (salary < 30000){
			try {
				throw new SalaryTooSmallException();
			} catch (SalaryTooSmallException e) {
				System.out.println(e.getMessage());
				this.salary = 30000;
			}
		} else {
			this.salary = salary;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary > 1000000) {
			try {
				throw new SalaryTooBigException();
			} catch (SalaryTooBigException e) {
				System.out.println(e.getMessage());
				this.salary = 100000;
			}
		} else if (salary < 30000){
			try {
				throw new SalaryTooSmallException();
			} catch (SalaryTooSmallException e) {
				System.out.println(e.getMessage());
				this.salary = 30000;
			}
		} else {
			this.salary = salary;
		}
	}

	@Override
	public String toString() {
		return "Faculty [title=" + title + ", salary=" + salary +  super.toString() + "]";
	}
	
	
}

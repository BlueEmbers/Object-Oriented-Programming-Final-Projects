package backend;

import java.io.Serializable;

import customExceptions.GpaTooBigException;
import customExceptions.GpaTooSmallException;

public class Student extends Person implements Serializable{
	private double gpa;
	private String major;
	private BagCourse courseBag;

	public Student(String firstName, String lastName, String phoneNumber, Address address, double gpa, String major, BagCourse courseBag) {
		super(firstName, lastName, phoneNumber, address);
		if(gpa > 4.0) {
			try {
				throw new GpaTooBigException();
			} catch (GpaTooBigException e) {
				System.out.println(e.getMessage());
				this.gpa = 4.0;
			}
		} else if (gpa < 0.0){
			try {
				throw new GpaTooSmallException();
			} catch (GpaTooSmallException e) {
				System.out.println(e.getMessage());
				this.gpa = 0.0;
			}
		} else {
			this.gpa = gpa;
		}
		this.major = major;
		this.courseBag = courseBag;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if(gpa > 4.0) {
			try {
				throw new GpaTooBigException();
			} catch (GpaTooBigException e) {
				System.out.println(e.getMessage());
				this.gpa = 4.0;
			}
		} else if (gpa < 0.0){
			try {
				throw new GpaTooSmallException();
			} catch (GpaTooSmallException e) {
				System.out.println(e.getMessage());
				this.gpa = 0.0;
			}
		} else {
			this.gpa = gpa;
		}
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public BagCourse getCourseBag() {
		return courseBag;
	}

	public void setCourseBag(BagCourse courseBag) {
		this.courseBag = courseBag;
	}

	@Override
	public String toString() {
s		return "STUDENT:" + getId() + ";" + getFirstName() + ";" + getLastName() + ";" + getPhoneNumber() + ";"
				+ getAddress().toString() + ";" + "TAKEN:" + courseBag.toStringCourseNumberTaken() + "TAKING:" 
				+ courseBag.toStringCourseNumberTaking() + "NEEDSTAKING:" + courseBag.toStringCourseNumberNeedsTaking();
	}

}

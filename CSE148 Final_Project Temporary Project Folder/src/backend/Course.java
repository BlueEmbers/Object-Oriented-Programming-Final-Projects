package backend;

import customExceptions.CreditsTooBigException;
import customExceptions.CreditsTooSmallException;
import java.io.Serializable;


public class Course implements Serializable{
	private String title; 
	private String courseNumber;
	private Textbook textbook;
	private double credits;
	private static int cnIncrement=0;
	
	public Course(String title, Textbook textbook, double credits) {
		super();
		this.title = title;
		this.courseNumber = Integer.toString(cnIncrement++);
		this.textbook = textbook;
		if(credits > 4.0) {
			try {
				throw new CreditsTooBigException();
			} catch (CreditsTooBigException e) {
				System.out.println(e.getMessage());
				this.credits = 4.0;
			}
		} else if (credits < 1.0){
			try {
				throw new CreditsTooSmallException();
			} catch (CreditsTooSmallException e) {
				System.out.println(e.getMessage());
				this.credits = 1.0;
			}
		} else {
			this.credits = credits;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	public double getCredits() {
			return credits;
	}

	public void setCredits(double credits) {
		if(credits > 4.0) {
			try {
				throw new CreditsTooBigException();
			} catch (CreditsTooBigException e) {
				System.out.println(e.getMessage());
				this.credits = 4.0;
			}
		} else if (credits < 1.0){
			try {
				throw new CreditsTooSmallException();
			} catch (CreditsTooSmallException e) {
				System.out.println(e.getMessage());
				this.credits = 1.0;
			}
		} else {
			this.credits = credits;
		}	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", courseNumber=" + courseNumber + ", textbook=" + textbook.getTitle() + ", credits="
				+ credits + "]";
	}	
	
	public String toDataString() {
		return title + ";" + courseNumber + ";" + textbook.getIsbn() + ";" + credits;
	}

}

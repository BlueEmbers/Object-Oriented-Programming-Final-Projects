package application;

import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable {
	private String courseNumber;
	private String courseTitle;
	private String courseDescription;
	private Double courseCredits;
	private ArrayList<String> textbooks;

	
	public Course(String courseNumber, String courseTitle, String courseDescription, Double courseCredits,
			ArrayList<String> textbooks) {
		super();
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
		this.courseCredits = courseCredits;
		this.textbooks = textbooks;
	}
	

	
	public String getCourseNumber() {
		return courseNumber;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public Double getCourseCredits() {
		return courseCredits;
	}
	public ArrayList<String> getTextbooks() {
		return textbooks;
	}
	
	
}

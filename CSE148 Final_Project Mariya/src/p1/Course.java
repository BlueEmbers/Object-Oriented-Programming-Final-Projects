package p1;

public class Course {
	private String courseTitle;
	private String courseNumber;
	private Textbook textbook;
	private int credits;
	private static int courseNumberCount = 0;

	public Course(String courseTitle, Textbook textbook, int credits) {
		super();
		this.courseTitle = courseTitle;
		this.courseNumber = courseNumber;
		this.textbook = textbook;
		this.credits = credits;
		if (credits < 0) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				if (credits < 0) {
					credits = 0;
					courseNumber = String.valueOf(courseNumberCount++);
				}
			}
		}
	}

	public Course(String string, String string2, String data, double parseDouble, String data2, Object object) {
		// TODO Auto-generated constructor stub
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
		if (credits < 0) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				if (credits < 0) {
					credits = 0;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Course: Course Title: " + courseTitle + "  Course Number: " + courseNumber + "  Textbook: " + textbook
				+ "  Number of Credits: " + credits;
	}
}
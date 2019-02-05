package p1;

import java.io.Serializable;

public class c extends Person implements Serializable {
	private double gpa;
	private String major;
	private int creditsTaking;
	private CourseBag courseBag;
	private MasterCourseBag masterCourseBag;

	public c(String firstName, String lastName, String phoneNumber, double gpa, String major, CourseBag courseBag) {
		super(firstName, lastName, phoneNumber);
		if (gpa > 4.0 || gpa < 0.0) {
			try {
				throw new IllegalArgumentException("Invalid GPA");
			} catch (IllegalArgumentException e) {
				if (gpa > 4.0) {
					gpa = 4.0;
				} else {
					gpa = 0.0;
				}

			}
		}
		this.gpa = gpa;
		this.major = major;

	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if (gpa > 4.0 || gpa < 0.0) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				if (gpa > 4.0) {
					gpa = 4.0;
				} else {
					gpa = 0.0;
				}
			}
		}
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCreditsTaking() {
		String[] coursesTaking = getCoursesTaking();
		int total = 0;
		for (int i = 0; i < coursesTaking.length; i++) {
			total += masterCourseBag.findByCourseNumber(coursesTaking[i]).getCredits();
		}
		return total;
	}

	public void setCreditsTaking(int creditsTaking) {
		this.creditsTaking = creditsTaking;
	}

	public String[] getCoursesTook() {
		return courseBag.getCoursesTook();
	}

	public String[] getCoursesTaking() {
		return courseBag.getCoursesTaking();
	}

	public String[] getCoursesToTake() {
		return courseBag.getCoursesTO_TAKE();
	}

	public static double calculateGPA(int credit, String LetterGrade) {
		double letterEquivalence = 0;
		switch (LetterGrade) {
		case "A":
			letterEquivalence = 4.0;
			break;
		case "A-":
			letterEquivalence = 3.7;
			break;
		case "B+":
			letterEquivalence = 3.3;
			break;
		case "B":
			letterEquivalence = 3.0;
			break;
		case "B-":
			letterEquivalence = 2.7;
			break;
		case "C+":
			letterEquivalence = 2.3;
			break;
		case "C":
			letterEquivalence = 2.0;
			break;
		case "C-":
			letterEquivalence = 1.7;
			break;
		case "D+":
			letterEquivalence = 1.3;
			break;
		case "D":
			letterEquivalence = 1.0;
			break;
		default:
			letterEquivalence = 0;
			break;
		}
		return credit * letterEquivalence;

	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", major=" + major + ", creditsTaking=" + creditsTaking + ", courseBag="
				+ courseBag + ", masterCourseBag=" + masterCourseBag + "]";
	}

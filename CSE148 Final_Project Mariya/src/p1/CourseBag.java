package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CourseBag {
	private CourseType[] courseType;
	private int nElms;

	public CourseBag(int maxSize) {
		courseType = new CourseType[maxSize];
		nElms = 0;
	}

	public void add(String courseName, CourseCategory courseCategory) {
		courseType[nElms++] = new CourseType(courseName, courseCategory);
	}

	public boolean delete(CourseType value) {
		int j;
		for (j = 0; j < nElms; j++) {
			if (courseType[j] == value) {
				break;
			}
		}

		if (j == nElms) {
			return false;
		} else {
			for (int k = j; k < nElms - 1; k++) {
				courseType[k] = courseType[k + 1];

			}
			nElms--;
			return true;
		}

	}

	public boolean find(CourseType searchKey) {
		int j;
		for (j = 0; j < nElms; j++) {
			if (courseType[j] == searchKey) {
				break;
			}
		}

		if (j == nElms) {
			return false;
		} else {
			return true;
		}
	}

	public void display() {
		for (int i = 0; i < nElms; i++) {
			System.out.println(courseType[i]);
		}
		System.out.println("");
	}

	public int getNElms() {
		return nElms;
	}

	public String[] getCoursesTook() {
		ArrayList<String> tempList = new ArrayList<>();
		for (int i = 0; i < nElms; i++) {
			if (courseType[i].getCourseCategory() == CourseCategory.TOOK) {
				tempList.add(courseType[i].getCourseNumber());
				System.out.println(courseType[i]);
			}

		}
		return (String[]) tempList.toArray(new String[tempList.size()]);
	}

	public String[] getCoursesTaking() {
		ArrayList<String> tempList = new ArrayList<>();
		for (int i = 0; i < nElms; i++) {
			if (courseType[i].getCourseCategory() == CourseCategory.TAKING) {
				tempList.add(courseType[i].getCourseNumber());
				System.out.println(courseType[i]);

				{

				}
			}
		}

		return (String[]) tempList.toArray(new String[tempList.size()]);
	}

	public String[] getCoursesTO_TAKE() {
		ArrayList<String> tempList = new ArrayList<>();
		for (int i = 0; i < nElms; i++) {
			if (courseType[i].getCourseCategory() == CourseCategory.TO_TAKE) {
				tempList.add(courseType[i].getCourseNumber());
				System.out.println(courseType[i]);
			}

		}
		return (String[]) tempList.toArray(new String[tempList.size()]);
	}

	public void load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("data.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		courseType = (CourseType[]) ois.readObject();
		ois.close();

	}

	public void save() throws IOException {
		FileOutputStream fos = new FileOutputStream("data.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(courseType);
		oos.close();
		
		public void importData(String fileName) {
			String fileName1;
			File file = new File(fileName1);
			try {
				Scanner in = new Scanner(file);
				while (in.hasNextLine()) {
					String data = in.nextLine();
					String[] tokens = data.split("[,]");
					CourseType course = new CourseType(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
					add(course);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public void exportData(String fileName1) {
			PrintWriter file = null;
			try {
			file = new PrintWriter(fileName1);
			int counter3;
			for(int i =0; i < counter3; i++) {
			char[][] courses;
			file.println(courses[i]);
			}
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} finally {
			file.close();
			}
		} 
	}

	private void add(CourseType course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "CourseBag [courseType=" + Arrays.toString(courseType) + ", nElms=" + nElms + "]";
	}


package backend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class BagCourse implements Serializable{
	private Course[] courseArrayTaken;
	private Course[] courseArrayTaking;
	private Course[] courseArrayNeedsTaking;
	private int nItemsTaken = 0;
	private int nItemsTaking = 0;
	private int nItemsNeedsTaking = 0;
	private int nElems;
	
	public BagCourse(int maxSizeArrayTaken, int maxSizeArrayTaking, int maxSizeArrayNeedsTaking) {
		courseArrayTaken = new Course[maxSizeArrayTaken];
		courseArrayTaking = new Course[maxSizeArrayTaking];
		courseArrayNeedsTaking = new Course[maxSizeArrayNeedsTaking];
	}
	
	public void addTaken(Course course) {
		courseArrayTaken[nItemsTaken] = course;
		nItemsTaken++;
	}
	
	public void addTaking(Course course) {
		courseArrayTaking[nItemsTaking] = course;
		nItemsTaking++;
	}
	
	public void addNeedsTaking(Course course) {
		courseArrayNeedsTaking[nItemsNeedsTaking] = course;
		nItemsNeedsTaking++;
	}
	
	public String findTaken(String courseNumber) {
		for(int i = 0; i < nItemsTaken; i++) {
			if(courseArrayTaken[i].getCourseNumber().equals(courseNumber)) {
				return courseArrayTaken[i].toString();
			}
		}
		return null;
	}
	
	public String findTaking(String courseNumber) {
		for(int i = 0; i < nItemsTaken; i++) {
			if(courseArrayTaking[i].equals(courseNumber)) {
				return courseArrayTaking[i].getCourseNumber().toString();
			}
		}
		return null;
	}
	
	public String findNeedsTaking(String courseNumber) {
		for(int i = 0; i < nItemsTaken; i++) {
			if(courseArrayNeedsTaking[i].equals(courseNumber)) {
				return courseArrayNeedsTaking[i].getCourseNumber().toString();
			}
		}
		return null;
	}
	
	public String deleteTaken(String courseNumber) {
		int i;
		for (i = 0; i < nItemsTaken; i++) {
			if (courseArrayTaken[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}
		if (i == nItemsTaken) {
			return null;
		}
		else {
			Course temp = courseArrayTaken[i];
			for(int j = i; j < nItemsTaken - 1; j++) {
				courseArrayTaken[j]= courseArrayTaken[j+1];
			}
			nItemsTaken--;
			return temp.toString();
		}
	}
	
	public String deleteTaking(String courseNumber) {
		int i;
		for (i = 0; i < nItemsTaking; i++) {
			if (courseArrayTaking[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}
		if (i == nItemsTaking) {
			return null;
		}
		else {
			Course temp = courseArrayTaking[i];
			for(int j = i; j < nItemsTaking - 1; j++) {
				courseArrayTaking[j] = courseArrayTaking[j+1];
			}
			nItemsTaking--;
			return temp.toString();
		}
	}
	
	public String deleteNeedsTaking(String courseNumber) {
		int i;
		for (i = 0; i < nItemsNeedsTaking; i++) {
			if (courseArrayNeedsTaking[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}
		if (i == nItemsNeedsTaking) {
			return null;
		}
		else {
			Course temp = courseArrayNeedsTaking[i];
			for(int j = i; j < nItemsNeedsTaking - 1; j++) {
				courseArrayNeedsTaking[j]= courseArrayNeedsTaking[j+1];
			}
			nItemsNeedsTaking--;
			return temp.toString();
		}
	}
	
	public void display() {
		System.out.println("\nCourses taken: ");
		for (int i = 0; i < nItemsTaken; i++) {
			System.out.println(courseArrayTaken[i]);
		}
		System.out.println("\nCourses currently taking: ");
		for (int i = 0; i < nItemsTaking; i++) {
			System.out.println(courseArrayTaking[i]);
		}
		System.out.println("\nCourses that need to be took: ");
		for (int i = 0; i < nItemsNeedsTaking; i++) {
			System.out.println(courseArrayNeedsTaking[i]);
		}
	}
	
	public String toStringCourseNumberTaken() {
//		for (int i = 0; i < nItemsTaken; i++) {
//			return courseArrayTaken[i].getCourseNumber() + ",";
//		}
//		return ":";
		int i = -1;
		while (i < nItemsTaken) {
			try {
				return null;
			} finally {
				while (i < nItemsTaken) {
					i++;
					return courseArrayTaken[i].getCourseNumber();
				}
			}
		}
		return null;
	}
	
	public String toStringCourseNumberTaking() {
		for (int i = 0; i < nItemsTaking; i++) {
			return courseArrayTaking[i].getCourseNumber() + ",";
		}
		return ":";
	}
	
	public String toStringCourseNumberNeedsTaking() {
		for (int i = 0; i < nItemsNeedsTaking; i++) {
			return courseArrayNeedsTaking[i].getCourseNumber() + ",";
		}
		return ":";
	}
	
//	public void load() {
//		FileInputStream fis;
//		try {
//			fis = new FileInputStream("CourseArray.dat");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			courseArrayTaken = (Course[])ois.readObject();
//			courseArrayTaking = (Course[])ois.readObject();
//			courseArrayNeedsTaking = (Course[])ois.readObject();
//			nElems = (Integer)ois.readObject();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void save() {
//		ObjectOutputStream oos = null;
//		try {
//			FileOutputStream fos = new FileOutputStream("PeopleArray.dat");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(courseArrayTaken);
//			oos.writeObject(courseArrayTaking);
//			oos.writeObject(courseArrayNeedsTaking);
//			oos.writeObject(nElems);//java autoboxes nElems, turns integer into IntegerObject
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				oos.close();
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	public void importData(String fileName){
//		File file = new File(fileName);
//		try {
//			Scanner in = new Scanner(file);
//			while (in.hasNextLine()) {
//				String data = in.nextLine();
//				String[] tokens = data.split("[ ;,]");
//				Double doubleData = in.nextDouble();
//				Course s = new Course(tokens[0], null, doubleData);
//				addTaken(s);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void exportData(String fileName) {
//		PrintWriter file = null;
//		try {
//			file = new PrintWriter(fileName);
//			for(int i =0; i < nItemsTaken; i++) {
//				file.println(courseArrayTaken[i].toDataString());
//			}
//			for(int i =0; i < nItemsTaking; i++) {
//				file.println(courseArrayTaking[i].toDataString());
//			}
//			for(int i =0; i < nItemsNeedsTaking; i++) {
//				file.println(courseArrayNeedsTaking[i].toDataString());
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			file.close();
//		} 
//	}
}

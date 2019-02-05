package backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BagMasterCourse {
	private Course[] masterCourseArray;
	private int nItems=0;
	private int nElems;
	
	public BagMasterCourse(int maxSize) {
		masterCourseArray = new Course[maxSize];
	}
	
	public void add(Course course) {
		masterCourseArray[nItems] = course;
		nItems++;
	}
	
	public void display() {
		for(int i = 0; i < nItems; i++)
			System.out.println(masterCourseArray[i]);
	}
	
	public String find(String courseNumber) {
		for(int i = 0; i < nItems; i++) {
			if(masterCourseArray[i].getCourseNumber().equals(courseNumber)) {
				return masterCourseArray[i].toString();
			}
		}
		return null;
	}
	public String delete(String courseNumber) {
		int i;
		for (i = 0; i < nItems; i++) {
			if (masterCourseArray[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}
		if (i == nItems) {
			return null;
		}
		else {
			Course temp = masterCourseArray[i];
			for(int j = i; j < nItems - 1; j++) {
				masterCourseArray[j]= masterCourseArray[j+1];
			}
			nItems--;
			return temp.toString();
		}
	}
	
	public void load() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("MasterCourseArray.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			masterCourseArray = (Course[])ois.readObject();
			nElems = (Integer)ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void save() {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("MasterCourseArray.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(masterCourseArray);
			oos.writeObject(nElems);//java autoboxes nElems, turns integer into IntegerObject
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

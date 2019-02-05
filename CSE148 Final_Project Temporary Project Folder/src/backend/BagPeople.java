package backend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class BagPeople {
	private Person[] peopleArray;
	private int nItems=0;
	private int nElems;

	public BagPeople(int maxSize){
		peopleArray = new Person[maxSize];
	}

	public void add(Person person) {
		peopleArray[nItems] = person;
		nItems++;
	}

	public void display() {
		for(int i = 0; i < nItems; i++) {
			System.out.println(peopleArray[i]);
		}
	}

	public String find(String id) {
		for(int i = 0; i < nItems; i++) {
			if(peopleArray[i].getId().equals(id)) {
				return peopleArray[i].toString();
			}
		}
		return null;
	}

	public String delete(String id) {
		int i;
		for (i = 0; i < nItems; i++) {
			if (peopleArray[i].getId().equals(id)) {
				break;
			}
		}
		if (i == nItems) {
			return null;
		}
		else {
			Person temp = peopleArray[i];
			for(int j = i; j < nItems - 1; j++) {
				peopleArray[j] = peopleArray[j+1];
			}
			nItems--;
			return temp.toString();
		}
	}

	public void load() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("PeopleArray.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			peopleArray = (Person[])ois.readObject();
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
			FileOutputStream fos = new FileOutputStream("PeopleArray.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(peopleArray);
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

	public void importData(String fileName){
		File file = new File(fileName);
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				String data = in.nextLine();
				String[] tokens = data.split(";:,");
				Double doubleData = in.nextDouble();
			//	Student s = new Student(tokens[0], tokens[1], tokens[2], doubleData, tokens[4], null);
			//	add(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void exportData(String fileName) {
		PrintWriter file = null;
		try {
			file = new PrintWriter(fileName);
			int counter3 = nItems;
			for(int i =0; i < counter3; i++) {
				file.println(peopleArray[i].toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			file.close();
		}
	}
}

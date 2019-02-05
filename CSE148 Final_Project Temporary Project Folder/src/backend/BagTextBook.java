package backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BagTextBook {
	private Textbook[] textBookArray; 
	private int nItems=0;
	private int nElems;
	public BagTextBook(int maxItems) {
		textBookArray = new Textbook[maxItems];
	}
	
	public void add(Textbook textbook) {
		textBookArray[nItems] = textbook;
		nItems++;
	}
	
	public void display() {
		for (int i = 0; i < nItems; i++) {
			System.out.println(textBookArray[i].toString());
		}
	}
	
	public String find(String isbn) {
		for (int i = 0; i < nItems; i++) {
			if (textBookArray[i].getIsbn().equals(isbn)) {
				return textBookArray[i].toString();
			}
		}
		return null;
	}
	
	public String delete(String isbn) {
		int i;
		for (i = 0; i < nItems; i++) {
			if (textBookArray[i].getIsbn().equals(isbn)) {
				break;
			}
		}
		if (i == nItems) {
			return null;
		}
		else {
			Textbook temp = textBookArray[i];
			for(int j = i; j < nItems - 1; j++) {
				textBookArray[j]= textBookArray[j+1];
			}
			nItems--;
			return temp.toString();
		}
	}
	
	public void load() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("TextbookArray.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			textBookArray = (Textbook[])ois.readObject();
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
			FileOutputStream fos = new FileOutputStream("TextbookArray.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(textBookArray);
			oos.writeObject(nElems);
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

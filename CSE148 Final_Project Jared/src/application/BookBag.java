package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class BookBag {
	private Textbook[] bookArray = new Textbook[0];
	private int nElems;
	
	public BookBag(){
		
	}
	
	public void delete(Textbook textbook){
		ArrayList<Textbook> arraylist = new ArrayList<Textbook>();
		for(Textbook t: bookArray){
			arraylist.add(t);
		}
		if(arraylist.contains(textbook)){
			arraylist.remove(textbook);
		bookArray = arraylist.toArray(new Textbook[arraylist.size()]);
		System.out.println("Removed: \t" +  textbook.getBookISBN() + " " + textbook.getBookTitle());
		}
		else{
			System.out.println("Textbook not in BookBag..");
		}
		
		
	}
	
	public void add(Textbook textbook){
		Textbook[] temp = new Textbook[bookArray.length + 1];
		for(int i = 0; i<bookArray.length; i++){
			temp[i] = bookArray[i];
		}
		temp[temp.length-1] = textbook;
		bookArray = temp;
	}
	
	public void removeByBookISBN(String isbn){
		Textbook[] temp = new Textbook[bookArray.length - 1];
		int h = 0;
		for(int i = 0; i<nElems; i++){
			if (bookArray[i].getBookISBN().equals(isbn)){
				System.out.println("Found ISBN and removed");
			}
			else{
				temp[h] = bookArray[i];
				h++;
			}
		}
		bookArray = temp;
	}
	
	public Textbook searchByBookISBN(String isbn){
		try {
			for(Textbook t: bookArray){
				if(t.getBookISBN().equals(isbn)){
					return t;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("There arent any Textbooks Imported" + e);
		}
		
		return null;
	}
	
	public void updateByBookISBN(String isbn){
		
	}
	
	public void load(){
		ObjectInputStream OIS = null;
		System.out.println("Trying to load BookBag.");
		try{
			try {
				OIS = new ObjectInputStream(new FileInputStream("BookBag.dat"));
			} catch (IOException e) {
				System.out.println("Couldnt find BookBag: " + e);
			}
			try {
				this.bookArray= ((Textbook[])OIS.readObject());
			} catch (NullPointerException | ClassNotFoundException | IOException e) {
				System.out.println("Array couldn't be read from BookBag: " + e);
			}
		}finally{
			System.out.println("BookBag Successfully Loaded.");
			for(Textbook t: bookArray){
				System.out.println(t.getBookISBN());
			}
		}
		
	}
	
	public void update(){
		FileOutputStream FOS = null;
		ObjectOutputStream OOS = null;
		try {
			FOS = new FileOutputStream("BookBag.dat");
		} catch (FileNotFoundException e) {
			// IF FILE ISNT FOUND
		}
		
		try {
			OOS = new ObjectOutputStream(FOS);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OOS.writeObject(bookArray);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			OOS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("BookBag successfully updated.");
	}

	public void importBodyBag(String path){
		int index = 0;
		FileReader fr = null;
	
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			System.out.println("Couldnt locate file..");
		}
		BufferedReader br = new BufferedReader(fr);
		
		String read = null;
		
		try {
			while((read = br.readLine()) != null){
				String[] splited = read.split("#");
				for(String t: splited){
					index++;
					String[] textbook = t.split("/");
					String isbn = textbook[0];
					String title = textbook[1];
					Double price = Double.parseDouble(textbook[2]);
					String[] a = textbook[3].substring(1, textbook[3].length()).split(",");
					ArrayList<String> authors = new ArrayList<String>();
					for(String A: a){
						authors.add(A);
					}
					Textbook T = new Textbook(isbn,title,authors,price);
					if(this.searchByBookISBN(isbn) == null){
						Main.bookbag.add(T);
						System.out.println("Added textbook: " + T.getBookISBN());
					}
					else{
						System.out.println("Textbook at index:" + index +" with ISBN:" + isbn + " already exists. Add Failed");
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Problem with importing BodyBag" + e);
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
			}
		}
	}
	public void exportBookBag(String path){
		File file = new File(path);
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for(Textbook t: bookArray){	
			pw.write("#\n"+t.getBookISBN() + "/" + t.getBookTitle()+ "/" +t.getBookPrice() + "/"  + t.getBookAuthors().toString().substring(0,t.getBookAuthors().toString().length()-1));
		}
		pw.close();
		System.out.println("Successfully Exported Textbooks.");
	}
	
	
	
	
	public void list() {
		for(Textbook t: bookArray){
			System.out.print("Textbook:" + t.getBookTitle());
		}
		
	}
}


package backend;

import customExceptions.PriceTooBigException;
import customExceptions.PriceTooSmallException;
import java.io.Serializable;

public class Textbook implements Serializable{
	private String title;
	private String author; 
	private String publisher;
	private double price;
	private String isbn;
	private static int isbnIncrement = 0;
	
	public Textbook(String title, String author, String publisher, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		if (price > 200) {
			try {
				throw new PriceTooBigException();
			} catch (PriceTooBigException e) {
				System.out.println(e.getMessage());
				this.price = 200;
			}
		} else if (price < 0){
			try {
				throw new PriceTooSmallException();
			} catch (PriceTooSmallException e) {
				System.out.println(e.getMessage());
				this.price = 1;
			}
		} else {
			this.price = price;
		}
		this.isbn = Integer.toString(isbnIncrement); isbnIncrement++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Textbook [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=$" + price
				+ ", isbn=" + isbn + "]";
	}
	
	public String toDataString() {
		return 	title + ";" + author + ";" + publisher + ";" + price + ";" + isbn;
	}
}

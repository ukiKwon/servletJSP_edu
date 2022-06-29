package com.edu.test.custom;

public class Book {
	String title;
	String author;
	String publisher;
	Book(String p1, String p2, String p3) {
		this.title = p1;
		this.author = p2;
		this.publisher = p3;
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
	
}

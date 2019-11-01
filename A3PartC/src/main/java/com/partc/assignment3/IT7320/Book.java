package com.partc.assignment3.IT7320;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private boolean available = true;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void rentBook() {
		if(available) {
			available = false;
		} else {
			System.out.println("Currently unavailable");
		}
	}
	
	public boolean checkStatus() {
		return available;
	}

}

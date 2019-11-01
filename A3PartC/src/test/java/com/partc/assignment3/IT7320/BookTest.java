package com.partc.assignment3.IT7320;
import junit.framework.TestCase;
import org.junit.Test;

import java.awt.List;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;

public class BookTest extends TestCase {
	
	private Book book1;
	private Book book2;
	ArrayList<Book> books = new ArrayList<Book>();
	
	@Before
	public void setUp() throws Exception{
		book1 = new Book("Harry Potter and the Goblet of Fire", "J.K Rowling");
		book2 = new Book("The Da Vinci Code", "Dan Brown");
		books.add(book1);
		books.add(book2);
	}
	
	@After
	public void tearDown() {
		books.clear();
	}
	
	@Test
	public void testCreateBook() {		
		String bookTitle = "Harry Potter and the Goblet of Fire";
		assertEquals(bookTitle, book1.getTitle());		
	}
	
	@Test
	public void testGetAuthor() {
		String author = "Dan Brown";
		assertEquals(author, book2.getAuthor());
	}
	
	@Test
	public void testRentBook() {
		boolean available = false;		
		book1.rentBook();
		
		assertEquals(available, book1.checkStatus());		
	}

}

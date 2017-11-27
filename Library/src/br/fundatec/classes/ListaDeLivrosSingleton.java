package br.fundatec.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListaDeLivrosSingleton {
	private static ListaDeLivrosSingleton instance;
	private ArrayList<Book> books;
	
	private ListaDeLivrosSingleton() {
		
	} 
	
	public static ListaDeLivrosSingleton getInstance() {
		if(instance == null) {
			instance = new ListaDeLivrosSingleton();
		}
		return instance;
	}
	
	//set
	public void setBook(ArrayList<Book> newBooks) {
		this.books = newBooks;
	}
	
	//get
	public ArrayList<Book> getBooks(){
		return this.books;
	}
}

package br.fundatec.classes;

import java.util.ArrayList;
//SINGLETON
public class ListaDeLivrosSingleton {
	private static ListaDeLivrosSingleton instance;
	private ArrayList<Book> books = null;
	
	private ListaDeLivrosSingleton() {
		books = new ArrayList<Book>();
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

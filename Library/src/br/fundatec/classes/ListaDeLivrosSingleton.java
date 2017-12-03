package br.fundatec.classes;

import java.util.ArrayList;

//SINGLETON
public class ListaDeLivrosSingleton {
	private static ListaDeLivrosSingleton instance;
	private ArrayList<Book> books = null;
	
	 ListaDeLivrosSingleton() {
		books = new ArrayList<Book>();
	} 
	
	public static ListaDeLivrosSingleton getInstance() {
		if(instance == null) {
			instance = new ListaDeLivrosSingleton();
		}
		return instance;
	}
	
	//Set
	public void setBook(ArrayList<Book> books) {
		this.books = books;
	}
	
	//Get
	public ArrayList<Book> getBooks(){
		return this.books;
	}
	
}
	
	


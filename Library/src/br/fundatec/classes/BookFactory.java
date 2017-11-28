package br.fundatec.classes;

public class BookFactory {
//FACTORY
	public Book buildBook(String title) {
		Book b = new Book();
		b.setTitle(title);
		
		return b;
	}
}

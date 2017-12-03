package br.fundatec.classes;

import br.fundatec.interfaces.AddBook;
import br.fundatec.interfaces.RemoveBook;

public class BookService implements AddBook, RemoveBook{
//ISP + SRP + SINGLETON

	@Override
	public void addBook(Book book) {
		ListaDeLivrosSingleton.getInstance().getBooks().add(book);
	
	}

	@Override
	public void removeBook(Book book) {
		ListaDeLivrosSingleton.getInstance().getBooks().remove(book);
		
		System.out.println("\nLivro removido!\n");
		
	}
}

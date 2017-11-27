package br.fundatec.classes;

import br.fundatec.interfaces.AddBook;
import br.fundatec.interfaces.RemoveBook;

public class BookService implements AddBook, RemoveBook{

	@Override
	public void removeBook(Book book) {
		ListaDeLivrosSingleton.getInstance().getBooks().remove(book);
	}

	@Override
	public void addBook(Book book) {
		ListaDeLivrosSingleton.getInstance().getBooks().add(book);
		
		
	}

}

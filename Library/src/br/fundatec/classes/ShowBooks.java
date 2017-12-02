package br.fundatec.classes;

import java.util.ArrayList;

import br.fundatec.interfaces.Printer;
//OCP + FACTORY + SINGLETON
public class ShowBooks implements Printer{
		
	@Override
	public void printBook() {
		System.out.println("Livros:");
		
		ArrayList<Book> books = ListaDeLivrosSingleton.getInstance().getBooks();
		
		for (Book book : books) {
			System.out.println("Titulo: " + book.getTitle() + "\nISBN: " + 
			book.getIsbn() + " \nNumero de paginas:" + 
			book.getPages() + " \nNumero da edição" +
			book.getEditionNumber() + " \nAno de puclicação: " + 
			book.getPublicationYear() + " \nAutor: " +
			book.getAuthor() + " \nEditora: " +
			book.getPhouse());
		}
		
		
	}

}

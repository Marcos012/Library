package br.fundatec.classes;

import br.fundatec.interfaces.Printer;

public class ShowBooks implements Printer{

	@Override
	public void printBook() {
		System.out.println("Livro 1");
	}

}

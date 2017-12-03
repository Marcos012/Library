package br.fundatec.classes;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		int opcaoDigitada; 
		
		
		
		Book book = new Book();
		BookService bs = new BookService();
		ShowBooks sb = new ShowBooks();
	
			do {
				System.out.println("1 - Adicionar \n2 - Remover \n3 - Relatorio \n0 - Fim");
				opcaoDigitada = entrada.nextInt();
				
				switch (opcaoDigitada) {
					case 1:
						System.out.println("Entre com o titulo:");
						String title = entrada.next();
						
						System.out.println("Entre com o ISBN:");
						String isbn = entrada.next();
						
						System.out.println("Entre com o numero de paginas:");
						int pages = entrada.nextInt();
						
						System.out.println("Entre com o ano de publicacao:");
						int publicationYear= entrada.nextInt();
						
						System.out.println("Entre com o numero da edicao:");
						int editionNumber = entrada.nextInt();
						
						System.out.println("Entre com o nome do autor:");
						String name = entrada.next();
						
						System.out.println("Entre com o email do autor:");
						String email = entrada.next();
						
						System.out.println("Entre com website do autor:");
						String website = entrada.next();
						
						System.out.println("Entre com o nome da Editora:");
						String namePh = entrada.next();
						
						System.out.println("Entre com email da editora:");
						String emailPh = entrada.next();
						
						System.out.println("Entre com o telefone da editora:");
						String telephone = entrada.next();
						
						System.out.println("Entre com website da editora:");
						String websitePh = entrada.next();
								
						BookFactory bf = new BookFactory();
						
						book = bf.buildBook(title, isbn, pages, publicationYear, editionNumber,
												name,email, website,
												namePh, emailPh, telephone, websitePh);
						System.out.println("\nLivro adicionado!\n");
						
						bs.addBook(book);
						sb.printBook();
						
						break;
					case 2:
						System.out.println("Entre com o titulo do livro:");
						title = entrada.next();
						bs.removeBook(book);
						
						break;
						
					case 3:
						sb.printBook();
						
						break;
						
					case 0:
						System.out.println("Obrigado");
						
						break;
						
					default:
						System.out.println("Opção inválida!");
						
						break;
				}
			}while (opcaoDigitada != 0);
			entrada.close();
	}
}
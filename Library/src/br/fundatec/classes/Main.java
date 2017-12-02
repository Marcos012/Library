package br.fundatec.classes;

import java.util.Scanner;

//FALTA COLOCAR NO ARRAY O AUTOR E A EDITORA (FEITOOOOOOOOOOOOOO)
//FALTA UM PATTERN DO SOLID
public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		int opcaoDigitada; 
		
		BookService bs = new BookService();
		ShowBooks sb = new ShowBooks();
		
			do {
				System.out.println("1 - Adicionar \n2 - Remover \n3 - Relatorio \n0 - Fim");
				opcaoDigitada = entrada.nextInt();
				
				switch (opcaoDigitada) {
					case 1:
						System.out.println("Entre com Titulo:");
						String title = entrada.nextLine();
						
						System.out.println("Entre com o ISBN:");
						String isbn = entrada.nextLine();
						
						System.out.println("Entre com o numero de paginas:");
						int pages = entrada.nextInt();
						
						System.out.println("Entre com o ano de publicacao:");
						int publicationYear= entrada.nextInt();
						
						System.out.println("Entre com o numero da edicao:");
						int editionNumber = entrada.nextInt();
						
						System.out.println("Entre com o nome do autor:");
						String name = entrada.nextLine();
						
						System.out.println("Entre com o email do autor:");
						String email = entrada.nextLine();
						
						System.out.println("Entre com website do autor:");
						String website = entrada.nextLine();
						
						System.out.println("Entre com o nome da Editora:");
						String namePh = entrada.nextLine();
						
						System.out.println("Entre com email da editora:");
						String emailPh = entrada.nextLine();
						
						System.out.println("Entre com o telefone da editora:");
						String telephone = entrada.nextLine();
						
						System.out.println("Entre com website da editora:");
						String websitePh = entrada.nextLine();
								
						BookFactory bf = new BookFactory();
						
						Book book = bf.buildBook(title, isbn, pages, publicationYear, editionNumber,
												name, email, website,
												namePh, emailPh, telephone, websitePh);
						
						bs.addBook(book);
						sb.printBook();
						
						break;
					
					case 2:
						sb.printBook();
						break;
						
					case 3:
						
						break;
					case 0:
						
						break;
						
					default:
						System.out.println("Opção inválida!!"); 
						break;
				}
			}while (opcaoDigitada != 0);
			entrada.close();
	}
}
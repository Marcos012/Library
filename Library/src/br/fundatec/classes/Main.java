package br.fundatec.classes;

import java.util.ArrayList;
import java.util.Scanner;

//FALTA COLOCAR NO ARRAY O AUTOR E A EDITORA
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
						BookFactory bf = new BookFactory();
						
						Book book = bf.buildBook(title);
						
						bs.addBook(book);
						sb.printBook();
						
						break;
					
					case 2:
						
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
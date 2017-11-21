package br.fundatec.classes;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		int opcaoDigitada; 
		
			do {
				System.out.println("1 - Adicionar \n2 - Remover \n3 - Relatorio \n0 - Fim");
				opcaoDigitada = entrada.nextInt();
				
				switch (opcaoDigitada) {
					case 1:
						System.out.println("Livro Adicionado\n");
						break;
					
					case 2:
						System.out.println("Livro apagado\n");
						break;
						
					case 3:
						System.out.println("Relatório\n");
						break;
					case 0:
						System.out.println("Fim");
						break;
						
					default:
						System.out.println("Opção inválida!!"); 
						break;
				}
			}while (opcaoDigitada != 0);
			entrada.close();
	}
}
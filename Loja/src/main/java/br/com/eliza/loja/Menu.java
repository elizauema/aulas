package br.com.eliza.loja;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Tamanho wtamanho = new Tamanho();
		int opcao = 0;
		Scanner scanner = new Scanner(System.in);
		while (opcao != 5) {
			System.out.println("Selecione uma opção");
			System.out.println("1-Camiseta");
			System.out.println("2-Calça");
			System.out.println("3-Shorts");
			System.out.println("4-Saia");
			System.out.println("5-Exit");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("opcao 1 - Camiseta:");
				break;
			case 2:
				System.out.println("opcao 2 - Calça:");
				break;
			case 3:
				System.out.println("opcao 3 - Shorts");
				break;
			case 4:
				System.out.println("opcao 4 - Saia");
				break;
			case 5:
				System.out.println("opcao 5 - Fim");
				System.exit(0);
				break;
			default:
				System.out.println("Opcao invalida");
			}
			String tamanho = wtamanho.pegarTamanho();
			System.out.println(tamanho);

		}
		scanner.close();

	}

}
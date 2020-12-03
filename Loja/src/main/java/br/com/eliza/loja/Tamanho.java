package br.com.eliza.loja;

import java.util.Scanner;

public class Tamanho {
	public String pegarTamanho() {
		int tamanho = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Selecione um tamanho");
		System.out.println("1-PP");
		System.out.println("2-P");
		System.out.println("3-M");
		System.out.println("4-G");
		System.out.println("5-GG");
		tamanho = scanner.nextInt();

		String tamanhoTxt = "";
		switch (tamanho) {
		case 1:
			tamanhoTxt = "PP";
			break;
		case 2:
			tamanhoTxt = "P";
			break;
		case 3:
			tamanhoTxt = "M";
			break;
		case 4:
			tamanhoTxt = "G";
			break;
		case 5:
			tamanhoTxt = "GG";
			break;

		}
		return tamanhoTxt;
	}
}

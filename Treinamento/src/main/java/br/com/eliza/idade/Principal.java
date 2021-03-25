package br.com.eliza.idade;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome="";
		String dataNascto="";
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		for (int i =0;i<3;i++) {
			System.out.println("Nome:");
			nome = scanner.nextLine();
			System.out.println("Dt.Nascto:");
			dataNascto = scanner.nextLine();
			Pessoa p = new Pessoa(nome, LocalDate.of(Integer.parseInt(dataNascto.substring(4)), 
					Month.of(Integer.parseInt(dataNascto.substring(2, 4))), 
					Integer.parseInt(dataNascto.substring(0, 2))));
			pessoas.add(p);
		}
		scanner.close();
		System.out.println(pessoas);
		// ordernar lista e pegar a menor idade
	}
}

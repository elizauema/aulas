package br.com.eliza.idade;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome="";
		String dataNascto="";
		int idade=0;
		int anoNascto = 0;
		int mesNascto = 0;
		int diaNascto = 0;
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		for (int i =0;i<3;i++) {
			System.out.println("Nome:");
			nome = scanner.nextLine();
			System.out.println("Dt.Nascto:");
			dataNascto = scanner.nextLine();
			anoNascto = Integer.parseInt(dataNascto.substring(4));
			mesNascto = Integer.parseInt(dataNascto.substring(2, 4));
			diaNascto = Integer.parseInt(dataNascto.substring(0, 2));
			Pessoa p = new Pessoa(nome, LocalDate.of(Integer.parseInt(dataNascto.substring(4)), 
					Month.of(Integer.parseInt(dataNascto.substring(2, 4))), 
					Integer.parseInt(dataNascto.substring(0, 2))));
			if (anoNascto>0 & anoNascto> 1900) {
				pessoas.add(p);	
			}
		}
		scanner.close();
		System.out.println(pessoas);
		ArrayList<Pessoa> pessoas2 = new ArrayList<Pessoa>();
		
		//pessoas2.addAll(pessoas);
		
		int i = 0;
		while (i < pessoas.size()) {
			Pessoa p = pessoas.get(i);
			pessoas2.add(new Pessoa(p.getNome(),p.getDataNascto()));
			//pessoas2.add(pessoas.get(i));	
			i++;
		}
		System.out.println(pessoas2);
		// ordernar lista e pegar a menor idade
		
		Collections.sort(pessoas, (p1, p2) -> p1.getIdade() - p2.getIdade());//crescente
		System.out.println("Crescente..:"+pessoas.get(0));
		Collections.sort(pessoas, (p1, p2) -> p2.getIdade() - p1.getIdade());//decrescenten1
		System.out.println("Decrescente:"+pessoas.get(0));		
	}
}

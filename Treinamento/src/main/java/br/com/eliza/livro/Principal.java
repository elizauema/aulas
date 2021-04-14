package br.com.eliza.livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String livro = "";
		String autor = "";
		String dataPublic = "";
		ArrayList<Livro> livros = new ArrayList<Livro>();
		for (int i = 0; i < 4; i++) {
			System.out.println("Livro:");
			livro = scanner.nextLine();
			System.out.println("Autor:");
			autor = scanner.nextLine();
			System.out.println("Data Public:");
			dataPublic = scanner.nextLine();
//			Livro a = new Livro(); // como o construtor está vazio precisa ter setter
//			a.setLivro(livro);
//			a.setAutor(autor);
//			a.setDataPublic(dataPublic);
			Livro a = new Livro(livro, autor, dataPublic); // como está usando o construtor com as variaveis precisa
															// colocar as variaveis
			livros.add(a);
		}
		scanner.close();
		// Collections.sort(livros);

		Collections.sort(livros, new Comparator<Livro>() {// comparator é uma interface e obriga a implementar o metodo compare
			@Override
			public int compare(Livro liv1, Livro liv2) {
				return liv1.getLivro().compareTo(liv2.getLivro());
			}
		});
		System.out.println(livros);
		// ordenar a lista de livros por autor e imprimir
	}
}
package br.com.eliza;

import java.util.ArrayList;

public class Prateleira {

	private ArrayList<Livro> livros=new ArrayList<Livro>();
	
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	// criar getter getLivros da lista
	
	public  ArrayList<Livro> getLivros() {
		return livros;
	}

	@Override
	public String toString() {
		return "Prateleira [livros=" + livros + "]";
	}
	
	
}

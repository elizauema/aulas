package br.com.eliza;

public class Livro {
	private String titulo;
	// variaval de instancia(objeto), fica dentro da classe
	private String autor;
	private int anoPublicacao;
	private String editora;
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		// titulo em marrom pode ser qualquer nome,porem a maioria usa o mesmo nome
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}
	public void setAnoPublicao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEditora() {
		return this.editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
}


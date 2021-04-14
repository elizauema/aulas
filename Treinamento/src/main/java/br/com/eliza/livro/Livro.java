package br.com.eliza.livro;

public class Livro {
	private String livro;
	private String autor;
	private String dataPublic;// normalmente data precisa ser localDate
	
	public Livro() {
	}
	
	public Livro(String livro, String autor, String dataPublic) {
		this.livro = livro;
		this.autor = autor;
		this.dataPublic = dataPublic;
	}
	
	public String getLivro() {
		return this.livro;
	}
	public String getAutor() {
		return this.autor;
	}
	public String getDataPublic() {
		return this.dataPublic;
	}
	
	public void setLivro(String livro){
		this.livro = livro;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setDataPublic(String dataPublic) {
		this.dataPublic = dataPublic;
	}

	@Override
	public String toString() {
		return "Livro [livro=" + livro + ", autor=" + autor + ", dataPublic=" + dataPublic + "]";
	}
	
}	
//-Criar uma classe Livro. Cada livro deve conter autor, título e data de publicação
//2-Criar uma lista de livros(ArrayList)
//3-Ordenar a lista de livros pelo título por ordem alfabética

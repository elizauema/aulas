package br.com.eliza.exemplo2;

public class Marca {
	private String nome;
	private String url;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Marca(String nome, String url) {
		this.nome = nome;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Marca:" + nome + ", url:" + url + "]";
	}
	
	
}

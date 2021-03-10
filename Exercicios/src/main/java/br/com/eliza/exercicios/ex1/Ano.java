package br.com.eliza.exercicios.ex1;

public class Ano {
	private int valor;
	
	public int getValor() {
		return this.valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getValorEmDias() {
		return (valor * 365); // converter em dias
	}
}

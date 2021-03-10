package br.com.eliza.exercicios.ex1;

public class Mes {
	private int valor;
	
	public int getValor() {
		return this.valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getValorEmDias() {
		return valor * 30; // converter o mes em dias
	}
}

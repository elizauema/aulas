package br.com.eliza.idade;

import java.time.LocalDate;

public class Pessoa {
	//9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
	private String nome;
	private LocalDate dataNascto;
	
	public Pessoa(String nome, LocalDate dataNascto) {
		this.nome = nome;
		this.dataNascto = dataNascto;
	}
	
	public String getNome() {
		return this.nome;
	}
	public LocalDate getDataNascto() {
		return this.dataNascto;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNascto(LocalDate dataNascto) {
		this.dataNascto = dataNascto;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascto=" + dataNascto + "]";
	}
	
	public int getIdade() {
		return 0;// retornar idade
	}
	
}

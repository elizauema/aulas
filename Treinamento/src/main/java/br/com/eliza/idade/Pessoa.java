package br.com.eliza.idade;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

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
//		Period period = Period.between(data1, data2);
//		System.out.printf("%s day(s), %s month(s) and %s year(s) \n",
//				period.getDays(), period.getMonths(), period.getYears());
//		return period.getYears();
	//return Period.between(data1, data2).getYears();
		return (int)ChronoUnit.YEARS.between(dataNascto, LocalDate.now());
	}
	
}

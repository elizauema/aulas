package br.com.eliza.exercicios;

public class Principal {
	public static void main(String[] args) {
		Ano ano = new Ano();
		ano.setValor((short)3);
		
		Mes mes = new Mes();
		mes.setValor((short)2);
		
		Dia dia = new Dia();
		dia.setValor((short)15);
		
		System.out.println(ano.getValor());
		System.out.println(mes.getValor());
		System.out.println(dia.getValor());
		
		// imprimir a soma em dias
	}
	
}

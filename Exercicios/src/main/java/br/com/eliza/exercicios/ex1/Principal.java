package br.com.eliza.exercicios.ex1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wdata ;
		System.out.println("Digite uma data:");
		wdata = sc.next();
		System.out.println(wdata);
		int wdia = Integer.parseInt(wdata.substring(0, 2));
		int wano = Integer.parseInt(wdata.substring(4));
//		int wmes = Integer.parseInt(wdata.substring(2, 4));
//		Ano ano=new Ano();
//		ano.setValor(wano);
//		Mes mes=new Mes();
//		mes.setValor(wmes);
//		Dia dia=new Dia();
//		dia.setValor(wdia);

        Month wmes = Month.of(Integer.parseInt(wdata.substring(2, 4)));
		LocalDate wdata2 = LocalDate.of(wano, wmes, wdia);
		System.out.println(wdata2);
		
		Ano ano = new Ano();
		ano.setValor((int)wdata2.getYear());
		
		Mes mes = new Mes();
		mes.setValor((int)wdata2.getMonthValue());
		
		Dia dia = new Dia();
		dia.setValor((int)wdata2.getDayOfMonth());

		int anoEmDias = ano.getValorEmDias();
		int mesEmDias = mes.getValorEmDias();
		System.out.println(ano.getValor()+ "  anos= "+anoEmDias+" dias");
		System.out.println(mes.getValor()+ " meses= "+mesEmDias+" dias");
		System.out.println("         "+dia.getValor()+ " dias");
		int soma = dia.getValor() + mesEmDias+anoEmDias;
		System.out.println("Soma:"+soma); // imprimir a soma em dias
				
	}
	
}

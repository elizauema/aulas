package br.com.eliza.exercicios.ex2;

public class Principal {
//	2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
//	números 4, 5 e 6. A soma das duas médias. A média das médias.
	public static void main(String[] args) {
		
		Numero numero1 = new Numero(8);
		Numero numero2 = new Numero(9);
		Numero numero3 = new Numero(7);
		Numero media1 = NumeroUtils.calcularMedia(numero1, numero2, numero3);
		System.out.println(media1.getValor());
		
		Numero numero4 = new Numero(4);
		Numero numero5 = new Numero(5);
		Numero numero6 = new Numero(6);
		Numero media2 = NumeroUtils.calcularMedia(numero4, numero5, numero6);
		System.out.println(media2.getValor());
		
		Numero soma = NumeroUtils.somarNumeros(media1, media2);
		System.out.println(soma.getValor());
		
		Numero media3 = NumeroUtils.calcularMedia(media1, media2);
		System.out.println(media3.getValor());
		
	}
}

package br.com.eliza.stati;

public class ExemploStatic {
	public static void main(String[] args) {
		Celular c1 = new Celular("Samsung");
		Celular.sistemaOperacional = "IOS";

		Celular c2 = new Celular("Lg");
		Celular.sistemaOperacional = "Android";

		System.out.println(c1);
		System.out.println(c2);

		}
}

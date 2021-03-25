package br.com.eliza.stati;

public class ExemploStatic2 {
	public static void main(String[] args) {
		Celular2 c1 = new Celular2("Samsung");
		Celular2 c2 = new Celular2("Lg");
		
		System.out.println(Celular2.getSistemaoperacional());
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(Celular2.somar(10.0, 20.0));

	}
}

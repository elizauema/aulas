package br.com.eliza.formulas;

import java.util.HashMap;
import java.util.Map;

public class Formulas {

	public static void main(String[] args) {
		boolean confirmacao = true;
		char x = 'S';
		long financiamento = 1000000000000l;
		short taxa = 23;
		byte inflacao = 15;

		Escola escola = new Escola();
		Material material = new Material("caderno");
		HashMap<String, Escola> mapaescola = new HashMap<String, Escola>();
		Map<String, Escola> mapaescola2 = new HashMap<String, Escola>();
	}

}

class Escola {
	// a visibilidade desta classe é defaul(visivel dentro do mesmo pacote)

}

class Material {
	String nome; // variavel de instancia(=objeto)

	Material(String nomek) {
		this.nome = nomek;
	}

}
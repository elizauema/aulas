package br.com.eliza;

import java.util.Arrays;

//import java.util.Arrays;

public class Estante {
	private Prateleira[] prateleiras = new Prateleira[5];

	public Estante(Prateleira... p) {
		// varargs ... forma de receber uma qtde de argumentos, pode receber varias
		// estantes
		// System.out.println(Arrays.deepToString(prateleiras)); O p vira um array
		// validar para que sempre seja 5
		if (p.length == 5) {
			this.prateleiras = p;
		} else {
			throw new IllegalArgumentException("Qtde prateleira inv�lido");
		}
	}

	public Prateleira[] getPrateleiras() {
		return this.prateleiras;
	}

	@Override
	public String toString() {
		return "Estante [prateleiras=" + Arrays.toString(prateleiras) + "]";
	}

}

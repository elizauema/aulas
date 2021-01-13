package br.com.eliza;

//import java.util.Arrays;

public class Estante {
	private Prateleira[] prateleiras = new Prateleira[5];

	public Estante(Prateleira... p) {
		// varargs ... forma de receber uma qtde de argumentos, pode receber varias estantes
		//System.out.println(Arrays.deepToString(prateleiras));
		this.prateleiras = p;
	}
	public Prateleira[] getPrateleiras() {
		return this.prateleiras;
	}
}

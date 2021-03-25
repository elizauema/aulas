package br.com.eliza.stati;

public class Celular2 {
	private String marca;
	private static final String sistemaOperacional = "Android";
	
	public Celular2(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static String getSistemaoperacional() {
		// não pode usar "this"
		// não posso usar variáveis de instância aqui dentro(porque elas não são static)
		return sistemaOperacional;
	}
	
	public static double somar(double n1, double n2) {
		return n1 + n2;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", sistemaOperacional=" + sistemaOperacional + "]";
	}

}

package br.com.eliza.stati;

public class Celular {
	private String marca;
	public static String sistemaOperacional;

	public Celular(String marca) {
	this.marca = marca;
	}

	public String getMarca() {
	return marca;
	}

	public void setMarca(String marca) {
	this.marca = marca;
	}

	@Override
	public String toString() {
	return "Celular [marca=" + marca + ", sistemaOperacional=" + sistemaOperacional + "]";
	}
}

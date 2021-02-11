package br.com.eliza.exemplo2;

public class Impressora {
// criar campo , construtor de todos os campos ,getter e setter
	//laser,jato de tinta,térmica, matricial,led
	//hp,epson,brother,canon,xerox,samsung,lexmark
	private Marca marca;
	private String tipoImp;
	
	public Impressora(Marca marca, String tipoImp) {
		this.marca = marca;
		this.tipoImp = tipoImp;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public String getTipoImp() {
		return this.tipoImp;
	}
	public void setTipoimp(String tipoImp) {
		this.tipoImp = tipoImp;
	}

	@Override
	public String toString() {
		return "Impressora [marca=" + marca + ", tipoImp=" + tipoImp + "]";
	}
	
}

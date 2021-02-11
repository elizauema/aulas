package br.com.eliza.exemplo2;

public class Teclado {
	// criar campo , construtor de todos os campos ,getter e setter
	// bluetooth,gamer,
	// multilaser,redragon,logitech,razer
	private String tipoTeclado;
	private Marca marcaTeclado;
	
	public Teclado(String tipoTeclado, Marca marcaTeclado) {
		this.tipoTeclado = tipoTeclado;
		this.marcaTeclado = marcaTeclado;
	}
	public String getTipoTeclado() {
		return this.tipoTeclado;
	}
	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}
	public Marca getmarcaTeclado() {
		return this.marcaTeclado;
	}
	public void setmarcaTeclado(Marca marcaTeclado) {
		this.marcaTeclado = marcaTeclado;
	}
	@Override
	public String toString() {
		return "Teclado [tipoTeclado=" + tipoTeclado + ", marcaTeclado=" + marcaTeclado + "]";
	}
	
}

package br.com.eliza.exemplo2;

public class Monitor {
	// criar campo , construtor de todos os campos ,getter e setter
	private int tamanhoTela;
	private Marca marcaMonitor;
	
	public Monitor(int tamanhoTela, Marca marcaMonitor) {
		this.tamanhoTela = tamanhoTela;
		this.marcaMonitor = marcaMonitor;
	}
	public int getTamanhoTela() {
		return this.tamanhoTela;
	}
	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	public Marca getMarcaMonitor() {
		return this.marcaMonitor;
	}
	public void setMarcaMonitor(Marca marcaMonitor) {
		this.marcaMonitor = marcaMonitor;
	}
	@Override
	public String toString() {
		return "Monitor [tamanhoTela=" + tamanhoTela + ", marcaMonitor=" + marcaMonitor + "]";
	}
	
}

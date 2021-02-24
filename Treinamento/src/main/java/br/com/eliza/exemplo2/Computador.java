package br.com.eliza.exemplo2;

import java.util.ArrayList;

public class Computador {
	private ArrayList<Impressora> impressoras;
	private ArrayList<Monitor> monitores;
	private Mouse mouse;
	private Teclado teclado;
	private Marca marca;

	// 1o construtor
	public Computador(ArrayList<Impressora> impressoras, ArrayList<Monitor> monitores, Mouse mouse, Teclado teclado,
			Marca marca) {
		this.impressoras = impressoras;
		this.monitores = monitores;
		this.mouse = mouse;
		this.teclado = teclado;
		this.marca = marca;
	}

	// 2o construtor como nao passa nada, usa o setter
	public Computador() {

	}

	// 3o construtor
	public Computador(ArrayList<Impressora> impressoras, ArrayList<Monitor> monitores) {
		this.impressoras = impressoras;
		this.monitores = monitores;
		this.marca = new Marca("Multilaser", "https://via.placeholder.com/110");
		this.mouse = new Mouse("optico", this.marca);
		this.teclado = new Teclado("bluetooth", this.marca);
	}

	public ArrayList<Impressora> getImpressoras() {
		return impressoras;
	}

	public void setImpressoras(ArrayList<Impressora> impressoras) {
		this.impressoras = impressoras;
	}

	public ArrayList<Monitor> getMonitores() {
		return monitores;

	}

	public void setMonitores(ArrayList<Monitor> monitores) {
		this.monitores = monitores;

	}

	// getter e setter
	//
	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	// modoificar tostring para exibir de uma forma clara
	@Override
	public String toString() {
		// return "Computador [impressoras=" + impressoras + ", monitores=" + monitores
		// + ", mouse=" + mouse + ", teclado="
		// + teclado + ", marca=" + marca + "]";

		String linha = "";
		if (this.marca != null) {
			linha = this.marca.getNome();
		}
		if (this.teclado != null) {
			linha = linha + "\n Mouse: " + this.mouse.getTipoMouse() + " Teclado: " + this.teclado.getTipoTeclado();
		}
		
		linha = linha + "\n Impressoras:";
		for (int i = 0; i < impressoras.size(); i++) {
			linha =linha + "\n" + this.impressoras.get(i).getMarca() + this.impressoras.get(i).getTipoImp();
		}
		linha = linha + "\n Monitores:";
		for (int i = 0; i < monitores.size(); i++) {
			linha =linha + "\n" + this.monitores.get(i).getMarcaMonitor() + this.monitores.get(i).getTamanhoTela();
		}
		
		return linha;
	}

}

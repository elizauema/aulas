package br.com.eliza.exemplo2;

import java.util.ArrayList;

public class Computador {
	private ArrayList<Impressora> impressoras;
	private ArrayList<Monitor> monitores;
	private Mouse mouse;
	private Teclado teclado;
	private Marca marca;
	
	public Computador(ArrayList<Impressora> impressoras, ArrayList<Monitor> monitores, Mouse mouse, Teclado teclado, Marca marca) {
		this.impressoras = impressoras;
		this.monitores = monitores;
		this.mouse = mouse;
		this.teclado = teclado;
		this.marca = marca;
	}
	
	
	public ArrayList<Impressora> getImpressoras() {
		return impressoras;
	}
	public void setImpressoras(ArrayList<Impressora> impressoras) {
		this.impressoras = impressoras;
	}
	
	public ArrayList<Monitor> getMonitores(){
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
	public void setMouse(Mouse mouses) {
		this.mouse = mouses;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public void setTeclado(Teclado teclados) {
		this.teclado = teclados;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}

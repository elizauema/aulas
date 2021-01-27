package br.com.eliza.exemplo2;

import java.util.ArrayList;

public class Computador {
	private ArrayList<Impressora> impressoras;
	private ArrayList<Monitor> monitores;
	private Mouse mouse ;
	private Teclado teclado;
	
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
	
}

package br.com.eliza.exemplo2;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		ArrayList<Impressora> impressoras = new ArrayList<Impressora>();
		Marca marca1 = new Marca("HP","https://via.placeholder.com/150" );
		Impressora impressora1 = new Impressora(marca1, "jato de tinta");
		Impressora impressora2 = new Impressora(marca1, "Laser");
		impressoras.add(impressora1);
		impressoras.add(impressora2);
		//  criar computador  e todos os objetos dos quais ele depende
		
		
	}
}

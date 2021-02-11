package br.com.eliza.exemplo2;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		ArrayList<Impressora> impressoras = new ArrayList<Impressora>();
		Marca marca1 = new Marca("HP","https://via.placeholder.com/150" );
		Marca marca2 = new Marca("Epson","https://via.placeholder.com/300.png/09f/fff%20C/O%20");
		Marca marca3 = new Marca("AOC","https://via.placeholder.com/190" );
		Marca marca4 = new Marca("Logitech","https://via.placeholder.com/110");
		Marca marca5 = new Marca("Multilaser","https://via.placeholder.com/90");
		Impressora impressora1 = new Impressora(marca1, "jato de tinta");
		Impressora impressora2 = new Impressora(marca1, "Laser");
		Impressora impressora3 = new Impressora(marca2, "Laser");
		impressoras.add(impressora1);
		impressoras.add(impressora2);
		impressoras.add(impressora3);
		//  criar computador  e todos os objetos dos quais ele depende
		
		ArrayList<Monitor> monitores = new ArrayList<Monitor>();
		Monitor monitor1 =  new Monitor(18, marca1);
		Monitor monitor2 =  new Monitor(24, marca2);
		Monitor monitor3 =  new Monitor(32, marca3);
		monitores.add(monitor1);
		monitores.add(monitor2);
		monitores.add(monitor3);
		
		Mouse mouse = new Mouse("optico", marca4);
		
		Teclado teclado  = new Teclado("bluetooth", marca4);
		// qdo cria o objeto precisa usar o new. Abaixo está usando o constutor1
		//System.out.println(new Computador(impressoras, monitores, mouse, teclado, marca1));	
		Computador computer = new Computador(impressoras, monitores, mouse, teclado, marca2);
		System.out.println(computer);
		
		//  abaixo usou o construtor2
		Computador computer2 = new Computador();
		System.out.println(computer2);
		Computador computer3 = new Computador();
		computer3.setImpressoras(impressoras);
		computer3.setMouse(mouse);
		computer3.setMarca(marca2);
		computer3.setTeclado(teclado);
		computer3.setMonitores(monitores);
		System.out.println(computer3);
		
		//construtor3
		Computador computer4 = new Computador(impressoras, monitores);
		computer4.setMouse(mouse);
		System.out.println(computer4);
		
		Computador computer5 = new Computador(impressoras, monitores);
		System.out.println(computer5);
	}
}

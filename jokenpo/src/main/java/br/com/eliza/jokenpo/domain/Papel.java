package br.com.eliza.jokenpo.domain;

import br.com.eliza.jokenpo.interfaces.Opcao;

public class Papel implements Opcao {

	public boolean voceGanhou(Opcao opcaoMaquina) {
		if (opcaoMaquina instanceof Pedra) {
			return true;
		}else if (opcaoMaquina instanceof Tesoura){
			return false;
		}else {
			return false;
		}
		
	}

}

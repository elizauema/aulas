package br.com.eliza.jokenpo.domain;

import br.com.eliza.jokenpo.interfaces.Opcao;

public class Pedra implements Opcao {

	public boolean voceGanhou(Opcao opcaoMaquina) {
		if (opcaoMaquina instanceof Papel) {
			return false;
		}else if (opcaoMaquina instanceof Tesoura){
			return true;
		}else {
			return false;
		}
	}

}

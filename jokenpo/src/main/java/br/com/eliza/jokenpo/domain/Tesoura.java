package br.com.eliza.jokenpo.domain;

import br.com.eliza.jokenpo.interfaces.Opcao;

public class Tesoura implements Opcao {

	public boolean voceGanhou(Opcao opcaoMaquina) {
		if (opcaoMaquina instanceof Pedra) {
			return false;
		}else if (opcaoMaquina instanceof Papel){
			return true;
		}else {
			return false;
		}
	}

}

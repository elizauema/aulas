package br.com.eliza.jokenpo.domain;

import br.com.eliza.jokenpo.interfaces.Opcao;

public class Pedra implements Opcao {

	@Override
	public String toString() {
		return "Pedra ";
	}

	public boolean voceGanhou(Opcao opcaoMaquina) {
		if (opcaoMaquina instanceof Papel) {
			return false;
		}else if (opcaoMaquina instanceof Tesoura){
			return true;
		}else {
			return false;
		}
	}
	public boolean voceEmpatou(Opcao opcaoMaquina) {
		if (opcaoMaquina instanceof Pedra) {
			return true;
		}
		return false;
	}
}

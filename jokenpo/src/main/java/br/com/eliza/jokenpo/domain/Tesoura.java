package br.com.eliza.jokenpo.domain;

import br.com.eliza.jokenpo.interfaces.Opcao;

public class Tesoura implements Opcao {

	@Override
	public String toString() {
		return "Tesoura ";
	}

	public boolean voceGanhou(Opcao opcaoMaquina) {
		if (opcaoMaquina instanceof Pedra) {
			return false;
		}else if (opcaoMaquina instanceof Papel){
			return true;
		}else {
			return false;
		}
	}
	public boolean voceEmpatou(Opcao opcaoMaquina) {
		if (opcaoMaquina instanceof Tesoura) {
			return true;
		}
		return false;
	}

}

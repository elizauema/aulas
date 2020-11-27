package br.com.eliza.jokenpo.domain;

import br.com.eliza.jokenpo.interfaces.Opcao;

public class Papel implements Opcao {

	@Override
	public String toString() {
		return "Papel";
	}

	public boolean voceGanhou(Opcao opcaoMaquina) {
		if (opcaoMaquina instanceof Pedra) {
			return true;
		}else if (opcaoMaquina instanceof Tesoura){
			return false;
		}else {
			return false;
		}
		
	}
	
	public boolean voceEmpatou(Opcao opcaoMaquina) {
		if (opcaoMaquina instanceof Papel) {
			return true;
		}
		return false;
	}
}

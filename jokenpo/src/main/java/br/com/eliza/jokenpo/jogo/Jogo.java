package br.com.eliza.jokenpo.jogo;

import br.com.eliza.jokenpo.domain.Papel;
import br.com.eliza.jokenpo.domain.Tesoura;
import br.com.eliza.jokenpo.interfaces.Opcao;

public class Jogo {
	public static void main(String[] args) {
		Opcao minhaOpcao = new Tesoura();
		Opcao maquinaOpcao = new Papel();
		System.out.println("voce ganhou "+ minhaOpcao.voceGanhou(maquinaOpcao));
	}
}

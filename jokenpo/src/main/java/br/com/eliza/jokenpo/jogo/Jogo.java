package br.com.eliza.jokenpo.jogo;

import java.util.Scanner;

import br.com.eliza.jokenpo.domain.Papel;
import br.com.eliza.jokenpo.domain.Pedra;
import br.com.eliza.jokenpo.domain.Tesoura;
import br.com.eliza.jokenpo.interfaces.Opcao;

public class Jogo {
	public static void main(String[] args) {
		Scanner scannerOpcao = new Scanner(System.in);
		System.out.println("Escolha:\n1-Pedra\n2-Tesoura\n3-Papel");
		int opcaoEscolhida = scannerOpcao.nextInt();
		Opcao minhaOpcao = getOpcao(opcaoEscolhida);
		Opcao maquinaOpcao = getOpcao(sortearNumero(3, 1));
		System.out.println("opcao da maquina: " + maquinaOpcao);
		verificarGanhador(minhaOpcao, maquinaOpcao);
		scannerOpcao.close();
	}

	private static Opcao getOpcao(int opcaoEscolhida) {
		if (opcaoEscolhida == 1)
			return new Pedra();
		else if (opcaoEscolhida == 2)
			return new Tesoura();
		else
			return new Papel();
	}

	private static int sortearNumero(int max, int min) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	private static void verificarGanhador(Opcao minhaOpcao, Opcao maquinaOpcao) {
		if (minhaOpcao.voceEmpatou(maquinaOpcao)) {
			System.out.println("Empatou");
		} else if (minhaOpcao.voceGanhou(maquinaOpcao)) {
			System.out.println("Voce ganhou");
		} else {
			System.out.println("Voce Perdeu");
		}
	}

}

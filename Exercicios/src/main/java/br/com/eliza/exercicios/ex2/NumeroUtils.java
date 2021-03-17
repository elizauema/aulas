package br.com.eliza.exercicios.ex2;

public class NumeroUtils {
		
	public static Numero calcularMedia(Numero... numeros) {
	//	return objeto do tipo numero com a media
		double total =0;
		for (Numero n : numeros) { // ou poder pegar o tamanho pelo length
			total+=n.getValor();
		}
		double media = total / numeros.length;
		return new Numero(media);
	}
	
	public static Numero somarNumeros(Numero numero1, Numero numero2) {
		double soma = numero1.getValor() + numero2.getValor() ;
		return new Numero(soma); //precisa do new porque o retorno é um objeto
	}
}

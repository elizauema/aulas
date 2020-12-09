package br.com.eliza;

public class Principal {

	public static void main(String[] args) {
		Livro livro1 = new Livro();
	//tipo da variavel , nome da variável, new=cria objeto novo 
		livro1.setTitulo("Michele Obama");
		System.out.println(livro1.getTitulo());
	}
	

}

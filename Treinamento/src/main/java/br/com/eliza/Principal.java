package br.com.eliza;

public class Principal {

	public static void main(String[] args) {
		Livro livro1 = new Livro();
	//tipo da variavel , nome da variável, new=cria objeto novo 
		livro1.setTitulo("Michelle Obama");
		livro1.setAutor("Michelle Obama");
		livro1.setAnoPublicao(2019);
		livro1.setEditora("Crown Publishing Group");
		
		Livro livro2 = new Livro();
		livro2.setTitulo("Os melhores menus de Gordon Ramsay");
		livro2.setAutor("Gordon Ramsay");
		livro2.setAnoPublicao(2011);
		livro2.setEditora("Seila");
		
		Livro livro3 = new Livro("Harry Potter e o Cálice de Fogo","J. K. Rowling",2000,"Pottermore Publishing");
		Livro livro4 = new Livro("O pequeno príncipe","Antoine de Saint-Exupéry",1943,"Reynal & Hitchcock Gallimard");
		//System.out.println(livro1);
		//System.out.println(livro2);
		//System.out.println(livro3);
		//System.out.println(livro4);
		
		Prateleira prateleira1 = new Prateleira();
		prateleira1.adicionarLivro(livro1);
		prateleira1.adicionarLivro(livro2);
		prateleira1.adicionarLivro(livro3);
		prateleira1.adicionarLivro(livro4);
		// chamar o getLivros fazer um for e exibir cada livro
	}
	

}

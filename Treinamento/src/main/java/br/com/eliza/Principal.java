package br.com.eliza;

public class Principal {

	public static void main(String[] args) {
		Livro livro1 = new Livro();
		// tipo da variavel , nome da vari�vel, new=cria objeto novo
		livro1.setTitulo("Michelle Obama");
		livro1.setAutor("Michelle Obama");
		livro1.setAnoPublicao(2019);
		livro1.setEditora("Crown Publishing Group");

		Livro livro2 = new Livro();
		livro2.setTitulo("Os melhores menus de Gordon Ramsay");
		livro2.setAutor("Gordon Ramsay");
		livro2.setAnoPublicao(2011);
		livro2.setEditora("Seila");

		Livro livro3 = new Livro("Harry Potter e o C�lice de Fogo", "J. K. Rowling", 2000, "Pottermore Publishing");
		Livro livro4 = new Livro("O pequeno pr�ncipe", "Antoine de Saint-Exup�ry", 1943,
				"Reynal & Hitchcock Gallimard");
		// System.out.println(livro1);
		// System.out.println(livro2);
		// System.out.println(livro3);
		// System.out.println(livro4);
		// se o metodo getLivro da Prateleira for static a� chama Prateleira.getLivros

		Prateleira prateleira1 = new Prateleira();
		prateleira1.adicionarLivro(livro1);
		prateleira1.adicionarLivro(livro2);
		prateleira1.adicionarLivro(livro3);
		prateleira1.adicionarLivro(livro4);
		// chamar o getLivros fazer um for e exibir cada livro

//		for (int i = 0; i < prateleira1.getLivros().size(); i++) {
//			System.out.println(prateleira1.getLivros().get(i).getTitulo());
//		}

		// criar prateleira2 com livros diferentes
		// imprimir os livros da prateleira2

		Livro livro21 = new Livro("titulo21", "autor21", 2002, "editora 21");
		Livro livro22 = new Livro("titulo22", "autor22", 2002, "editora 22");
		Livro livro23 = new Livro("titulo23", "autor23", 2003, "editora 23");
		Livro livro24 = new Livro("titulo24", "autor24", 2004, "editora 24");
		Livro livro25 = new Livro("titulo25", "autor25", 2005, "editora 25");

		Prateleira prateleira2 = new Prateleira();
		prateleira2.adicionarLivro(livro21);
		prateleira2.adicionarLivro(livro22);
		prateleira2.adicionarLivro(livro23);
		prateleira2.adicionarLivro(livro24);
		prateleira2.adicionarLivro(livro25);

		Livro livro31 = new Livro("titulo31", "autor31", 2003, "editora 31");
		Livro livro32 = new Livro("titulo32", "autor32", 2003, "editora 32");
		Livro livro33 = new Livro("titulo33", "autor33", 2003, "editora 33");
		Livro livro34 = new Livro("titulo34", "autor34", 2003, "editora 34");
		Livro livro35 = new Livro("titulo35", "autor35", 2003, "editora 35");

		Prateleira prateleira3 = new Prateleira();
		prateleira3.adicionarLivro(livro31);
		prateleira3.adicionarLivro(livro32);
		prateleira3.adicionarLivro(livro33);
		prateleira3.adicionarLivro(livro34);
		prateleira3.adicionarLivro(livro35);

		Livro livro41 = new Livro("titulo41", "autor41", 2004, "editora 41");
		Livro livro42 = new Livro("titulo42", "autor42", 2004, "editora 42");
		Livro livro43 = new Livro("titulo43", "autor43", 2004, "editora 43");
		Livro livro44 = new Livro("titulo44", "autor44", 2004, "editora 44");
		Livro livro45 = new Livro("titulo45", "autor45", 2004, "editora 45");

		Prateleira prateleira4 = new Prateleira();
		prateleira4.adicionarLivro(livro41);
		prateleira4.adicionarLivro(livro42);
		prateleira4.adicionarLivro(livro43);
		prateleira4.adicionarLivro(livro44);
		prateleira4.adicionarLivro(livro45);

		Livro livro51 = new Livro("titulo51", "autor51", 2005, "editora 51");
		Livro livro52 = new Livro("titulo52", "autor52", 2005, "editora 52");
		Livro livro53 = new Livro("titulo53", "autor53", 2005, "editora 53");
		Livro livro54 = new Livro("titulo54", "autor54", 2005, "editora 54");
		Livro livro55 = new Livro("titulo55", "autor55", 2005, "editora 55");

		Prateleira prateleira5 = new Prateleira();
		prateleira5.adicionarLivro(livro51);
		prateleira5.adicionarLivro(livro52);
		prateleira5.adicionarLivro(livro53);
		prateleira5.adicionarLivro(livro54);
		prateleira5.adicionarLivro(livro55);

		
//		int i = 0;
//		while (i < 5) {
//			System.out.println(prateleira2.getLivros().get(i).getTitulo());
//			i++;
//		}

		Estante estante = new Estante(prateleira1, prateleira2, prateleira3,prateleira4,prateleira5);

		for (int i = 0; i < estante.getPrateleiras().length; i++) {
			System.out.println("Prateleira " + (i + 1));

			// fazer um for para mostrar os titulos dos livros de cada prateleira
			Prateleira[] a = estante.getPrateleiras();
			Prateleira p = a[i];
			
			for (int k=0; k < p.getLivros().size();k++) {
				System.out.println(p.getLivros().get(k).getTitulo());
			}
//			if (i == 0) {
//				for (int k = 0; k < prateleira1.getLivros().size(); k++) {
//					System.out.println(prateleira1.getLivros().get(k).getTitulo());
//				}
//			}
//			if (i == 1) {
//				for (int k = 0; k < prateleira2.getLivros().size(); k++) {
//					System.out.println(prateleira2.getLivros().get(k).getTitulo());
//				}
//			}
//			if (i == 2) {
//				for (int k = 0; k < prateleira3.getLivros().size(); k++) {
//					System.out.println(prateleira3.getLivros().get(k).getTitulo());
//				}
//			}
			 // criar mais 2 prateleira com livros diferente
			
		}
	}
}

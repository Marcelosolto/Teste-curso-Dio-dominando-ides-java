package br.com.dio;

import br.com.dio.model.Gato;

public class Primeiroprograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato();
		Livro Livro = new Livro();
		
		System.out.println(gato);
		System.out.println(Livro);
		
		/*int a = 2;
		int b = 3;
     System.out.println("Hello World!" + (a + b));*/
	}

}

class Livro {
	private String nome;
	private String npag;
}
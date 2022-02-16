package com.loiane.cursojava.aula80;

public class Aula80 {

	public static void main(String[] args) {

		String teste = "Isso é um teste.";

		System.out.println(teste);
		System.out.println(teste.substring(10)); //saída é teste. Ele começa a contar a partir do index10
		System.out.println(teste.substring(10, 15));//o indice fim não é inclusivo, então a saída é teste

		String ola = "olá";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); //ola + mundo
		System.out.println(olaMundo);

		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos); // saida é e s p a ç o

		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);// saída é espaço

		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim()); //remove todos os espaços que estiverem sobrando antes e depois

	}

}

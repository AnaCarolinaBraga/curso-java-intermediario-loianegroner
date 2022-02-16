package com.loiane.cursojava.aula82;

public class Aula82 {

	public static void main(String[] args) {

		//Juntar strings com um delimitador
		String alfabeto = String.join(", ", "A", "B", "C", "D");
		System.out.println(alfabeto);  //saída A, B, C, D

		//Separar strings com um delimitador
		String[] letras = alfabeto.split(", ");
		for (String letra : letras){
			System.out.println(letra); //saída ABCD
		}

		String doArquivo = "1;Antônio;30;";
		String[] infos = doArquivo.split(";");
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		System.out.println(pessoa);
	}

}

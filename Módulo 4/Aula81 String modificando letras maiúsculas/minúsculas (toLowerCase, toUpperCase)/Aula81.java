package com.loiane.cursojava.aula81;

public class Aula81 {

	public static void main(String[] args) {

		String teste = "Teste";

		String testeMinusc = teste.toLowerCase();
		String testeMaisc = teste.toUpperCase();

		System.out.println(testeMinusc);
		System.out.println(testeMaisc);

		//Para fazer comparação sem usar o compareto():
		//if (teste.toLowerCase().equals(teste.toLowerCase()))
	}

}

package com.loiane.cursojava.aula54;

public class Aula54 {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.DOMINGO;

		//Aqui a saída é DOMINGO - 7
		System.out.println(dia.toString() + " - " + dia.getValor());

		//Outra forma de fazer
		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
	}

}

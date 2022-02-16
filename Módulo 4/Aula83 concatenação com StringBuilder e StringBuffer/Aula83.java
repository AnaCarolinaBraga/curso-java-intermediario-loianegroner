package com.loiane.cursojava.aula83;

public class Aula83 {

	public static void main(String[] args) {

		String[] letras = {"B", "C", "D", "E", "F"};

		String alfabeto = "";

		for (String letra : letras){
			alfabeto += letra;
		}

		System.out.println(alfabeto); //saída BCDEF

		StringBuffer sb = new StringBuffer();
		for (String letra : letras){
			sb.append(letra);
		}
		alfabeto = sb.toString();

		System.out.println(alfabeto); //saída BCDEF

		alfabeto = new String(sb);
		System.out.println(alfabeto); //saída BCDEF

		System.out.println(sb.reverse());  //saída FEDCB

		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras){
			sb_.append(letra);
		}
		alfabeto = sb_.toString();

		System.out.println(alfabeto); //saída BCDEF
	}

}

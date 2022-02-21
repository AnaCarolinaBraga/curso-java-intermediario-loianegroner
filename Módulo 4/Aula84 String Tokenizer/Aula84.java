package com.loiane.cursojava.aula84;

import java.util.StringTokenizer;

public class Aula84 {

	public static void main(String[] args) {

		String doArquivo = "1;Antônio;30;";

		//Aqui, ele não separa em pedaços e sim em tokens
		StringTokenizer st = new StringTokenizer(doArquivo, ";");

		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}

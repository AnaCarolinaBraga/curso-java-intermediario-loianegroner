package com.loiane.cursojava.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*;     O Asterisco importa tudo. É mais elegante explicitar o que voce vai usar, usando os anteriores



public class StaticImport {

	public static void main(String[] args) {

		double a = 2;
		double b = 3;
		double c = 4;

		System.out.println(Math.pow(a, b));

		System.out.println(Math.sqrt(c));

		//Como ja tem o import la em cima, podemos chamar direto assim
		System.out.println(pow(a, b));
		System.out.println(sqrt(c));
	}

}

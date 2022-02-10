package com.loiane.cursojava.aula63;

public class Exemploprintf {

	public static void main(String[] args) {

		System.out.printf("%s", "Olá, mundo!");
		System.out.println();
		System.out.printf("%S", "Olá, mundo!");
		System.out.println();

		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');

		System.out.printf("%n");   //pula a linha

		int valor = 123456789;
		System.out.printf("%d", valor);
		System.out.println();

		double pontoFlutuante = 3.1456987;
		System.out.printf("%f", pontoFlutuante);  //só que ele arredonda
		System.out.println();

		String olaMundo = "Ola, mundo!";
		System.out.printf("%20s", "Olá, mundo!");  //Vai ter 20 espaços
		System.out.println();
		System.out.printf("%-20s", "Olá, mundo!");
		System.out.println();

		System.out.printf("%+d", valor);
		System.out.println();
		System.out.printf("%015d", valor);  //15 digitos e se sobrar, preenche com 0

		System.out.println();
		System.out.printf("%,d", valor);     //Acrescenta virgula a cada 3 casas decimais
		System.out.println();

		int valor2 = -123456789;
		System.out.printf("% d", valor2);   //Imprime o sinal junto se for negativo
		System.out.println();
		System.out.printf("% d", valor);   
		System.out.println();

		System.out.printf("%.3f", pontoFlutuante);   //limita o numero de casas decimais e arredonda
		System.out.println();
		System.out.printf("R$%10.2f", pontoFlutuante);   
		System.out.println();

		testemaisCompleto();		
	}

	private static void testemaisCompleto() {

		double[] precos = {1000, 123.54, 7843.567, 1, 4.56789};

		for (int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
	}

}

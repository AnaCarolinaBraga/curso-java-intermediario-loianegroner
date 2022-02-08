package com.loiane.cursojava.aula56.exercicio;

import java.util.Scanner;

import com.loiane.cursojava.aula54.DiaSemana;

public class TesteCalculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número:");
		double x = scan.nextDouble();
		System.out.println("Digite outro número:");
		double y = scan.nextDouble();

		for(Calculadora operacoes : Calculadora.values()) {

			System.out.print(x + " ");
			System.out.print(operacoes.toString()+ " ");
			System.out.print(y + " = ");
			System.out.print(operacoes.executarOperacao(x, y) + "\n");

		}
	}
}

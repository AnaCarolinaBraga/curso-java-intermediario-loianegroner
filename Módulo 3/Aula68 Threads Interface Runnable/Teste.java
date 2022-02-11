package com.loiane.cursojava.aula68;


public class Teste {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 600);

		//Thread t1 = new Thread(thread1);
		//t1.start();
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 400);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 1200);

	}

}

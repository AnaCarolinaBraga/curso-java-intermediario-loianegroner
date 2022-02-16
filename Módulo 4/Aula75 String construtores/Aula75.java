package com.loiane.cursojava.aula75;

public class Aula75 {

	public static void main(String[] args) {

		String vazia = new String(); 
		System.out.println(vazia); //saída vazia

		String java = new String("JAVA");
		System.out.println(java); //JAVA

		String java1 = new String(java);
		System.out.println(java1); //JAVA

		char[] charsJava = {'J', 'A', 'V', 'A'};
		String java2 = new String(charsJava);
		System.out.println(java2); //JAVA

		char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
		String abc = new String(abcdef, 0, 3); //ABC
		System.out.println(abc);

		byte[] ascii = {65, 66, 67, 68, 69};
		String abcde = new String(ascii);
		System.out.println(abcde); //ABCDE

		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd); //BCD

		String java3 = "JAVA";
		String java4 = "JAVA";

		System.out.println(java3); //JAVA
		System.out.println(java4); //JAVA
	}

}

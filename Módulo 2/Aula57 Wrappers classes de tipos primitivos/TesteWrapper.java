package com.loiane.cursojava.aula57;

public class TesteWrapper {

	public static void main(String[] args) {

		//Tipos primitivos
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 1000l;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = true;
		char a = 'a';
		
		//Classes Wrappers representando os tipos primitivos
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte)10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(100001l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		Integer num13 = new Integer("100");
		int num14 = num13.intValue();
		long num15 = num13.longValue();
		System.out.println(num14);  //saída é 100
		int num16 = Integer.parseInt("1000");
		
		
	}

}

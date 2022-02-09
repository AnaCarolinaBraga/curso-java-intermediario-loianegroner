package com.loiane.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {

		//Autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 1001l;
		Float num11 = 3.5f;
		Double num12 = 3.5555	;
		Boolean flag2 = true;
		Character b1 = 'b';	
		
		//Auto un-boxing
		int num13 = num9;   //equivalente a usar num9.intValue();
		
		//autoboxing em expressoes
		num9++;
		
		System.out.println(num9);
		
		Integer num14 = num13/num9;
		
		//mau uso dessas propriedades, melhor usar tipo primitivo que classe
		//se precisar fazer muitas expressoes com os numeros
		Double a, b ,c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		Double media = (a+b+c)/3;
		System.out.println(media);
	}

}

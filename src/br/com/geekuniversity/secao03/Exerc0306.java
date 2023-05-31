package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0306 {

	public static void main(String[] args) {
		
		double tempC, tempF;
		System.out.print("Digite uma temperatura em Celsius para que seja convertida em Fahrenheit: ");
		Scanner teclado = new Scanner(System.in);
		tempC = teclado.nextDouble();
		tempF = (tempC * 9/5) + 32;
		System.out.printf("O valor da tempetura " + tempC + "Cº corresponde a " + tempF + "Fº");
		
		teclado.close();

	}


}

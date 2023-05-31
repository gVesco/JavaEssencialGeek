package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0307 {

	public static void main(String[] args) {
		
		double tempC, tempF;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um valor em Fahrenheit para que seja convertido em Celsius: ");
		tempF = teclado.nextDouble();
		tempC = 5 * (tempF - 32)/9;
		System.out.printf("O valor " + tempF + "ºF convertido em Celsius corresponde a " + tempC + "ºC.");
		
		teclado.close();
		
	}

}

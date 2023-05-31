package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0308 {

	public static void main(String[] args) {
		
		double tempK, tempC;
		
		System.out.print("Digite uma temperatura em graus Kelvin para que seja convertida em graus Celsius: ");
		Scanner teclado = new Scanner(System.in);
		tempK = teclado.nextDouble();
		tempC = tempK - 273.15;
		System.out.printf("O valor digitado corresponde a " + tempC + "ºC.");
		
		teclado.close();
		
	}

}

package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0309 {

	public static void main(String[] args) {
		
		double tempC, tempK;
		System.out.print("Digite uma temperatura em graus Celsius para que seja convertida em graus Kelvin: ");
		Scanner teclado = new Scanner(System.in);
		tempC = teclado.nextDouble();
		tempK = tempC + 273.15;
		System.out.printf("O valor convertido em graus Kelvin corresponde a " + tempK + "ºK.");
		
		teclado.close();

	}

}

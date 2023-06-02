package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0325 {

	public static void main(String[] args) {
		double areaM, areaA;
		System.out.println("Digite um valor de área em acres para que seja convertido em metros quadrados m²: ");
		Scanner teclado = new Scanner(System.in);
		areaA = teclado.nextDouble();
		areaM = areaA * 4046.86;
		System.out.printf("O valor digitado corresponde a " + areaM + " metros quadrados m².");
		teclado.close();
	}

}

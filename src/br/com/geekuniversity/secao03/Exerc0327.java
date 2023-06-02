package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0327 {

	public static void main(String[] args) {
		double areaM, areaH;
		System.out.println("Digite um valor de área em hectares para que seja convertido em metros quadrados m²: ");
		Scanner teclado = new Scanner(System.in);
		areaH = teclado.nextDouble();
		areaM = areaH * 10000;
		System.out.printf("O valor digitado corresponde a " + areaM + " metros quadrados m².");
		teclado.close();
	}

}

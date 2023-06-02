package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0324 {

	public static void main(String[] args) {
		double areaM, areaA;
		System.out.println("Digite um valor de área em metros quadrados m² para que seja convertido em acres: ");
		Scanner teclado = new Scanner(System.in);
		areaM = teclado.nextDouble();
		areaA = areaM * 0.000247;
		System.out.printf("O valor digitado corresponde a " + areaA + " acres.");
		teclado.close();
	}

}

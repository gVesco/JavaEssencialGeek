package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0326 {

	public static void main(String[] args) {
		double areaM, areaH;
		System.out.println("Digite um valor de área em metros quadrados m² para que seja convertido em hectares ");
		Scanner teclado = new Scanner(System.in);
		areaM = teclado.nextDouble();
		areaH = areaM * 0.0001;
		System.out.printf("O valor digitado corresponde a " + areaH + " hectares.");
		teclado.close();
	}

}

package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0322 {

	public static void main(String[] args) {
		double compJ, compM;
		System.out.println("Digite um valor de comprimento em jardas para que seja convertido em metros: ");
		Scanner teclado = new Scanner(System.in);
		compJ = teclado.nextDouble();
		compM = compJ * 0.91;
		System.out.printf("O valor digitado corresponde a " + compM + " metros.");
		teclado.close();

	}

}

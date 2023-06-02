package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0323 {

	public static void main(String[] args) {
		double compJ, compM;
		System.out.println("Digite um valor de comprimento em metros para que seja convertido em jardas: ");
		Scanner teclado = new Scanner(System.in);
		compM = teclado.nextDouble();
		compJ = compM / 0.91;
		System.out.printf("O valor digitado corresponde a " + compJ + " jardas.");
		teclado.close();
	}

}

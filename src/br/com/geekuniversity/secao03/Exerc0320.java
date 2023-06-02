package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0320 {

	public static void main(String[] args) {
		double massaK;
		double massaL;
		
		System.out.println("Digite um valor de massa em quilogramas para que seja convertido em libras: ");
		Scanner teclado = new Scanner(System.in);
		massaK = teclado.nextDouble();
		massaL = massaK / 0.45;
		System.out.printf("O valor convertido corresponde a " + massaL + " libras.");
		
		teclado.close();
	}

}

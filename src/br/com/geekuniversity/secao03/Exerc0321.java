package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0321 {

	public static void main(String[] args) {
		double massaK;
		double massaL;
		
		System.out.println("Digite um valor de massa em libras para que seja convertido em quilogramas: ");
		Scanner teclado = new Scanner(System.in);
		massaL = teclado.nextDouble();
		massaK = massaL * 0.45;
		System.out.printf("O valor convertido corresponde a " + massaK + " quilogramas.");
		
		teclado.close();
	}

}

package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0316 {

	public static void main(String[] args) {
		
		double compP, compC;
		
		System.out.println("Digite um comprimento em polegadas para que seja convertido em centímetros: ");
		Scanner teclado = new Scanner(System.in);
		compP = teclado.nextDouble();
		compC = compP * 2.54;
		System.out.println("O valor digitado corresponde a " + compC + " centímetros.");
		
		teclado.close();
		
	}

}

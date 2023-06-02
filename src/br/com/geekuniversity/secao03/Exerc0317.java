package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0317 {

	public static void main(String[] args) {
		
		double compC;
		double compP;
		
		System.out.println("Digite um comprimento em centímetros para que seja convertido em polegadas: ");
		Scanner teclado = new Scanner(System.in);
		compC = teclado.nextDouble();
		compP = compC / 2.54;
		System.out.println("O valor digitado corresponde a " + compP + " polegadas.");
		
		teclado.close();

	}

}

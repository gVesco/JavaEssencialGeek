package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0310 {

	public static void main(String[] args) {

		double velKm, velMs;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma velocidade medida em km/h para que seja convertida em m/s: ");
		velKm = teclado.nextDouble();
		velMs = velKm / 3.6;
		System.out.printf("A conversão resultou em " + velMs + " m/s.");
		
		teclado.close();

	}

}

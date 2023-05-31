package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0311 {

	public static void main(String[] args) {
		
		double velMs;
		double velKm;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma velocidade em m/s para que seja convertida em Km/h: ");
		velMs = teclado.nextDouble();
		velKm = velMs * 3.6;
		System.out.printf("O valor convertido corresponde a " + velKm + " Km/h.");
		
		teclado.close();

	}

}

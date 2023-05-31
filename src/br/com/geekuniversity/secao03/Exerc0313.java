package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0313 {

	public static void main(String[] args) {
		
		double distM;
		double distKm;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma distância em quilômetros para que seja convertida em milhas: ");
		distKm = teclado.nextDouble();
		distM = distKm / 1.60934;
		System.out.printf("O valor convertido corresponde a " + distM + " milhas.");
		
		teclado.close();

	}

}

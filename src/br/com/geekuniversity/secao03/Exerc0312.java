package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0312 {

	public static void main(String[] args) {
		
		double distM;
		double distKm;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma distância em milhas para que seja convertida em quilômetros: ");
		distM = teclado.nextDouble();
		distKm = distM * 1.60934;
		System.out.printf("O valor convertido corresponde a " + distKm + " quilômetros.");
		
		teclado.close();

	}

}

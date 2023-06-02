package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0318 {

	public static void main(String[] args) {
		
		double volM;
		double volL;
		
		System.out.println("Digite um valor de volume em metros cúbicos m³ para que seja convertido em litros: ");
		Scanner teclado = new Scanner(System.in);
		volM = teclado.nextDouble();
		volL = 1000 * volM;
		System.out.printf("O valor convertido corresponde a " + volL + " litros.");
		
		teclado.close();

	}

}

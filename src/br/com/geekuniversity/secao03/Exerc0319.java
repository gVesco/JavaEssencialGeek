package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0319 {

	public static void main(String[] args) {
		double volM;
		double volL;
		
		System.out.println("Digite um valor de volume em litros para que seja convertido em metros cúbicos m³: ");
		Scanner teclado = new Scanner(System.in);
		volL = teclado.nextDouble();
		volM = volL / 1000;
		System.out.printf("O valor convertido corresponde a " + volM + " metros cúbicos m³.");
		
		teclado.close();

	}

}

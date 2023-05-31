package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0315 {

	public static void main(String[] args) {
		
		double angG, angR;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um ângulo em radianos para que seja convertido em graus: ");
		angR = teclado.nextDouble();
		angG = angR * 180 / Math.PI;
		System.out.printf("O ângulo informado corresponde a " + angG + " em graus.");
		
		teclado.close();

	}

}

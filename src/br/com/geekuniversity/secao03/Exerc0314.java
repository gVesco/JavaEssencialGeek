package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0314 {

	public static void main(String[] args) {
		
		double angG, angR;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um ângulo em graus para que seja convertido em radianos: ");
		angG = teclado.nextDouble();
		angR = angG * Math.PI / 180 ;
		System.out.printf("O ângulo informado corresponde a " + angR + " em radianos.");
		
		teclado.close();

	}

}

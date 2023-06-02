package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0328 {

	public static void main(String[] args) {
		double valor1, valor2, valor3, resultado;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite três valores para que seja retornado a soma dos quadrados dos três valores.\nValor 1: ");
		valor1 = teclado.nextDouble();
		System.out.println("Valor 2: ");
		valor2 = teclado.nextDouble();
		System.out.println("Valor 3: ");
		valor3 = teclado.nextDouble();
		resultado = Math.pow(valor1, 2) + Math.pow(valor2, 2) + Math.pow(valor3, 2); 
		System.out.printf("O resultado final é " + resultado);
		
		teclado.close();
	}

}

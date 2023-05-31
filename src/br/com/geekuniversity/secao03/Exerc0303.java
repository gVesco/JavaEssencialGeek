package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0303 {

	public static void main(String[] args) {
		
		int val1, val2, val3, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite três valores inteiros para que sejam somados: ");
		val1 = teclado.nextInt();
		val2 = teclado.nextInt();
		val3 = teclado.nextInt();
		soma = val1 + val2 + val3;
		System.out.println("O valor da soma é: " + soma);
		
		teclado.close();

	}

}

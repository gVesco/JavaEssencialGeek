package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0304 {

	public static void main(String[] args) {
		
		double numReal, resultado;
		
		System.out.println("Digite um número real para que seja calculado o quadrado deste número");
		Scanner teclado = new Scanner(System.in);
		numReal = teclado.nextFloat();
		resultado = Math.pow(numReal, 2);
		System.out.println("O quadrado do número " + numReal + " é " + resultado);
		teclado.close();

	}

}

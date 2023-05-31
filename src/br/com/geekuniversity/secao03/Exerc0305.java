package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0305 {

	public static void main(String[] args) {

		double numReal, resultado;
		
		System.out.print("Digite um número real para que seja impressa a quinta parte deste número: ");
		Scanner teclado = new Scanner(System.in);
		numReal = teclado.nextFloat();
		resultado = numReal / 5;
		System.out.println("A quinta parte do número " + numReal + " é: " + resultado);
		
		teclado.close();
	}

}

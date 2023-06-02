package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0329 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite quatro notas para que seja retornada a média aritmética.\nNota 1: ");
		nota1 = teclado.nextDouble();
		System.out.println("Nota 2: ");
		nota2 = teclado.nextDouble();
		System.out.println("Nota 3: ");
		nota3 = teclado.nextDouble();
		System.out.println("Nota 4: ");
		nota4 = teclado.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4) / 4; 
		System.out.printf("A média aritmética é " + media);
		
		teclado.close();

	}

}

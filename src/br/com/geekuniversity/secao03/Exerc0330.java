package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0330 {

	public static void main(String[] args) {
		double real, cotDolar, valFim;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor na moeda Real e a cotação do Dólar para que seja retornado a conversão em Dólares.\nValor em Reais: ");
		real = teclado.nextDouble();
		System.out.println("Cotação do Dólar: ");
		cotDolar = teclado.nextDouble();
		valFim = real / cotDolar;
		System.out.printf("O valor informado corresponde a " + valFim + " dólares.");
		
		teclado.close();

	}

}

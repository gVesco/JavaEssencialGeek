package JavaEssencialGeek;

import java.util.Scanner;

public class Exerc0302 {

	public static void main(String[] args) {
		
		float numReal;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número real: ");
		numReal = teclado.nextFloat();
		System.out.println("Você digitou o número " + numReal);
		
		teclado.close();

	}

}

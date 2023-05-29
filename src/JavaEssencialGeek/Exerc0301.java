package JavaEssencialGeek;

import java.util.Scanner;

public class Exerc0301 {

	public static void main(String[] args) {
		int numInt;
		

		//Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Digite um número: ");
		numInt = teclado.nextInt();
		System.out.println("Você digitou o número " + numInt);
		
		teclado.close();
		

	}

}

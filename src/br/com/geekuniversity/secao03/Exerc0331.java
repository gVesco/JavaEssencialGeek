package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0331 {
    public static void main(String[] args) {
        // Leia um número inteiro e imprima o seu antecessor e o seu sucessor.
        double numOrig;
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor numérico para que seja impresso o antecessor e o sucessor do mesmo: ");
        numOrig = teclado.nextDouble();
        System.out.printf("O antecessor é o número " + (numOrig - 1) + " e o sucessor desse número é " + (numOrig + 1) + ".");
        teclado.close();
    }
}

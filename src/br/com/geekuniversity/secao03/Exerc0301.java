package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numInt = scanner.nextInt();
        System.out.println("Você digitou o número " + numInt);

        scanner.close();
    }
}

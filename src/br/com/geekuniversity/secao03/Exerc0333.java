package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0333 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado de um quadrado: ");
        double lado = teclado.nextDouble();

        double area = calcularAreaQuadrado(lado);

        System.out.printf("A área do quadrado é: %.2f", area);

        teclado.close();
    }

    private static double calcularAreaQuadrado(double lado) {
        return Math.pow(lado, 2);
    }
}

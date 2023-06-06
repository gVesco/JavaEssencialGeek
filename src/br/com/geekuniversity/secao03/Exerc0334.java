package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0334 {
    public static void main(String[] args) {
        double raio;
        double area;
        
        System.out.print("Digite o valor do raio de um círculo para que seja impressa a área deste círculo: \n");
        Scanner teclado = new Scanner(System.in);
        raio = teclado.nextDouble();
        area = calcularAreaCirculo(raio);

        System.out.printf("A área do círculo é: %.2f", area);

        teclado.close();
    }

    private static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}

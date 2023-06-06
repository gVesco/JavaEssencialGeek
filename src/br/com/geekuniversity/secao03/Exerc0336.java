package br.com.geekuniversity.secao03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc0336 {
    public static void main(String[] args) {
        double alturaCilindro, raioCilindro, volumeCilindro;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a altura e o raio de um cilindro circular para que seja retornado o volume do cilindro.");
        System.out.println("Digite a altura: ");
        try {
            alturaCilindro = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um valor numérico válido.");
            teclado.close();
            return;
            // Encerra o programa caso ocorra entrada inválida
        }
        System.out.println("Digite o raio: ");
        try {
            raioCilindro = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um valor numérico válido.");
            teclado.close();
            return;
            // Encerra o programa caso ocorra entrada inválida
        }

        // Função que calcula e retorna volume do cilindro
        volumeCilindro = calcularVolCilindro(alturaCilindro, raioCilindro);

        System.out.println("O cilindro circular possui " + volumeCilindro + " m³.");

        teclado.close();
    }

    /**
     * @param alturaCilindro Altura do cilindro
     * @param raioCilindro   Raio do cilindro
     * @return Volume do cilindro
     */
    public static double calcularVolCilindro(double alturaCilindro, double raioCilindro) {
        return Math.PI * Math.pow(raioCilindro, 2) * alturaCilindro;
    }

}

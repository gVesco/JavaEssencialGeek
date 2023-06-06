package br.com.geekuniversity.secao03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc0338 {
    public static void main(String[] args) {
        double salarioOriginal, percentualAumento, salarioFinal;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor do salário do funcionário e qual o aumento percentual que ele receberá.");
        System.out.println("Valor do salário: ");
        try {
            salarioOriginal = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um valor numérico válido.");
            teclado.close();
            return;
            // Encerra o programa caso ocorra entrada inválida
        }

        System.out.println("Digite o percentual do desconto: ");
        try {
            percentualAumento = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um valor numérico válido.");
            teclado.close();
            return;
            // Encerra o programa caso ocorra entrada inválida
        }

        salarioFinal = calcularSalarioFinal(salarioOriginal, percentualAumento);

        // Impressão final com valores calculados
        System.out.printf("---------------------------------------------------\n"
        + "Salario original: R$" + salarioOriginal + " \nPercentual de aumento: " 
        + percentualAumento + "\nValor do salário final: R$%.2f ", salarioFinal);

        teclado.close();
    }

    public static double calcularSalarioFinal(double salarioOriginal, double percentualAumento) {
        double valorAumento = (salarioOriginal * percentualAumento) / 100;
        return salarioOriginal + valorAumento;
    }
}

package br.com.geekuniversity.secao03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc0337 {
    public static void main(String[] args) {
        double valorBrutoProduto, valorLiquidoProduto, descontoPercentual;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do produto para que seja impresso o valor com desconto: ");
        try {
            valorBrutoProduto = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um valor numérico válido.");
            teclado.close();
            return;
            // Encerra o programa caso ocorra entrada inválida
        }
        System.out.println("Digite o percentual do desconto: ");
        try {
            descontoPercentual = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um valor numérico válido.");
            teclado.close();
            return;
            // Encerra o programa caso ocorra entrada inválida
        }

        // Função que calcula e retorna preço do produto cm desconto
        valorLiquidoProduto = calcularDescontoProduto(valorBrutoProduto, descontoPercentual);

        // Impressão final com valores calculados
        System.out.printf("---------------------------------------------------\n"
        + "Valor original: R$" + valorBrutoProduto + " \nPercentual do desconto: " 
        + descontoPercentual + "\nValor líquido do produto: R$%.2f ", valorLiquidoProduto);

        teclado.close();
    }

/**
 * 
 * @param valorBrutoProduto Valor original do produto
 * @param descontoPercentual Valor do desconto percentual a ser aplicado
 * @return Valor liquido final do produto
 */
    public static double calcularDescontoProduto(double valorBrutoProduto, double descontoPercentual) {
        double descontoFinal = (valorBrutoProduto * descontoPercentual) / 100;
        return valorBrutoProduto - descontoFinal;
    }
}

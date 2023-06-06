package br.com.geekuniversity.secao03;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Programa que calcula valor de premiação para três ganhadores de um concurso
 */
public class Exerc0339 {
    public static void main(String[] args) {

            double valorPremioTotal, vencedor1, vencedor2, vencedor3;
            Scanner teclado = new Scanner(System.in);
    
            // Entrada do usuário valor da premiação
            System.out.println("Digite o valor do prêmio que será entregue: ");
            try {
                valorPremioTotal = teclado.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Digite um valor numérico válido.");
                teclado.close();
                return;
                // Encerra o programa caso ocorra entrada inválida
            }
             
            // Função que calcula e retorna valor do prêmio individual
            vencedor1 = calcularPremiacao(valorPremioTotal,46);
            vencedor2 = calcularPremiacao(valorPremioTotal, 32);
            vencedor3 = calcularPremiacao(valorPremioTotal, 22);

            // Impressão final com valores calculados
            System.out.printf(
                "---------------------------------------------------\n"
                + "Valor do prêmio: R$" + valorPremioTotal
                + "\nCom 46 por cento do prêmio o primeiro vencedor levará: R$" + vencedor1
                + "\nCom 32 por cento do prêmio o segundo vencedor levará: R$" + vencedor2
                + "\nCom 22 por cento do prêmio o terceiro vencedor levará: R$" + vencedor3);
    
            teclado.close();
        }
    
        public static double calcularPremiacao(double valorPremioTotal, double percentualPremio) {
            return (valorPremioTotal * percentualPremio) / 100;
        }
    
}

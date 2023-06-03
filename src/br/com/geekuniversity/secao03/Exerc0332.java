package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0332 {
    public static void main(String[] args) {
        //Leia um número inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro.
        double numOrig;
        double resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor numérico para que" +
         "seja impresso a soma do sucessor de seu triplo com o antecessor de seu dobro: ");
        numOrig = teclado.nextDouble();
        resultado = ((numOrig * 3 + 1) + (numOrig * 2 - 1));
        System.out.printf("O calculo retornou como resultado o número: %.2f", resultado);
        // Utilizei System.out.printf com a string de formato %.2f para formatar o resultado com duas casas decimais.
        // Isso garante que o número seja exibido corretamente na saída.
        teclado.close();
    }
}

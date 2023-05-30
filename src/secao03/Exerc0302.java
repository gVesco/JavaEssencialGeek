package secao03;

import java.util.Scanner;

public class Exerc0302 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        float numReal = teclado.nextFloat();
        System.out.println("Você digitou o número " + numReal);
        teclado.close();
    }
}

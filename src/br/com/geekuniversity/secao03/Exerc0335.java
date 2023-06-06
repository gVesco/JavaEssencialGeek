package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exerc0335 {
    public static void main(String[] args) {
        double catetoA, catetoB, hipotenusa;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite os valores dos catetos A e B de um triângulo para que seja calculado o valor da hipotenusa: \n");
        System.out.print("Cateto A: \n");
        catetoA = teclado.nextDouble();
        System.out.print("Cateto B: \n");
        catetoB = teclado.nextDouble();
        
        hipotenusa = calcHipotenusaTriang(catetoA, catetoB);
        
        System.out.printf("O valor da hipotenusa é: %.2f", hipotenusa);

        teclado.close();
    }
    
    private static double calcHipotenusaTriang (double catetoA, double catetoB) {
        return Math.sqrt( Math.pow(catetoA, 2) + Math.pow(catetoB, 2) );
    }

}

package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuclesAnidados {
    public void bucles1(){
        Scanner teclado = new Scanner(System.in);
        int altura = teclado.nextInt();

        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void bucles2(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nTABLAS DE MULTIPLICAR");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            System.out.println("-----------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j + " ");
            }
            System.out.println("");
        }
    }

}

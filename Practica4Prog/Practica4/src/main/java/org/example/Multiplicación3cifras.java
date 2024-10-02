package org.example;

import java.util.Scanner;

public class Multiplicación3cifras {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in); // Crear el objeto Scanner una vez
        int multiplicando = 0;
        int multiplicador = 0;

            System.out.print("Introduce el multiplicando (3 cifras): "); // Pedir primer número
            multiplicando = entradaEscaner.nextInt();

            if (multiplicando >= 100 && multiplicando <= 999) { // Si es 99 o 1000 deja de tener 3 cifras
                System.out.println("Tu primer número es " + multiplicando);
            } else {
                System.out.println("ERROR. Introduce un número de 3 cifras.");
                multiplicando = entradaEscaner.nextInt();
            }

            System.out.print("Introduce otro multiplicando (3 cifras): "); // Pedir segundo número
            multiplicador = entradaEscaner.nextInt();

            if (multiplicador >= 100 && multiplicador <= 999) { // Si es 99 o 1000 deja de tener 3 cifras
                System.out.println("Tu segundo número es " + multiplicador);
            } else {
                System.out.println("ERROR. Introduce un número de 3 cifras.");
                multiplicador = entradaEscaner.nextInt();
            }
            String multiplicando = Integer.toString(num);
            String multiplicador = multiplicando.substring(0,1);
            int num_1 = Integer.parseInt(multiplicador);

            System.out.println ("La primera cifra es " + num_1)
        }
        }

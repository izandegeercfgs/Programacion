package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaEjercicios {

    public void ejercicio0 () {

        int vector []; //Crer el vector con el tipo de variable que vamos a usar

        vector = new int[7]; //hemo declarado qe el vector va a tener 7 espacios, del 0 al 6, para poder usarlo.

        vector [2] = 7;
        vector [5] = vector[2] + 4;

        System.out.println(vector [2] + " " + vector[5]);

        System.out.print("[");

        for (int i = 0 ; i < vector.length ; i++) { //Siempre menor por que si no se sale del rango del vector
            System.out.print(" " + vector [i] + ", ");

        }

        System.out.println("]");

        String palabras [] = new String[3];
        palabras [0] = "Pepe";

        System.out.print("[");
        for (int i = 0 ; i < palabras.length ; i++) {
            System.out.print(" " + palabras [i] + ", ");

        }

        System.out.println("]");

    }

    public void ejercicio1 () {

        Random aleatorio = new Random();
        int suma = 0;

        int vector [] = new int [8];

        for (int i = 0; i < vector.length; i++) { //Bucle para rellenar el vector

            vector [i] = aleatorio.nextInt(501);
            suma += vector[i];

        }

        System.out.println("La suma de los elementos es: " + suma);

    }

    public void ejercicio2 () {
        int[] array = {1,2,3,4,5};
        int ultima = array[array.length - 1];

        int tam_mitad = array.length / 2;

        for (int i = 0; i < tam_mitad; i++) {

            int aux = array[1];
            array[i] = array[array.length - 1 - 1];
            array[array.length - 1] = aux;

        }
    }

    public void ejercicio3 () {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int num;
        int contador = 0;

        int vector [] = new int [100];

        System.out.println("Ingresa un numero para buscar [0,100]...");
        num = entrada.nextInt();

        for (int i = 0; i < vector.length; i++) { //Bucle para rellenar el vector

            vector [i] = aleatorio.nextInt(101);

        }

        for (int i = 0; i < vector.length; i++) {

            if (num == vector[i]) {
                contador++;
            }

        }

        System.out.println("El número " + num + " aparece " + contador + " veces en el array.");

    }

    public void ejercicio4 () {

        Scanner entrada = new Scanner(System.in);
        int vector [] = new int[5];
        int vector2 [] = new int[5];
        int valor = 1;
        int num;

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Introduce el " + valor + "º número del vector.");
            vector [i] = entrada.nextInt();

        }

        System.out.println("Ingresa el índice a eliminar: ");
        num = entrada.nextInt();

        for (int i = 0; i < vector.length; i++) {

            if (num == vector[i]){
                continue;
            }

            vector2 [i] = vector [i];

        }


        System.out.println("El array resultante es: ");
        System.out.print("[");
        for (int i = 0 ; i < vector.length ; i++) {

            System.out.print(" " + vector2 [i] + ", ");

        }
        System.out.println("]");

    }

    public void ejercicio5 () {
        int[] array = {1,2,3,4,5};
        int ultima = array[array.length - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                array[i] = ultima;
            } else {
                array[i] = array[i - 1];
            }
            System.out.println(array[i]);
        }
    }

    public void navidad () {

        Scanner entrada = new Scanner(System.in);

        final String palabra = "NAVIDAD";

        System.out.println("Introduce cuantas leras quieres añadir...");
        String cantidad = entrada.nextLine();

        String cantidades[] = cantidad.split(" ");
        String letras[] = palabra.split("");

        System.out.println(Arrays.toString(cantidades));
        System.out.println(Arrays.toString(letras));

        String resultado = "";

        for (int i = 0; i < letras.length; i++) {

            for (int j = 0; j < Integer.parseInt(cantidades[i]); j++) {

                resultado = resultado.concat(letras[i]);

            }
        }

        System.out.println(resultado);
    }

    public void ruleta () {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String colores[] = {"rojo", "negro"};
        Integer numeros[] = new Integer[37];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        String pares[] = {"par", "impar"};

        System.out.println("Introduce un número (0-36): ");

        int numero = teclado.nextInt();
        boolean numero_existe = Arrays.asList(numeros).contains(numero);
        String color = "";
        String par = "";

        if (!numero_existe){
            System.out.println("ERROR. El número no es válido.");
            return;
        } else {
            if (numero!=0){
                System.out.println("Color (rojo-negro): ");
                color = teclado.next().toLowerCase();

                boolean color_existe = Arrays.asList(colores).contains(color);

                if (!color_existe){
                    System.out.println("ERROR. El color no es válido");
                    return;
                } else {
                    System.out.println("Introduce la opción par o impar: ");
                    par = teclado.next().toLowerCase().trim();

                    boolean par_existe = Arrays.asList(pares).contains(par);

                    if (!par_existe){
                        System.out.println("ERROR. La opción par/impar no es válida.");
                        return;
                    }
                }
            }
        }
        int numero_sorteo = numeros[random.nextInt(37)];
        String color_sorteo = colores[random.nextInt(2)];
        String pares_sorteo = "";

        if (numero_sorteo % 2 == 0) {
            pares_sorteo = "par";
        } else {
            pares_sorteo = "impar";
        }

        System.out.println("Los resultados ganadores han sido: " + numero_sorteo + ", " + color_sorteo + " y " + pares_sorteo);

        if (numero!=0 && numero_sorteo == numero && color_sorteo.equals(color) && pares_sorteo.equals(par)) {
            System.out.println("¡Has ganado!");
        } else if (numero!=0 && color_sorteo.equals(color)){
            System.out.println("¡Has acertado únicamente el color!");
        } else if (numero!=0 && pares_sorteo.equals(par)) {
            System.out.println("¡Has acertado la opción par/impar!");
        } else if (numero == numero_sorteo && numero != 0) {
            System.out.println("¡Has acertado el número!");
        } else if (numero == 0 && numero_sorteo == 0) {
            System.out.println("¡Has ganado y los demás pierden!");
        } else {
            System.out.println("¡Has perdido!");
        }
    }
}

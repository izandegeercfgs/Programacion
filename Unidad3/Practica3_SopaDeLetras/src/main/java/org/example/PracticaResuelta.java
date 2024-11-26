package org.example;

import java.util.Scanner;

public class PracticaResuelta {
    public void main() {
        try {
            Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

            System.out.println("\n⦿ Practica 3 - Sopa de letras");

            // Solicitar filas
            System.out.print("\n> Número de filas: 8");
            int filas = 8;

            // Solicitar columnas
            System.out.print("\n> Número de columnas: 11");
            int columnas = 11;

            // Crear matriz para la sopa de letras
            char[][] matriz = new char[filas][columnas];

            System.out.println("\n\n⦿ Sopa de letras");
            System.out.println(" ");

            // Inicializar los valores por defecto
            matriz[0] = "abcDEFGhigg".toCharArray();
            matriz[1] = "hEbkWalDorf".toCharArray();
            matriz[2] = "FtaAwaldORm".toCharArray();
            matriz[3] = "FtmimrLqsrc".toCharArray();
            matriz[4] = "byBArBeTTYv".toCharArray();
            matriz[5] = "KlIbqwikomk".toCharArray();
            matriz[6] = "strEBGadhrb".toCharArray();
            matriz[7] = "yUiqlxcnBjk".toCharArray();

            // Imprime la matriz
            for (char[] fila : matriz) {
                for (char columna : fila) {
                    System.out.print(columna + " ");
                }
                System.out.println();
            }

            System.out.println("\n⦿ Búsqueda");

            System.out.print("> Introduce la palabra a buscar: ");
            String Busqueda = teclado.nextLine();

            boolean coincidencia = false;

            // Se comprueba en vertical y horizontal si hay coincidencias
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz[fila].length; columna++) {

                    boolean horizontal = true;

                    // Comprobación horizontal
                    if (columna + Busqueda.length() <= matriz[fila].length) { // Solo si cabe horizontalmente
                        for (int i = 0; i < Busqueda.length(); i++) {
                            if (!String.valueOf(matriz[fila][columna + i]).equalsIgnoreCase(String.valueOf(Busqueda.charAt(i)))) {
                                horizontal = false; // Señala que no hay coincidencia
                                break; // Termina la comprobación horizontal
                            }
                        }
                        if (horizontal) { // Si se encuentra una coincidencia horizontal
                            System.out.println("> La palabra " + Busqueda + " existe. Está en la posición (" + fila + "," + columna + ") en horizontal.");
                            coincidencia = true; // Señala que se ha encontrado la palabra
                            break; // Termina el programa
                        }
                    }


                    for (int i = 0; i < Busqueda.length(); i++) {
                        if (!String.valueOf(matriz[fila][columna + i]).equalsIgnoreCase(String.valueOf(Busqueda.charAt(i)))) {
                            horizontal = false; // Señala que no hay coincidencia
                            break; // Termina la comprobación horizontal
                        }
                    }
                    if (horizontal) { // En caso de que se encuentre la palabra horizontalmente, muestra la posición
                        System.out.println("> La palabra " + Busqueda + " existe. Está en la posición (" + fila + "," + columna + ") en horizontal.");
                        coincidencia = true; // Señala que se ha encontrado la palabra
                        break; // Termina el programa
                    }

                    boolean vertical = true;

                    // Comprobación vertical
                    if (fila + Busqueda.length() <= matriz.length) { // Solo si cabe verticalmente
                        for (int i = 0; i < Busqueda.length(); i++) {
                            if (!String.valueOf(matriz[fila + i][columna]).equalsIgnoreCase(String.valueOf(Busqueda.charAt(i)))) {
                                vertical = false; // Señala que no hay coincidencia
                                break; // Termina la comprobación vertical
                            }
                        }
                        if (vertical) {
                            System.out.println("> La palabra `" + Busqueda + "` existe. Está en la posición (" + fila + "," + columna + ") en vertical.");
                            coincidencia = true; // Señala que se ha encontrado la palabra
                            break; // Termina el programa
                        }
                    }

                    if (fila + Busqueda.length() > matriz.length) {
                        vertical = false;
                    }

                    for (int i = 0; i < Busqueda.length(); i++) {
                        if (!String.valueOf(matriz[fila + i][columna]).equalsIgnoreCase(String.valueOf(Busqueda.charAt(i)))) {
                            vertical = false; // Señala que no hay coincidencia
                            break; // Termina la comprobación vertical
                        }
                    }
                    if (vertical) {
                        System.out.println("> La palabra `" + Busqueda + "` existe. Está en la posición (" + fila + "," + columna + ") en vertical.");
                        coincidencia = true; // Señala que se ha encontrado la palabra
                        break; // Termina el programa
                    }
                }
                if (coincidencia) { // Si la palabra fue encontrada, para el programa
                    break; // Termina el programa
                }
            }

            if (!coincidencia) { // En caso de no haber coincidencia, da error
                System.out.println("> ERROR. La palabra no existe.");
            }
        } catch (Exception e) {
            System.out.println("> ERROR. Ha ocurrido una excepción: " + e.getMessage());
        }
    }
}

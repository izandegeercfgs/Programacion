package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in); // Crear el objeto Scanner una vez
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Introduce tu nombre: ");
        String nombre = entradaEscaner.nextLine(); // Leer el nombre

        System.out.println("Hola " + nombre + ". Introduce tu edad: "); // Saludar al usuario con su nombre y solicitar su edad
        int edad = entradaEscaner.nextInt(); // Leer la edad

        if (edad >= 18) {
            System.out.println("Enhorabuena " + nombre + ". Puedes votar."); // La persona puede votar
        } else {
            System.out.println("Lo siento " + nombre + ". No puedes votar."); // La persona no puede votar
            int legal = 18 - edad; // Calcular los años restantes para ser mayor de edad
            System.out.println("Aún te quedan " + legal + " años para ser mayor de edad."); // La persona no puede votar
        }


    }
}
package org.example;
import java.util.Scanner;

public class Main{

    public void main () {
        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);       //Este comando sirve para habilitar el teclado.


        String nombre = entrada.next();                 //Cada vez qu pongo "entrada" activa el teclado
        //para introducir variables del ipo declarado.

        System.out.println("¿A qué curso vas?");
        String curso = entrada.next();                  //El .next() sirve para indicar el tipo de variable introducida.

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;

        while (num1 == num2){

            System.out.println("Introduce un número:");
            num1 = entrada.nextInt();                   //En este caso .nextInt() se trata de un numero.

            System.out.println("Introduce otro número:");
            num2 = entrada.nextInt();

            if (num1 == num2){
                System.out.println("ERROR. Los numeros son iguales");
            }

        }
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }

    public void ejercicio1 (){
        System.out.println("Bienvenido! Introduzca un número porfavor: ");

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        if(num > 0){
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        }else
            System.out.println("El número es natural.");

    }

    public void ejercicio2 (){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número:");
        int num2 = entrada.nextInt();

        if (num1 == num2){
            System.out.println("ERROR. Los numeros son iguales");

        } else if (num1 < num2) {
            System.out.println( num2 + " es mayor que " + num1);
        }else
            System.out.println( num1 + " es mayor que " + num2);
    }

    public void ejercicio3 (){
        int resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num1 = entrada.nextInt();

        System.out.println("Introduce el divisor:");
        int num2 = entrada.nextInt();

        if (num2 == 0) {
            System.out.println("ERROR: No se puede dividir entre 0");

        }else {
            resultado = num1 / num2;                                    //SIEMPRE TIENE QUE ESTAR EL RESULTADO
            System.out.println(" El resultado es: " + resultado);       //DE LA OPERACIÓN DELANTE

        }
    }

    public void ejercicio4 (){

        Scanner entrada = new Scanner(System.in);
        int b = 0;
        int h = 0;

        while (b == 0) {

            System.out.println("Introduce el valor de la base:");
            b = entrada.nextInt();

        }

        while (h == 0) {

            System.out.println("Introduce el valor de la altura:");
            h = entrada.nextInt();

        }

        int A = (b*h)/2;
        System.out.println("El área del triangulo es: " + A);

    }}
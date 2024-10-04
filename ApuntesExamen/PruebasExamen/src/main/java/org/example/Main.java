import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Llamamos a la función que comprueba si el número es primo
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }

    // Método para comprobar si un número es primo
    public static boolean esPrimo(int num) {
        // Un número menor que 2 no es primo
        if (num < 2) {
            return false;
        }
        // Verificamos si el número tiene algún divisor distinto de 1 y de sí mismo
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Impar {
    public static void main(String[] args) {  // El método debe ser 'main'
        System.out.println("Números impares entre 1 y 99:");

        int i = 1;  // Inicializamos el contador en 1

        // Bucle while que recorre los números del 1 al 99
        while (i < 100) {
            // Si el número es impar, lo imprimimos
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;  // Incrementamos el contador
        }
    }
}

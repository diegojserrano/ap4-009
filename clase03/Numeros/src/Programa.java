// Cargar números hasta que se ingrese un 0.
// Calcular e imprimir:
//     * Cantidad de números ingresados
//     * Suma de todos los números
//     * Promedio de todos


import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x, cantidad = 0, suma = 0;

        System.out.println("Ingrese números, finaliza con 0");

        x = teclado.nextInt();

        while (cantidad < 10) {
            System.out.println("Ud. ingresó " + x);
            cantidad++; // Cuenta las vueltas del ciclo
            suma += x; // Suma todos los valores de x
            x = teclado.nextInt();
        }

        // promedio = suma / cantidad
        float promedio = (float)suma / cantidad;


        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Suma de todos: " + suma);
        System.out.println("Promedio de todos: " + promedio);
    }


}

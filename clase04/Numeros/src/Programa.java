    import java.util.Scanner;

    public class Programa {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de números: ");
            int cantidad = sc.nextInt();

            if (cantidad > 0) {
                // Declaración
                int[] numeros;

                // Creación
                numeros = new int[cantidad];

                // Carga
                System.out.println("Ingrese " + cantidad + " números");
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = sc.nextInt();
                }

                // Listado
                System.out.println("Listado de números cargados");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }

                // Listado con for mejorado
                System.out.println("Con for mejorado");
                for (int x:numeros) { // Por cada x perteneciente al arreglo
                    System.out.println(x);
                }

                // Suma del contenido
                int suma = 0;
                for (int i = 0; i < numeros.length; i++) {
                    suma += numeros[i];
                }

                // Con for mejorado
                suma = 0;
                for(int cadaUno: numeros) {
                    suma += cadaUno;
                }

                // Promedio
                float promedio = (float) suma / numeros.length;

                // Cantidad de mayores que el promedio
                int cantidadMayoresPromedio = 0;
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] > promedio) {
                        cantidadMayoresPromedio++;
                    }
                }
    
                System.out.println("La suma de los números es: " + suma);
                System.out.println("El promedio es: " + promedio);
                if (cantidadMayoresPromedio > 0) {
                    System.out.println("Hay " + cantidadMayoresPromedio + " mayores que el promedio");
                } else {
                    System.out.println("No hay ninguno mayor al promedio");
                }
                }
        }
    }

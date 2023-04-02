import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1, n2, n3, mayor;

        System.out.println("Ingrese tres números");

        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        // Alternativa 1: comparo de a dos, descartanlo que no son mayores
        if (n1 > n2) { // Seguro que n2 no es el mayor, lo descarto
            if (n1 > n3) {
                mayor = n1;
            } else {
                mayor = n3;
            }
        } else { // Seguro que n1 no es el mayor, lo descarto
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }

        // Alternativa 2: Usando &&
        // Suponer que el primero es el mayor
        if (n1 > n2 && n1 > n3) {  // El primero seguro que es el mayor
            mayor = n1;
        } else { // El primero seguro que no es, lo descarto
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }

        // Alternativa 3: buscar mayores parciales
        // Voy a buscar el mayor parcial entre los primeros
        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }
        if (n3 > mayor) { // El mayor es el tercero
            mayor = n3;
        }


        // Alternativa 4: con el operador ternario
        mayor = (n1 > n2)? n1: n2;
        mayor = (n3 > mayor)? n3: mayor;

        System.out.println("El mayor es " + mayor);


    }
}

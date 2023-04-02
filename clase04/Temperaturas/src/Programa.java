import java.nio.Buffer;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de días en los que tomó la temperatura: ");
        int cantidad = sc.nextInt();
        int temp, i;
        int cantidadBajoCero = 0;

        // Abreviatura: fori
        for(i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la temperatura del día " + i + ": ");
            temp = sc.nextInt();
            if (temp < 0) {
                cantidadBajoCero++;
            }
        }


        System.out.println("Hubo " + cantidadBajoCero + " días con temperatura bajo cero");
        System.out.println("Gracias");
    }

}

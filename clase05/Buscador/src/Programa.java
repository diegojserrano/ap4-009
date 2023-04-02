import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo: ");
        String nombre = teclado.nextLine();

        Path archivo = Paths.get(nombre);

        if (Files.exists(archivo)) {
            System.out.println("Ingrese el texto buscado");
            String buscado = teclado.nextLine();

            boolean encontre = false;
            int numeroLinea = 0;
            for(String linea: Files.readAllLines(archivo)) {
                numeroLinea++;
                if (linea.toLowerCase().contains(buscado.toLowerCase())) {
                    System.out.println("Linea: " + numeroLinea + ": " + linea);
                    encontre = true;
                }
            }

            if (encontre == false) {
                System.out.println("No se encontro");
            }

        } else {
            System.out.println("El archivo no existe");
        }

    }
}

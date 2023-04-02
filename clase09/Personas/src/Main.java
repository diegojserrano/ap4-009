import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("personas2.txt");
        Scanner lector = new Scanner(archivo);
        Scanner teclado = new Scanner(System.in);

        lector.useDelimiter("[,;\\n]");

        Padron socios = new Padron();

        while (lector.hasNextInt()) {
            int doc = lector.nextInt();
            String nom = lector.next();
            String ape = lector.next();
            int edad = lector.nextInt();

            Persona nueva = new Persona(doc, nom, ape, edad);
            socios.agregarPersona(nueva);
        }

        System.out.println("Se cargaron " + socios.cantidadPersonas() + " personas");

        System.out.println("El promedio de sus edades es: " + socios.promedioEdad());

        System.out.println("Ingrese el documento de la persona:");
        int documentoBuscado = teclado.nextInt();

        Persona encontrada = socios.buscarPersona(documentoBuscado);
        if (encontrada == null)
            System.out.println("No se encuentra");
        else
            System.out.println(encontrada);

        System.out.println("Ingrese el nombre que quiere buscar:");
        String nombreBuscado = teclado.next();

        ArrayList<Persona> encontradas = socios.buscarPorNombre(nombreBuscado);

        System.out.println("Personas con nombre " + nombreBuscado);
        if (encontradas.isEmpty())
            System.out.println("No se encontraron");
        else {
            for (Persona p : encontradas)
                System.out.println(p);
        }

    }
}
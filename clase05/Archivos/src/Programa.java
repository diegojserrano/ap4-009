import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Programa {

    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("saludo.txt");

        long tamaño = Files.size(archivo);

        System.out.println(tamaño);

        Path carpeta = Paths.get("/home/diego/Downloads");

        for(Path cadaCosa: Files.list(carpeta).toList()) {
            if (Files.isDirectory(cadaCosa)) {
                System.out.println("Carpeta: " + cadaCosa);
            } else {
                System.out.println("Archivo: " + cadaCosa);
            }
        }


       for (String linea: Files.readAllLines(archivo)) {
           System.out.println(linea);
       }

    }
}

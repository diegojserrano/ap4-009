import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("numeros.txt");

        Scanner lector = new Scanner(archivo);

        while(lector.hasNextInt()) {
            int x = lector.nextInt();
            System.out.println(x);
        }

        lector.close();
    }
}

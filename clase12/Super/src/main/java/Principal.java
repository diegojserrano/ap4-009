import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("ticket.csv");
        Scanner lector = new Scanner(archivo);

        lector.useDelimiter("[;\\n\\r]+");
        Ticket t = new Ticket();

        while(lector.hasNextLong()) { // Una vuelta por cada linea del archivo
            long cod = lector.nextLong();
            String nom = lector.next();
            double cant = lector.nextDouble();
            double pu = lector.nextDouble();

            Item nuevo = new Item(cod, nom, cant, pu);
            t.agregarItem(nuevo);
        }

        System.out.println(t);
        System.out.println("Productos de mas de $1000: " + t.listadoCaros());
        lector.close();


    }
}

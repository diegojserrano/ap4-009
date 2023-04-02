import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> apellidos = new ArrayList<>();

        System.out.println("Cantidad de apellidos: " + apellidos.size());

        apellidos.add("Perez");
        apellidos.add("Pino");
        apellidos.add("Soto");
        apellidos.addAll(List.of("Gomez", "Carranza", "Serra"));

        System.out.println("Cantidad de apellidos: " + apellidos.size());

        System.out.println("Listado con for común");
        for (int i = 0; i < apellidos.size(); i++) {
            System.out.println(apellidos.get(i));
        }

        System.out.println("Listado con for mejorado");
        for (String ap: apellidos) {
            System.out.println(ap.toUpperCase());
        }

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(23);
        numeros.add(123);
        numeros.add(67);
        numeros.add(18);

        int suma = 0;
        for (Integer x: numeros) {
            suma += x;
        }

        System.out.println("La suma es: " + suma);

    }
}
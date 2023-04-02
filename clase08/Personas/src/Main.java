import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Persona a = new Persona(123,"Juan", "Perez", 23);
        Persona b = new Persona(221, "María", "Ramirez", 20);
        Persona c = new Persona(92, "Octavio", "Ochoa", 36);

        HashMap<Integer, Persona> plantel = new HashMap<>();

        plantel.put(a.getDocumento(), a);
        plantel.put(b.getDocumento(), b);
        plantel.put(c.getDocumento(), c);

        System.out.println("La persona 123 es: " + plantel.get(123));
        System.out.println("La persona 99 es: " + plantel.get(99));
        System.out.println("La persona 221 es: " + plantel.get(221));

        System.out.println("Listado de todas las personas");
        for(Persona p: plantel.values()) {
            System.out.println(p);
        }

        // Calcular promedio de edades
        int suma = 0;
        for(Persona p: plantel.values()) {
            suma += p.getEdad();
        }
        float promedio = (float)suma / plantel.size();

    }
}
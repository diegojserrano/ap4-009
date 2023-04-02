import java.util.ArrayList;
import java.util.HashMap;

public class Padron {

    public HashMap<Integer, Persona> personas;

    public Padron() {
        personas = new HashMap<>();
    }

    public void agregarPersona(Persona nueva) {
        personas.put(nueva.getDocumento(), nueva);
    }

    public int cantidadPersonas() {
        return personas.size();
    }

    public float promedioEdad() {
        int sumaEdades = 0;

        for(Persona p: personas.values()) {
            sumaEdades += p.getEdad();
        }

        return (float)sumaEdades / cantidadPersonas();
    }

    public Persona buscarPersona(int documento) {
        return personas.get(documento);
    }

    public ArrayList<Persona> buscarPorNombre(String nombre) {
        ArrayList<Persona> lista = new ArrayList<>();

        for (Persona p: personas.values()) {
            if (p.getNombre().equals(nombre)) {
                lista.add(p);
            }
        }

        return lista;
    }

}

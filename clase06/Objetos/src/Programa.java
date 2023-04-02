public class Programa  {
    public static void main(String[] args) {

         Persona a, b; // a y b son variables de tipo
        // REFERENCIA A PERSONA

        a = new Persona(111,"Juan", "Perez");

        b = new Persona(112, "Juana", "Chavez");

        System.out.println(a.getDocumento()+a.getNombre() +a.getApellido());
        System.out.println(b.getDocumento()+b.getNombre() +b.getApellido());

    }
}

import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        Persona a = new Persona(111,"Juan", "Perez" , 1990);
        Persona b = new Persona(222,"Ana", "Vega",1993);

        a.setEmail("nadie@hotmail.com");

        System.out.println(a);
        System.out.println(b);
    }
}

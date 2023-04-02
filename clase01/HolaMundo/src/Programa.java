// Un conjunto de líneas delimitadas por llaves se denomina "bloque"
// Cada archivo contiene un bloque class que envuelve el contenido


public class Programa {

    // Los lenguajes de programación tienen un punto de entrada
    // El punto de entrada marca el inicio del programa

    // En Java el punto de entrada se llama "main"
    // IntelliJ ofrece unas "abreviaturas"
    // Para escribir el main: main<Tab>

    public static void main(String[] args) {
        // Para imprimir en la pantalla: System.out.println("texto");
        // Abreviatura: sout<Tab>

        System.out.println("Hola Mundo!!!!");
        System.out.println("Estoy en Argentina Programa 4.0 :)");

        // Hacer un programa que sume dos números
        // Para declarar una variable: tipo nombre = valor;

        int numero1 = 34;
        int numero2 = 84;

        int suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);

        // Tarea: ampliar este programa para que calcule y muestre la resta,
        // la multiplicación y la división entre los mismos números
    }


}
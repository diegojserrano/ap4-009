public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola!!! Estoy en la clase 10");

        Calculadora c = new Calculadora();
        double r = c.sumar(3,76);
        Punto p = new Punto(4,.3);
        System.out.println(p);
    }
}

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float x, y;

        System.out.println("Ingrese las coordenadas del punto");
        x = teclado.nextFloat();
        y = teclado.nextFloat();

        if (x != 0 && y != 0) {
            int cuadrante;
            if (x > 0) { // Está en el cuadrante I o IV
                if (y > 0) {
                    cuadrante = 1;
                } else {
                    cuadrante = 4;
                }
            } else { // Está en el cuadrante II o III
                if (y > 0) {
                    cuadrante = 2;
                } else {
                    cuadrante = 3;
                }
            }
            System.out.println("El punto está en el cuadrante " + cuadrante);
        } else if (x == 0 && y == 0) {
            System.out.println("El punto es el origen");
        } else if (x == 0) {
            System.out.println("El punto está en el eje de las ordenadas");
        } else {
            System.out.println("El punto está en el eje de las abcisas");
        }
    }
}

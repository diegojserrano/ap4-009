import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        if (numero1 != numero2) {
            //if (numero1 > numero2) {
            //    mayor = numero1;
            //} else {
            //   mayor = numero2;
            //}

            int mayor = (numero1 > numero2) ? numero1: numero2;

            System.out.println("El mayor es " + mayor);
        } else {
            System.out.println("Son iguales");
        }
    }
}

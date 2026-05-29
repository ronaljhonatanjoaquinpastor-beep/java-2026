package selectivas;

import java.util.Scanner;

public class ejersicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el costo del producto: $");
        double costo = teclado.nextDouble();
        if (costo >= 200) {
            System.out.println("El método de pago es: Efectivo");
        } else {
            System.out.println("El método de pago es: Tarjeta");
        }
        teclado.close();
    }
}

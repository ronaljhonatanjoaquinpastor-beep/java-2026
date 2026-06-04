package selectivas;

import java.util.Scanner;

public class anidadas_02 {
    static void main() {
        Scanner entraDatos = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double compra = entraDatos.nextDouble();

        System.out.print("Tiene membresía: ");
        String membresia = entraDatos.nextLine().toLowerCase();

        if (compra >= 500) {
            System.out.println("has aprobado");
            if (membresia.equalsIgnoreCase("si")) {
               double descuento = compra * 1.20;
               descuento = compra-descuento;
                System.out.printf("tu descuento es del 20%");
            } else {
                double descuento =compra *1.10;
                descuento = compra-descuento;
            }
        } else {

        }

        entraDatos.close();
    }
}




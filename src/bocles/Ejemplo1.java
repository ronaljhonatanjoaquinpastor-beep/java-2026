package bocles;

import java.util.Scanner;

public class Ejemplo1 {
    static void main() {
        Scanner entradaDatos = new Scanner(System.in);
        String nombreusuario = "";
        String clave ="";
        while (!nombreusuario.equals("mañu") ||  !clave.equals("12345")){
            nombreusuario= entradaDatos.nextLine();
            System.out.println("ingrese clave");
            clave = entradaDatos.nextLine();
            if (!nombreusuario.equals("mañu") || !clave.equals("12345")){
                System.out.println("datos incorectos, no puede ingresar ");

            }

        }
        System.out.println("bienvenido al sistema");
        entradaDatos.close();
    }

}

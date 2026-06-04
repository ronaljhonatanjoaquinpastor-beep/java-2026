package selectivas;

import java.util.Scanner;

public class anidadas1 {
    static void main() {
        Scanner entraDatos = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String usuarioIngresado = entraDatos.nextLine();

        String usuarioCorrecto = "juan";

        System.out.print("Ingrese su contraseña: ");
        String claveIngresada = entraDatos.nextLine();

        String claveCorrecto = "matacunas3mil";
        if (usuarioIngresado.equals(usuarioCorrecto)){
            System.out.println(" Bienvenido al sistema.");
            if (claveIngresada.equals(claveCorrecto)) {

            }else {
                System.out.println(" Contraseña incorrecta.");
            }
            }else{
            System.out.println(" El usuario no existe.");
        }

        entraDatos.close();
        }


    }


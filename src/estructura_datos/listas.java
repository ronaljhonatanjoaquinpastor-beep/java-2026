package estructura_datos;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class listas {
    static void main() {
       // lista de ARREGLO - MUTABLES O QUE PUEDAN MANIPULARSE AL MOMENTO HACER EL USO

        /*
        SINTAXIX DE UNA LISTA
        List<tipoDatos> nombrelista = new ArrayList<>();

         */
        List<String> FRUTAS = new ArrayList<>();
        FRUTAS.add("piña");
        FRUTAS.add("MANGO");
        FRUTAS.add("MANZANA");
        FRUTAS.add("FRESA");
        FRUTAS.add("PAPAYA");

        System.out.println(FRUTAS);
        for (int iterador = 0; iterador < FRUTAS.size(); iterador++) {
            System.out.println( FRUTAS.get(iterador));
        }

    }
}

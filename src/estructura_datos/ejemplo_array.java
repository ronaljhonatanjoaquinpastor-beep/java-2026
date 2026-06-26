package estructura_datos;

import java.util.Arrays;

public class ejemplo_array {
    static void main() {
        String[] ciudades= {"toma,carhuaz,huaraz,tincoç"};
        System.out.println(Arrays.toString(ciudades));

        for (int iterador = 0; iterador < ciudades.length; iterador++) {
            System.out.println( ciudades[iterador]);
        }
    }
}

package estructura_datos;

import java.util.Arrays;

public class arreglos {
    static void main() {
        // creamdo mi arreglo de numeros
        /*
        int[]nobre de arrglos  = new int[cantidad de elementos];
         */
        int[]numeros = new  int[6];
        numeros[0] = 10;
        numeros[1] =  8;
        numeros[2] = 15;
        numeros[3] = 15;
        numeros[4] = 8;
        numeros[5] = 1;
        System.out.println(Arrays.toString(numeros));

        //arreglo com inicializacion

        int[] notas= {10,17,12,18,12,14,15,12};
        System.out.println(Arrays.toString(notas));

        // arreglo de ciudades

        String[] CUIDADES= {"toma,carhuaz,huaraz,tincoç"};
        System.out.println(Arrays.toString(CUIDADES));


    }
}

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

        int[] notas= {10,18,13,15,20,16,18,14};
        System.out.println(Arrays.toString(notas));

        // arreglo de ciudades

        String[] CUIDADES= {"toma,carhuaz,huaraz,tincoç"};
        System.out.println(Arrays.toString(CUIDADES));


        for (int iterador = 0; iterador <= notas.length; iterador ++){
            System.out.println(notas[iterador]);

        }


    }
}

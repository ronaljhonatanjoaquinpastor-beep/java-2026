package bocles;

public class Mientras {
    static void main() {
       /*
        while (condicion){ // entonses
            // bloque de codigo o instrucciones a ejrcutar si es verdadero

        */
        System.out.println("numeros pares");

        int contador = 2;
        while (contador <= 10){
            System.out.println(contador);
            contador = contador + 2; // forma extensa
            contador += 2; // forma corta, usando operador de asicnacion

        }
    }

}

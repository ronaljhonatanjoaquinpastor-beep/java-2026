package selectivas;

import java.util.Scanner;

public class Anidadas {
    static void main() {
        Scanner entraDatos = new Scanner(System.in);
        System.out.println("ingrese una calificasion");
                int calificasion =entraDatos.nextInt();
         if (calificasion >= 13){
             System.out.println("has aprobado");
             if (calificasion >=15){
                 System.out.println("optubiste una buena calificasion");
             }
         }else{
             System.out.println("has reprobadoel curso sique estudiando");
         }

    }
}

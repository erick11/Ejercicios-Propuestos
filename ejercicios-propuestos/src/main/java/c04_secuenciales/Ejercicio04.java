package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio04 {

    /**
     * 04)
     * Dada una cantidad expresada en pies, y otra en metros. Determinar la
     * suma pero convertida a pulgadas, a yardas, a metros y a millas. Considere
     * las siguientes equivalencias:
     * 1 milla = 1609 metros
     * 1 pulgada = 0.0254 metros
     * 1 yarda = 3 pies
     * 1 pie = 12 pulgadas
     */

    public static void main(String[] args) {

        // Declaracion de variable
        Scanner sc = new Scanner(System.in);
        double can_Pie, can_Met;
        double tot_Pul, tot_Yar, tot_Met, tot_Mil;

        // Lectura de datos
        System.out.println("Ingrese su cantidad de Pies: ");
        can_Pie = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese su cantidad de Metros: ");
        can_Met = Double.parseDouble(sc.next());

        // Calculo
        tot_Met = (can_Pie / 12 / 0.254) + can_Met;
        tot_Pul = tot_Met * 0.0254;
        tot_Mil = tot_Met * 1609;
        tot_Yar = tot_Pul * 12 * 3;

        // Salida de resultados
        System.out.println("Suma en pulgadas: " + tot_Pul);
        System.out.println("Suma en yardas: " + tot_Yar);
        System.out.println("Suma en metros: " + tot_Met);
        System.out.println("Suma en millas: " + tot_Mil);
    }

}

package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio05 {

    /**
     * 05) Dada una cantidad expresada en euros, y otra en soles. Determinar la
     * suma pero convertida a dólares, a marcos, a soles y a yenes. Considere
     * las siguientes equivalencias: 1dólar = 0.76 euros 1dólar = 1.45 marcos
     * 1dólar = 3.35 soles 1dólar = 0.075 yenes
     */
    public static void main(String[] args) {

        // Declaracion de Variable
        Scanner sc = new Scanner(System.in);
        double can_sol, can_eur;
        double mon_dol, mon_mar, mon_sol, mon_yen;

        // Lectura de datos
        System.out.println("Ingrese la cantidad de euros: ");
        can_eur = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la cantidad de dolares: ");
        can_sol = Double.parseDouble(sc.nextLine());

        // Proceso de calculo
        mon_sol = (can_eur / 0.76 * 3.35) + can_sol;
        mon_dol = (mon_sol / 3.35);
        mon_yen = (mon_dol / 0.075);
        mon_mar = (mon_dol / 1.45);

        // Salida de Resultados
        System.out.println("Cantidad en dolares: " + mon_dol);
        System.out.println("Cantidad en marcos: " + mon_mar);
        System.out.println("Cantidad en soles: " + mon_sol);
        System.out.println("Cantidad en soles: " + mon_yen);
    }
}

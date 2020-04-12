package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio06 {

    /**
     * 06) Una clínica ha recibido una donación en dólares que debe ser
     * repartida entre sus servicios de atención, de la siguiente manera:
     * Medicina general,50% de la donación
     * Ginecología, 30% de la donación
     * Pediatría, 30% del monto recibido por Medicina general
     * Traumatología, lo que resta de la donación //...........................................
     */

    public static void main(String[] args) {

        //Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        double don_cli;
        double mon_meG, mon_gin, mon_ped, mon_tra;
        //Lectura de datos
        System.out.println("Ingrese su Donacion por favor: ");
        don_cli = Double.parseDouble(sc.nextLine());

        //Proceso de calculo
        mon_meG = don_cli * 0.5;
        mon_gin = don_cli * 0.30;
        mon_ped = don_cli * 0.5 * 0.30;
        mon_tra = don_cli - (mon_meG + mon_gin + mon_ped);

        //Salida de Resultados
        System.out.println("Monto de Medicina General: " + mon_meG);
        System.out.println("Monto de Ginecologia: " + mon_gin);
        System.out.println("Monto de Pediatría: " + mon_ped);
        System.out.println("Monto de Traumatología: " + mon_tra);
    }
}

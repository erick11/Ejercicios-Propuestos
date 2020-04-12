package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio07 {

    /**
     * 07)
     * Dado dos números enteros de 3 cifras, se desea saber la suma de sus
     * cifras correspondientes a las unidades, la suma de sus cifras
     * correspondientes a las decenas y la suma de sus cifras correspondientes a
     * las centenas.
     */

    public static void main(String[] args) {

        // Declaracion de variable
        Scanner sc = new Scanner(System.in);
        int pri_num, seg_num;
        int sum_uni, sum_dec, sum_cen;

        // Lectura de datos
        System.out.println("Ingrese su primer numero");
        pri_num = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese su segundo numero");
        seg_num = Integer.parseInt(sc.nextLine());

        // Proceso de calculo
        sum_cen = pri_num / 100 + seg_num / 100;
        sum_dec = pri_num % 100 / 10 + seg_num % 100 / 10;
        sum_uni = pri_num % 100 % 10 + seg_num % 100 % 10;

        // Salida de resultados
        System.out.println("Suma de unidades: " + sum_uni);
        System.out.println("Suma de decena: " + sum_dec);
        System.out.println("Suma de centenas: " + sum_cen);
    }
}

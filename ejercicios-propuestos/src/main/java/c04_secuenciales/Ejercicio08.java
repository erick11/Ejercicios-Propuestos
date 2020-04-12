package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio08 {

    /*
     * 08) Dos atletas recorren la misma distancia y se registra sus tiempos en
     * minutos y segundos. Se desea saber el tiempo total utilizado por ambos
     * atletas en horas, minutos, segundos.
     */

    public static void main(String[] args) {

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        String tie_at1, tie_at2;
        int tie_m1, tie_s1;
        int tie_m2, tie_s2;
        double tie_HT1, tie_MT1, tie_ST1;
        double tie_HT2, tie_MT2, tie_ST2;

        // Lectura de datos
        System.out.println("Ingrese tiempo del primer atleta (MM:SS)");
        tie_at1 = sc.nextLine();
        System.out.println("Ingrese tiempo del segundo atleta (MM:SS)");
        tie_at2 = sc.nextLine();

        // Proceso de calculo
        tie_m1 = Integer.parseInt(tie_at1.substring(0, 2));
        tie_s1 = Integer.parseInt(tie_at1.substring(3, 5));

        tie_m2 = Integer.parseInt(tie_at2.substring(0, 2));
        tie_s2 = Integer.parseInt(tie_at2.substring(3, 5));

        tie_ST1 = (tie_m1 * 60) + tie_s1;
        tie_ST2 = (tie_m2 * 60) + tie_s2;

        tie_MT1 = tie_ST1 / 60;
        tie_MT2 = tie_ST2 / 60;

        tie_HT1 = tie_MT1 / 60;
        tie_HT2 = tie_MT2 / 60;

        // Salida de resultados
        System.out.println("tiempo total en segundos para el primer atleta: " + tie_ST1 + "s");
        System.out.println("tiempo total en minutos para el primer atleta: " + tie_MT1 + "m");
        System.out.println("tiempo total en horas para el primer atleta: " + tie_HT1 + "h");
        System.out.println("tiempo total en segundos para el segundo atleta: " + tie_ST2 + "s");
        System.out.println("tiempo total en minutos para el segundo atleta: " + tie_MT2 + "m");
        System.out.println("tiempo total en horas para el segundo atleta: " + tie_HT2 + "h");

    }

}

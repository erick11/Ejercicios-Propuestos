package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio10 {

    /*
     10)
    Un padre cuenta con dos cantidades de dinero, una en euros y otra en
    soles. El padre ha decidido repartir todo su dinero entre sus tres hijos:
    Juan, Pablo y Miguel. Diseñe un algoritmo que haga lo siguiente:
    Determine la cantidad total de dinero con la que cuenta el padre en
    dólares y en yenes. Considere los siguientes tipos de cambio:
    1 dólar = 0.7971 euros
    1 dólar = 108.240 yenes
    1 dólar = 3.256 soles.
    Determine que cantidad de dinero le corresponde a cada hijo en dólares,
    considerando que: Juan recibe el 30% del total, Pablo recibe el 45% del
    total y Miguel recibe el resto.
    //...........................................
     */
    public static void main(String[] args) {

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        double mon_eur, mon_sol;
        double tot_yen, tot_dol;
        double par_jua[] = new double[2],
                par_pab[] = new double[2],
                par_mig[] = new double[2];

        //Lectura de datos
        System.out.println("Ingrese su monto en euros");
        mon_eur = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese su monto en nuevos soles");
        mon_sol = Double.parseDouble(sc.nextLine());

        //Proceso de Calculo
        tot_dol = (mon_eur / 0.7971) + (mon_sol / 0.7971);
        tot_yen = tot_dol / 108.240;

        par_jua[0] = tot_dol * 0.3;
        par_jua[1] = tot_yen * 0.3;

        par_pab[0] = tot_dol * 0.45;
        par_pab[1] = tot_yen * 0.45;

        par_mig[0] = tot_dol * 0.25;
        par_mig[1] = tot_yen * 0.25;

        //Salida de Resultados
        System.out.println("Total en dolares: " + tot_dol);
        System.out.println("Total en yenes: " + tot_yen);

        System.out.println("Parte de Juan en dolares: " + par_jua[0]);
        System.out.println("Parte de Juan en yenes: " + par_jua[1]);

        System.out.println("Parte de Pablo en dolares: " + par_pab[0]);
        System.out.println("Parte de Pablo en yenes: " + par_pab[1]);

        System.out.println("Parte de Miguel en dolares: " + par_mig[0]);
        System.out.println("Parte de Miguel en yenes: " + par_mig[1]);
    }
}

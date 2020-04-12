package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio02 {
    /**
     La nota final de un curso de programación se obtiene de acuerdo a las
     siguientes formulas:

     PPA = 0.20*PA1 + 0.20*PA2 + 0.25*PA3 + 0.35*PA4
     PPB = 0.20*PB1 + 0.20*PB2 + 0.25*PB3 + 0.35*PB4
     PF  = 0.30*PPA + 0.35*PB + 0.35*PY

     Donde PA1 es la practica de aula nro. 1, PB1 es la practica de
     laboratorio nro. 1, PY es la nota del proyecto final, PF es el promedio
     final.
     Sabiendo todas las notas PA y todas las notas PB, se desea saber cuánto
     debe sacar en el PY un alumno par que tenga un PF aprobatorio. Se sabe
     que un PF aprobatorio mínimo es 10.5


     PY = [10.5 - (0.30*PPA + 0.35*PB )]/0.35
     */
    public static void main(String[] args) {
        System.out.println("###############Bienvenido###############");
        // Declaracion de Varibles
        Scanner sc = new Scanner(System.in);
        double arPA[] = new double[4];
        double arPB[] = new double[4];
        double pA, pB;
        double PF;
        double needScore;

        // Lectura de datos
        System.out.println("Ingrese las notas (Teoria)");
        for (int i = 0; i < arPA.length; i++) {
            int cont = i + 1;
            System.out.println("Nota " + cont + ":");
            arPA[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println("Ingrese las notas (Laboratorio)");
        for (int i = 0; i < arPB.length; i++) {
            int cont = i + 1;
            System.out.println("Nota " + cont + ":");
            arPB[i] = Double.parseDouble(sc.nextLine());
        }

        // Proceso de calculo
        pA = 0.20 * arPA[0] + 0.20 * arPA[1] + 0.25 * arPA[2] + 0.35 * arPA[3];
        pB = 0.20 * arPB[0] + 0.20 * arPB[1] + 0.25 * arPB[3] + 0.35 * arPB[3];
        PF = 0.30 * pA + 0.35 * pB + 0.35 * 0;

        if (PF < 10.5) {
            needScore = 0.30 * pA + 0.35 * pB;
            needScore = 10.5 - needScore;
            needScore = needScore / 0.35;
        } else {
            needScore = 0.0;
        }

        // Salida de resuldos
        System.out.println("Su promedio final es: " + PF);
        System.out.println("Usted necesita: " + needScore);
    }


}

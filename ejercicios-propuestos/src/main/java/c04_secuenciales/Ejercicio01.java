package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio01 {
    /**
     * Convertir grados centígrados a grados farenheit considerando la siguiente
     * formula:
     * F = 1.8 * C + 32 //...........................................
     */
    public static void main(String[] args) {

        System.out.println("Ingresa los grados Centigados: ");

        // Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        double gC;
        double gF;

        // Lectura de datos
        gC = Integer.parseInt(sc.nextLine());

        // Calculo
        gF = 1.8 * gC + 32;

        // Salida de resultados(Imprimir en Consola)
        System.out.println("En grados farenheit: " + "\n" + gF);
    }


}

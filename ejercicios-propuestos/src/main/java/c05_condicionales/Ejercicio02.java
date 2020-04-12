package c05_condicionales;

import java.util.Scanner;

public class Ejercicio02 {

    /*02)
     *Determinar el menor valor de 5 números, indicando además a qué orden
     * pertenece. Considere que el menor valor puede repetirse. Por Ejm. Si los
     * números ingresados fueran: 14, 19, 14, 16, 15. Los resultados deben ser:
     * El menor valor ingresado fue 14 y corresponden al primer número, tercer número.
     */

    public static void main(String[] args) {

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int[] arNumeros = new int[5];
        int indice = 0;
        int menor;

        // Lectura de datos
        for (int i = 0; i < arNumeros.length; i++) {
            indice++;
            System.out.println("Ingrese # " + indice);
            arNumeros[i] = Integer.parseInt(sc.nextLine());
        }

        // Proceso de calculo
        menor = arNumeros[0];
        for (int i = 0; i < arNumeros.length; i++) {
            if (menor > arNumeros[i])
                menor = arNumeros[i];
        }


        // Salida de resultados
        System.out.println("Numero menor: " + menor);
    }

}

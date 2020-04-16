package c05_condicionales;

import java.util.Scanner;

public class Exercise03 {

    /*
    03)
    Determinar el segundo mayor de 4 números
    */

    public static void main(String[] args) {

        //Declaration of variables
        Scanner sc = new Scanner(System.in);
        int[] arNumeros = new int[4];
        int indices = 0;
        int mayor;
        int segundoMayor;

        //Get information
        for (int i = 0; i < arNumeros.length; i++) {
            indices++;
            System.out.println("Ingrese su numero por favor - " + indices);
            arNumeros[i] = Integer.parseInt(sc.next());
        }

        //calculation process
        segundoMayor =  arNumeros[0];
        for (int i = 0; i < arNumeros.length; i++) {
            mayor = arNumeros[0];
            for (int j = 0; j < arNumeros.length; j++) {
                if (mayor < arNumeros[j]) {
                    mayor = arNumeros[j];
                }
            }

            if (arNumeros[i] < mayor ) {
                if (segundoMayor < arNumeros[i]) {
                    segundoMayor = arNumeros[i];
                }
            }
        }

        //results output
        System.out.println("Segundo Mayor: " + segundoMayor);
    }
}

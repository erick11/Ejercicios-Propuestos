package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio03 {

    /**
     03) Aplicando el teorema de Pitágoras determinar el valor de la hipotenusa
     de un triangulo rectángulo, el perímetro y el área de dicho triangulo
     conociendo solamente el valor de los catetos.
     */
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        double c1, c2;
        double h;

        // Lectura de Datos
        System.out.println("Ingrese el primer cateto");
        c1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el segudo cateto");
        c2 = Double.parseDouble(sc.nextLine());

        // Calculo
        h= Math.sqrt( Math.pow(c1, 2) + Math.pow(c2, 2)) ;

        // Salida de Resultados
        System.out.println("Resultado de la Hipotenusa: " + h);

    }
}

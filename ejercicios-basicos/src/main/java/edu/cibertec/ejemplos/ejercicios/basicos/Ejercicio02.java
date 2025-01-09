package edu.cibertec.ejemplos.ejercicios.basicos;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        // INICIO
        // 1. Declaración de variables
        double cent, farenheit, kelvin, rankine;
        // 2. Lectura de datos
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un valor en grados centigrados");
        cent = lector.nextDouble();
        lector.close();
        // 3. Proceso de cálculo
        farenheit = ((9 * cent) / 5) + 32;
        rankine = cent + 460;
        kelvin = rankine - 187;
        // 4. Salida de resultados
        System.out.println("Grados Farenheit: " + farenheit);
        System.out.println("Grados Kelvin: " + kelvin);
        System.out.println("Grados Rankine: " + rankine);
        // FIN
    }
    
    
}

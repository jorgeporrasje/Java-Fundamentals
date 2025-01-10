package edu.cibertec.ejemplos.ejercicios.basicos;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ejercicio22 {
    
    public static void main(String[] args) {
        // Dado un número natural de tres cifras, diseñe un algoritmo que permita obtener el revés
        // del número. Así, si se ingresa el número 238 el revés del número es 832.
        
        //INICIO
        // 1. Declarar las variables
        int numero, c, d, u, numInvertido;
        // 2. Entrada de datos
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el número de tres cifras");
        numero = lector.nextInt();
        lector.close();
        // 3. Proceso de cálculo
        c = numero / 100; // 3
        d = numero % 100 / 10; // 21 -> 2
        u = numero % 100 % 10; // 21 -> 1
        numInvertido = (u * 100) + (d*10) + c;
        // 4. Salida de resultados
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("u: " + u);
        System.out.println("El número invertido es: " + numInvertido);
        
        //FIN
    }
    
}

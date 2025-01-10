package edu.cibertec.ejemplos.ejercicios.basicos;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */

/*
Dada una cantidad entera de segundos, exprese la salida en el formato:
HH: MM: SS. Ejemplo: Ingresan 14600 y debe imprimir
4 horas, 3 minutos y 20 segundos
*/
public class Ejercicio29 {
    
    public static void main(String[] args) {
        //INICIO
        // 1. Declaración
        int totalSegundos, hh, mm, ss;
        // 2. Lectura
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese los segundos: ");
        totalSegundos = lector.nextInt();
        lector.close();
        // 3. Cálculo
        hh = totalSegundos / 3600; // 4
        mm = totalSegundos % 3600 / 60; //
        ss = totalSegundos % 3600 % 60; //
        // 4. Imprimir
        System.out.println("Horas: " + hh);
        System.out.println("Minutos: " + mm);
        System.out.println("Segundos: " + ss);
        //FIN
        
    }
    
}

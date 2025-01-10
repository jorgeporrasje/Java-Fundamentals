package edu.cibertec.ejemplos.condicionales;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ejemplo01 {
    
    public static void main(String[] args) {
        //Creamos un programa que lea e imprima una edad
        // Indicar si es mayor de edad (18)
        // Declarar
        int edad;
        // Lectura
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        edad = lector.nextInt();
        lector.close();
        // Proceso
        String mayorEdad = "Es mayor de edad";
        String menorEdad = "No, es menor de edad";
        if (edad >= 18){
            System.out.println(mayorEdad);
        } 
        // Salida
        System.out.println("La edad es: " + edad);
    }
}

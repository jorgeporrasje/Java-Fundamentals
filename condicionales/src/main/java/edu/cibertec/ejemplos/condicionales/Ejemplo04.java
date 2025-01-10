package edu.cibertec.ejemplos.condicionales;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ejemplo04 {
    
    public static void main(String[] args) {
        // Ingresar un número del 1 al 7 e indicar qué dia de la semana es
        // Declarar
        int numero;
        // Leer
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7: ");
        numero = lector.nextInt();
        lector.close();
        // Proceso y salida
        switch(numero){
            case 1: System.out.println("Lunes");  break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("El número ingresado no es válido");
        }
    }
}

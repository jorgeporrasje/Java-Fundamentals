package edu.cibertec.ejemplos.ejercicios.basicos;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ejercicio05 {
    
    public static void main(String[] args) {
        // Dada una cantidad de dinero en soles, diseñe un algoritmo que exprese dicha cantidad
        // en euros, en marcos y en dólares. Considere los siguientes tipos de cambio.
        // 1 dólar = 3.51 soles
        // 1 dólar = 1.09 euros
        // 1 dólar = 2.12 marcos
        
        // INICIO
        // 1. Declaración de variables
        double soles, dolares, euros, marcos;
        // 2. Entrada de datos
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un monto en soles");
        soles = lector.nextDouble();
        lector.close();
        // 3. Proceso de cálculo
        dolares = convertirSolesAdolares(soles);
        euros = convertirDolaresAeuros(dolares);
        marcos = convertirDolaresAmarcos(dolares);
        // 4. Salida de resultados
        System.out.println("El valor en dolares es: " + dolares);
        System.out.println("El valor en euros es: " + euros);
        System.out.println("El valor en marcos es: " + marcos);
        // FIN
        
    }
    
    public static double convertirSolesAdolares(double soles) {
        double dolares = soles / 3.51;
        return dolares;
    }
    
    public static double convertirDolaresAeuros(double dolares) {
        return dolares * 1.09;
    }
    
    public static double convertirDolaresAmarcos(double dolares) {
        double marcos = dolares * 2.12;
        return marcos;
    }
    
}

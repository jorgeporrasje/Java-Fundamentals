package edu.cibertec.ejemplos.ejercicios.basicos;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ejercicio17 {
    
    public static void main(String[] args) {
        // Diseñe un algoritmo que calcule el sueldo bruto, el descuento por ESSALUD, el
        // descuento por AFP y el sueldo neto del empleado de una empresa de acuerdo con los
        // siguientes criterios: el sueldo bruto se calcula multiplicando el número de horas
        // trabajadas por una tarifa horario, el descuento por ESSALUD es igual al 9% del sueldo
        // bruto, el descuento por AFP es igual al 12.5% del sueldo bruto, el sueldo neto es la
        // diferencia entre el sueldo bruto y el descuento total.
        
        //INICIO
        // 1. Declaración
        int horasTrabajadas;
        double tarifaPorHora, sueldoBruto, dctoESSALUD, dctoAFP, sueldoNeto;
        // 2. Entrada
        Scanner lector =  new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas");
        horasTrabajadas = lector.nextInt();
        System.out.println("Ingrese la tarifa por hora");
        tarifaPorHora = lector.nextDouble();
        lector.close();
        // 3. Cálculo
        sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaPorHora);
        dctoESSALUD = calcularDctoESSALUD(sueldoBruto);
        dctoAFP = calcularDctoAFP(sueldoBruto);
        sueldoNeto = sueldoBruto - (dctoESSALUD + dctoAFP);
        // 4. Salida
        System.out.println("El sueldo bruto es: " + sueldoBruto);
        System.out.println("El descuento por ESSALUD es: " + dctoESSALUD);
        System.out.println("El descuento por AFP es: " + dctoAFP);
        System.out.println("El sueldo neto es: " + sueldoNeto);
        //FIN
        
    }
    
    public static double calcularSueldoBruto(int horas, double tarifa) {
        double sueldoBruto = horas * tarifa;
        return sueldoBruto;
    }
    
    public static double calcularDctoESSALUD(double sueldoBruto) {
        double dctoESSALUD = sueldoBruto * 0.09;
        return dctoESSALUD;
    }
    
    public static double calcularDctoAFP(double sueldoBruto) {
        double dctoAFP = sueldoBruto * 0.125;
        return dctoAFP;
    }
    
}

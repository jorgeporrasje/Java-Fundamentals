package edu.cibertec.ejemplos.app01.calculadora;

import java.util.Scanner;

public class CalculadoraConEntrada {
    
    public static void main(String[] args) {
        // INICIO
        // 1. Declaración de variables
        int numero1, numero2, resultadoSuma, resultadoResta, resultadoMulti;
        double resultadoDivi;
        // 2. Entrada de datos
        // Voy a utilizar un componente especializado para la lectura
        Scanner lector = new Scanner(System.in);
        imprimir("Ingrese primer número");
        numero1 = lector.nextInt();
        imprimir("Ingrese segundo número");
        numero2 = lector.nextInt();
        // Cierro el enlace para la lectura de datos
        lector.close();
        // 3. Proceso de cálculo
        // 4. Salida de resultados
        imprimir("El resultado de la suma es: " + sumar(numero1, numero2));
        imprimir("El resultado de la resta es: " + restar(numero1, numero2));
        imprimir("El resultado de la multiplicación es: " + multiplicar(numero1, numero2));
        imprimir("El resultado de la división es: " + dividir(numero1, numero2));
        // FIN
    }
    
    public static int sumar(int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        return resultado;
    }
    
    
    public static int restar(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }
    
    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
    
    public static double dividir(int num1, int num2) {
        return (double) num1 / num2;
    }
    
    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
    
}

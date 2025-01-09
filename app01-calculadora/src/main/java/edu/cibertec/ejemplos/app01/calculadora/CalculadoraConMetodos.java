package edu.cibertec.ejemplos.app01.calculadora;

public class CalculadoraConMetodos {
    
    public static void main(String[] args) {
        // INICIO
        // 1. Declaración de variables
        int numero1, numero2, resultadoSuma, resultadoResta, resultadoMulti, resultadoDivi;
        // 2. Entrada de datos
        numero1 = 8;
        numero2 = 2;
        // 3. Proceso de cálculo
        resultadoSuma = sumar(numero1, numero2);
        resultadoResta = restar(numero1, numero2);
        resultadoMulti = multiplicar(numero1, numero2);
        resultadoDivi = dividir(numero1, numero2);
        // 4. Salida de resultados
        imprimir("El resultado de la suma es: " + resultadoSuma);
        imprimir("El resultado de la resta es: " + resultadoResta);
        imprimir("El resultado de la multiplicación es: " + resultadoMulti);
        imprimir("El resultado de la división es: " + resultadoDivi);
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
    
    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
    
    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
    
}

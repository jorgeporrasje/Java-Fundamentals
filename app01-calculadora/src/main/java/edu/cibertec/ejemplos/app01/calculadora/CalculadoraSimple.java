package edu.cibertec.ejemplos.app01.calculadora;

public class CalculadoraSimple {
    
    public static void main(String[] args) {
        // INICIO
        // 1. Declaración de variables
        int numero1;
        int numero2;
        int resultadoSuma;
        int resultadoResta;
        int resultadoMulti;
        int resultadoDivi;
        // 2. Entrada de datos
        numero1 = 8;
        numero2 = 2;
        // 3. Proceso de cálculo
        resultadoSuma = numero1 + numero2;
        resultadoResta = numero1 - numero2;
        resultadoMulti = numero1 * numero2;
        resultadoDivi = numero1 / numero2;
        // 4. Salida de resultados
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        System.out.println("El resultado de la multiplicación es: " + resultadoMulti);
        System.out.println("El resultado de la división es: " + resultadoDivi);
        // FIN
    }
    
    
    
}

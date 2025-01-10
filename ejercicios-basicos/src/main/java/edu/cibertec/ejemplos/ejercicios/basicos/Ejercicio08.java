package edu.cibertec.ejemplos.ejercicios.basicos;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ejercicio08 {
    
    public static void main(String[] args) {
        // En países de habla inglesa, es común dar la estatura de una persona como la suma de
        // una cantidad entera de pies más cantitdad entera de pulgadas. Así, la estatura de
        // una persona podría ser 3'2''. Diseñe un programa que determine la estatura de una
        // persona en metros conociendo su estatura en el formato inglés. Considere que:
        // 1 pie = 12 pulgadas
        // 1 pulgada = 2.54 centímetros
        // 1 metro = 100 centímetros
        
        //INICIO
        // 1. Declaración de variables
        int pies, pulgadas;
        double centimetros, metros;
        // 2. Entrada de datos
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un valor en pies: ");
        pies = lector.nextInt();
        System.out.println("Ingrese un valor en pulgadas");
        pulgadas = lector.nextInt();
        lector.close();
        // 3. Proceso de cálculo
        //pulgadas = pulgadas + (pies * 12);
        //centimetros = pulgadas * 2.54;
        //metros = centimetros / 100;
        metros = ((pies * 12) * 2.54) / 100.0 + (pulgadas * 2.54) / 100.0;
        // 4. Salida de resultados
        System.out.println("La estatura en metros sería: " + metros);
        //FIN
        
    }
    
    
    
}

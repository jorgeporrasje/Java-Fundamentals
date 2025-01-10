package edu.cibertec.ejemplos.app02.cadenas;

/**
 *
 * @author Jorge
 */
public class Ejemplo01 {
    
    public static void main(String[] args) {
        // Definir una variable de tipo String (cadena)
        String nombre = "Jorge";
        String mensaje = "Curso de Java 11 Fundamentals";
        // Al ser una clase, String ofrece una serie de comandos
        System.out.println("El nombre en mayúsculas: " + nombre.toUpperCase());
        System.out.println("El nombre en minúsculas: " + nombre.toLowerCase());
        System.out.println(mensaje + ", ¡bienvenidos!");
        // Usualmente, desde una UI Web, las variables llegan como texto
        String edadWeb = "27";
        String sueldoWeb = "1500.50";
        // Para hacer las conversiones respectivas, utilizao las clases Wrapper
        int edad = Integer.parseInt(edadWeb);
        double sueldo = Double.parseDouble(sueldoWeb);
        System.out.println("La edad es: " + edad);
        System.out.println("El sueldo es: " + sueldo);
    }
    
    
}

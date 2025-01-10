package edu.cibertec.ejemplos.app02.cadenas;

/**
 *
 * @author Jorge
 */
public class Ejemplo02 {
    
    public static void main(String[] args) {
        // Definir algunas variables
        String nombre = "Jorge";
        String apellido = "Porras";
        String dni = "73977230"; // Para dni, teléfono o # de tc, usamos String
        // Vamos a construir el nombre un usuario bajo el siguiente esquema:
        // primera letra del nombre + el apellido + dos últimos dígitos del DNI
        // Todo debe estar en minúscula, Ej: jporras30
        int longitudNombre = nombre.length(); // Devuelve el número de caracteres
        char primeraLetra = nombre.charAt(0);
        String dosUltimosDigitos = dni.substring(dni.length() - 2);
        System.out.println("La longitud del nombre es: " + longitudNombre);
        System.out.println("Primera letra del nombre es: " + primeraLetra);
        System.out.println("Dos ultimos digitos del DNI: " + dosUltimosDigitos);
        String nombreUsuario = primeraLetra + apellido + dosUltimosDigitos;
        nombreUsuario = nombreUsuario.toLowerCase();
        System.out.println("El nombre de usuario generado es: " + nombreUsuario);
        
        
        // 
        
        
        
    }
}

package edu.cibertec.ejemplos.app02.cadenas;

/**
 *
 * @author Jorge
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        // Para volúmenes de textp más amplio utilizamos StringBuilder (o StringBuffer)
        // Para utilizar StringBuilder, defino el componente
        StringBuilder textoExtenso = new StringBuilder();
        textoExtenso.append("Hola, esto es un StringBuilder\n");
        textoExtenso.append("Que permite manejar texto de forma más ordenada.\n");
        textoExtenso.append("\tTambién puedo agregar tabulaciones");
        
        System.out.println(textoExtenso);
        
        StringBuilder otroTexto = new StringBuilder();
        otroTexto.append("Curso Java 11 Fundamentals\n")
                .append("Sesión 5\n")
                .append("Siguiente tema: Condicionales");
        System.out.println(otroTexto);
        
        StringBuilder frase = new StringBuilder("Nombre del curso: Java 11 Fundamentals");
        System.out.println("Frase invertida: " + frase.reverse());
        
    }
}

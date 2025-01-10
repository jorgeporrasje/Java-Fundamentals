package edu.cibertec.ejemplos.app02.cadenas;

/**
 *
 * @author Jorge
 */
public class Ejemplo04 {
    
    public static void main(String[] args) {
        // Para volúmenes de textp más amplio utilizamos StringBuffer (o StringBuffer)
        // Para utilizar StringBuffer, defino el componente
        StringBuffer textoExtenso = new StringBuffer();
        textoExtenso.append("Hola, esto es un StringBuffer\n");
        textoExtenso.append("Que permite manejar texto de forma más ordenada.\n");
        textoExtenso.append("\tTambién puedo agregar tabulaciones");
        
        System.out.println(textoExtenso);
        
        StringBuffer otroTexto = new StringBuffer();
        otroTexto.append("Curso Java 11 Fundamentals\n")
                .append("Sesión 5\n")
                .append("Siguiente tema: Condicionales");
        System.out.println(otroTexto);
        
        StringBuffer frase = new StringBuffer("Nombre del curso: Java 11 Fundamentals");
        System.out.println("Frase invertida: " + frase.reverse());
        
    }
}

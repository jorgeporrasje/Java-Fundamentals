package edu.cibertec.ejemplos.condicionales;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */

/*
Ejercicio:

Desarrolle un programa que permita ingresar el precio unitario y número de
unidades de un producto, así como el medio de pago que puede ser "cash"
o "tarjeta".

-Si el número de unidades es mayor a 10, pero menor a 20, se aplica un descuento de 5%.
-Si el número de unidades es mayor o igual que 20 y es menor que 35, aplicar un descuento de 10%.
-Si el número de unidades es mayor o igual que 35 y menor que 50, aplicar un 12%.
-Si el número de unidades es mayor o igual que 50, aplicac un descuento de 15%
-
Adicionalmente, si se paga com tarjeta, debe agregar un recargo de 2%.

Muestre el monto final a pagar.
*/

public class Ejercicio01 {
    
    public static void main(String[] args) {
        // Declarar
        int unidades;
        double precioUnitario, montoTotal, descuento, recargo;
        String medioPago;
        // Lectura
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese las unidades del producto: ");
        unidades = lector.nextInt();
        System.out.println("Ingrese el precio unitario: ");
        precioUnitario = lector.nextDouble();
        System.out.println("Ingrese el medio de pago (cash o tarjeta): ");
        medioPago = lector.next();
        lector.close();
        // Proceso
        // Validemos primero las entradas
        if(unidades <=0 || precioUnitario <= 0) {
            System.out.println("Las unidades o el precio unitario son inválidos");
            return;
        }
        
        if (!medioPago.equalsIgnoreCase("tarjeta") && !medioPago.equalsIgnoreCase("cash")) {
            System.out.println("El medio de pago ingresado no es válido");
            return;
        } 
        
        // Mis entradas son válidas en este punto, procedemos con el proceso de cálculo
        // Calculemos el descuento 
        if (unidades >0 && unidades <=10) {
            descuento = 0;
            
        } else if (unidades >= 10 && unidades < 20) {
            descuento = 0.05;
        
        } else if (unidades >= 20 && unidades < 35) {
            descuento = 0.10;
        
        } else if (unidades >= 35 && unidades < 50) {
            descuento = 0.12;
            
        } else {
            descuento = 0.15;
        }
        
        
        if (medioPago.equalsIgnoreCase("tarjeta")) {
            recargo = 0.02;
        } else {
            recargo = 0;
        }
        
        montoTotal = unidades * precioUnitario;
        montoTotal = montoTotal - (montoTotal * descuento);
        montoTotal = montoTotal + (montoTotal * recargo);
        
        
        
        /*
        
        //montoTotal = unidades * precioUnitario;
        if (medioPago.equalsIgnoreCase("tarjeta")) {
            if (unidades > 10 && unidades < 20) {
            descuento = (unidades * precioUnitario) * 0.05;
            recargo = 0.02;
            montoTotal = (unidades * precioUnitario) - descuento;
            montoTotal = montoTotal + (montoTotal * recargo);
            System.out.println("El monto total es: " + montoTotal);
        } else if (unidades >= 20 && unidades < 35) {
            descuento = (unidades * precioUnitario) * 0.10;
            recargo = 0.02;
            montoTotal = (unidades * precioUnitario) - descuento;
            montoTotal = montoTotal + (montoTotal * recargo);
            System.out.println("El monto total es: " + montoTotal);
        
        } else if (unidades >= 35 && unidades < 50) {
            descuento = (unidades * precioUnitario) * 0.12;
            recargo = 0.02;
            montoTotal = (unidades * precioUnitario) - descuento;
            montoTotal = montoTotal + (montoTotal * recargo);
            System.out.println("El monto total es: " + montoTotal);
        } else if (unidades >= 50 && unidades < 20) {
            descuento = (unidades * precioUnitario) * 0.15;
            recargo = 0.02;
            montoTotal = (unidades * precioUnitario) - descuento;
            montoTotal = montoTotal + (montoTotal * recargo);
            System.out.println("El monto total es: " + montoTotal);
        } else {
            descuento = (unidades * precioUnitario) * 0;
            recargo = 0.02;
            montoTotal = (unidades * precioUnitario) - descuento;
            montoTotal = montoTotal + (montoTotal * recargo);
            System.out.println("El monto total es: " + montoTotal);
        }
            
        } else if (medioPago.equalsIgnoreCase("cash")) {
            if (unidades > 10 && unidades < 20) {
            descuento = (unidades * precioUnitario) * 0.05;
            montoTotal = (unidades * precioUnitario) - descuento;
            System.out.println("El monto total es: " + montoTotal);
        } else if (unidades >= 20 && unidades < 35) {
            descuento = (unidades * precioUnitario) * 0.10;
            montoTotal = (unidades * precioUnitario) - descuento;
            System.out.println("El monto total es: " + montoTotal);
        
        } else if (unidades >= 35 && unidades < 50) {
            descuento = (unidades * precioUnitario) * 0.12;
            montoTotal = (unidades * precioUnitario) - descuento;
            System.out.println("El monto total es: " + montoTotal);
        } else if (unidades >= 50 && unidades < 20) {
            descuento = (unidades * precioUnitario) * 0.15;
            montoTotal = (unidades * precioUnitario) - descuento;
            System.out.println("El monto total es: " + montoTotal);
        } else {
            descuento = (unidades * precioUnitario) * 0;
            montoTotal = (unidades * precioUnitario) - descuento;
            System.out.println("El monto total es: " + montoTotal);
        }
            
        } else {
            System.out.println("No existe otro medio de pago");
            return;
        }
        
        */
        
        
        
        // Salida 
        System.out.println("El monto total a pagar es: " + montoTotal);
    }
    
}

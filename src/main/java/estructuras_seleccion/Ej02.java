/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras_seleccion;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ej02 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        double numero = teclado.nextDouble();
        
        // Apartado A
        
        String resultado = (numero>=135)?"mayor":"menor";
        System.out.println(resultado);
        
        // Apartado B
        
        String resultado2 = (numero<=0)?"Menor que cero":"Mayor que cero";
        System.out.println(resultado2);
        
        // Apartado C
        
        int valorAbsoluto;
        
        valorAbsoluto = (int) ((numero>=0)? numero : -numero); // Esto quiere decir
        // "si el número es mayor que cero, devuelve número, y si el número es
        // menor que cero, devuelve menos número, es decir, en valor positivo
        // menos por menos es más
        System.out.println("El valor absoluto es: " + valorAbsoluto);
        
        
    }
    
}

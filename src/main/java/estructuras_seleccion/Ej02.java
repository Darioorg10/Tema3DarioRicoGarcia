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
        
        
        
        
    }
    
}

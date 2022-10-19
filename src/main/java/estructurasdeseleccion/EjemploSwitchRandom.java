/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdeseleccion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class EjemploSwitchRandom {

    public static void main(String[] args) {

        // Si el usuario introduce A, B o C se debe guardar
        // un aleatorio entre 1 y 10
        // Si introduce D, guardar aleatorio entre 11 y 25
        // Si  introduce E, aleatorio entre 26 y 33
        // En otro caso, aleatorio entre 34 y 100
        // Creo un objeto de tipo Random llamado generador
        // con el constructor de la clase
        Random generador = new Random();
        Scanner teclado = new Scanner(System.in);
        int numAleatorio;

        System.out.println("Introduce una letra (A,B,C,D,E)");
        String letraString = teclado.nextLine();
        System.out.println("La letra es " + letraString);

        numAleatorio = switch (letraString) {
            case "A", "B", "C" -> generador.nextInt(10 - 1 + 1) + 1;
            case "D" -> {
                System.out.println("Hola");
                // otras líneas
                yield generador.nextInt(25 - 11 + 1) + 11;
            }    
            case "E" -> generador.nextInt(33 - 26 + 1) + 26;
            default -> generador.nextInt(100 - 34 + 1) + 34;
        }; //Entre 1 y 10
        //Entre 11 y 25
        //Entre 26 y 33
        // Entre 34 y 100
        
        System.out.println("El número generado es... " + numAleatorio);

//            // Genera un número aleatorio dentro del rango de los enteros
//            numAleatorio = generador.nextInt();
//            System.out.println("El número es: " + numAleatorio);
//            // Genera un número aleatorio entre 0 y 9
//            // El 10 nunca sale
//            numAleatorio = generador.nextInt(10);
//            System.out.println("El número es: " + numAleatorio);
//            
//            // Genera un número aleatorio entre 1 y 19
//            // El 19 nunca sale, al poner un + 1, aumentamos en un valor al 0
//            // y también al máximo de lo que puede salir dentro del paréntesis
//            // que es 18, pero que al sumarle 1 es 19
//            numAleatorio = generador.nextInt(19)+1;
//            System.out.println("El número es: " + numAleatorio);
//            
//            // Generar en un rango dado 12 - 18
//            // nextInt(Mayor - Menor + 1)
//            numAleatorio = generador.nextInt(18-12+1)+12;
    }
}

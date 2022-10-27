/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosentrega;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ejercicio3D_Inverso {

    public static void main(String[] args) {

        boolean salir = false;
        String palabra;
        
        do {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce una palabra");
            palabra = teclado.nextLine();

            if (!(palabra.equalsIgnoreCase("salir"))) {

                String palabraInvertida = "";

                for (int i = palabra.length(); i > 0; i--) {

                    palabraInvertida += palabra.charAt(i - 1);

                }

                System.out.printf("""
                               La palabra '%s' si la invertimos es '%s' %n""",
                        palabra, palabraInvertida);

            }
        } while (!(palabra.equalsIgnoreCase("salir")));
    }
}

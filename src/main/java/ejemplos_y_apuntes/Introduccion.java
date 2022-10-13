/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_y_apuntes;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Introduccion {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce la letra a buscar:");
        String letraBuscar = teclado.nextLine();

        // Si la letra está contenida en el nombre
        // mostrar el número de caracteres que tiene el nombre y la posición
        // donde está la letra
        // En otro caso, mostrar si el número de letras del nombre es par o impar
        
//        boolean letraContenida = nombre.contains(letraBuscar);
//        if (letraContenida == true){
//          // Parte del true
//        }
        
//        if  (nombre.contains(letraBuscar) == true){
//            System.out.println("Hola");
//        }
        int posicion = 0; // Así se puede usar fuera de el if la variable posicion
        // v1
        if  (nombre.contains(letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El número de caracteres es " + nombre.length());
            // Posición donde está la letra
            posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posición es " + posicion);
        } else {
            if (nombre.length() % 2 == 0){ // Si el número de letras del String es par
                System.out.println("El número de caracteres es par");
            } else {
                System.out.println("El número de caracteres es impar");
            }
        }
        
        // v2
        if  (nombre.contains(letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El número de caracteres es " + nombre.length());
            // Posición donde está la letra
            posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posición es " + posicion);
        } else if (nombre.length() % 2 == 0){ // Si el número de letras del String es par
                System.out.println("El número de caracteres es par");
            } else {
                System.out.println("El número de caracteres es impar");
            }
        
        // v3
        if  (nombre.contains(letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El número de caracteres es " + nombre.length());
            // Posición donde está la letra
            posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posición es " + posicion);
        } else {
            if (nombre.length() % 2 == 0){ // Si el número de letras del String es par
                System.out.println("El número de caracteres es par");
            } else {
                System.out.println("El número de caracteres es impar");
            }
            
            String textoResultado = (nombre.length() % 2 == 0)?
                    "El número de caracteres es par": // valor si true
                    "El número de caracteres es impar"; // valor si false
            
            System.out.println(textoResultado);
        }
        
            System.out.println("Adios " + posicion);
    }
    
    
}

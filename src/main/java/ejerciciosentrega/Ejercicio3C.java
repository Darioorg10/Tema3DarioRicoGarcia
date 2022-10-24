/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosentrega;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Ejercicio3C {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        String menu = """
                      ------------------------------
                                 OPCIONES
                      ------------------------------
                        1.- Convertir a números romanos (del 1 al 10)
                        2.- Contar las vocales de un nombre
                        3.- Salir
                      """;

        do {

            System.out.println(menu + "Selecciona una de las opciones:");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    int numeroRomano;
                    System.out.println("Introduce el número romano que quieras"
                            + " pasar (del 1 al 10)");
                    numeroRomano = teclado.nextInt();

                    switch (numeroRomano) {

                        case 1:
                            System.out.println("I");
                            break;
                        case 2:
                            System.out.println("II");
                            break;
                        case 3:
                            System.out.println("III");
                            break;
                        case 4:
                            System.out.println("IV");
                            break;
                        case 5:
                            System.out.println("V");
                            break;
                        case 6:
                            System.out.println("VI");
                            break;
                        case 7:
                            System.out.println("VII");
                            break;
                        case 8:
                            System.out.println("VIII");
                            break;
                        case 9:
                            System.out.println("IX");
                            break;
                        case 10:
                            System.out.println("X");
                            break;

                        default:
                            System.out.println("El número no está entre 1 y 10");
                            break;

                    }
                    break; // Del case 1 grande

                case 2:

                    int vocal = 0;
                    String nombre;
                    System.out.println("Introduce tu nombre (en minúscula y sin tildes):");
                    teclado.nextLine();
                    nombre = teclado.nextLine();

                    for (int i = 0; i < nombre.length(); i++) {
                        if (nombre.charAt(i) == 'a'
                                || nombre.charAt(i) == 'e'
                                || nombre.charAt(i) == 'i'
                                || nombre.charAt(i) == 'o'
                                || nombre.charAt(i) == 'u') {
                            vocal++;
                        }

                    }
                    System.out.println("Tu nombre contiene " + vocal + " vocales");
                    break;
                default:
                    System.out.println("FIN");
                    break;
            }

        } while (opcion != 3);

    }
}

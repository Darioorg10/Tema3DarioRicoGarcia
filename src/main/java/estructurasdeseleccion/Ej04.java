/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdeseleccion;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ej04 {
    
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce tu edad:");

                int edad = scanner.nextInt();

                String resultado = (edad >= 18)?"Es mayor de edad":"No es mayor"
                        + "de edad";
                
                System.out.println(resultado);

                System.out.print("mostrar la edad: ");
                System.out.println(edad);
        }

    
    
    
}

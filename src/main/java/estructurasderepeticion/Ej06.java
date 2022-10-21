/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasderepeticion;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ej06 {

    public static void main(String[] args) {

        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor final: ");
        n = teclado.nextInt();
        for (int x = 1; x <= n; x++) {
            System.out.print(x + "-");
        }
    }

}

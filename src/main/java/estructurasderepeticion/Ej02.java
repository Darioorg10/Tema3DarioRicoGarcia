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
public class Ej02 {
    
    public static void main(String[] args) {
        
        // El programa va a pedir n y va a ir sumandole 1 a x, que vale 1
        // hasta que x sea mayor o igual que n
        
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }

        
    }
    
}

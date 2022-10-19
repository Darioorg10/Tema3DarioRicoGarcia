/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosapuntesyejercicios;

import java.util.Random;

/**
 *
 * @author dario
 */
public class PruebasconelRandom {
    
    public static void main(String[] args) {
        
        int pruebaRandom;
        Random aleatorio = new Random();
        pruebaRandom = aleatorio.nextInt(10)-10;
        System.out.println(pruebaRandom);
        
        int pruebaRandom2;
        Random aleatorio2 = new Random();
        pruebaRandom2 = aleatorio2.nextInt(100 -10); // Al poner ese bound
        // automáticamente el mínimo es 0, si quieres poner un mínimo menor
        // tendrás que ponerlo justo después fuera o dentro
        //del paréntesis como en el de antes
        System.out.println(pruebaRandom2);
        
        if (pruebaRandom+pruebaRandom2>40){
            System.out.println("La suma de ambos es mayor a 40");
        } else {
            System.out.println("La suma de ambos es menor a 40");
        }
                
                
                
                
                
                
        
        
    }
    
}

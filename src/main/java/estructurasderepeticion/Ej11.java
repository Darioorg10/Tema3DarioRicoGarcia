/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasderepeticion;

/**
 *
 * @author dario
 */
public class Ej11 {
    
    public static void main(String[] args) {
        
        int primeraLetra = 'A';
        int ultimaLetra = 'Z';
        
        do {            
            
            System.out.print((char)primeraLetra + "\n");
            primeraLetra++;
        } while (primeraLetra<=ultimaLetra);
        
    }
    
}

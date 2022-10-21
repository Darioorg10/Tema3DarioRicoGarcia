/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasderepeticion;

/**
 *
 * @author dario
 */
public class Ej09 {
    
    public static void main(String[] args) {
        
        // Está diciendo que i vale 0 y va a ir sumándole valor uno a uno
        // la cosa es que la condición es que i sea menor que 0, pero jamás va
        // a pasar, por lo tanto al imprimir j imprimirá el valor que tenga
        
        int i=0;
        int j=6;
        while (i<0) {
            i++;
            j++;
        }
        System.out.println(j);
        
    }
    
}

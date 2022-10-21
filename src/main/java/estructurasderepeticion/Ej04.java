/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasderepeticion;

/**
 *
 * @author dario
 */
public class Ej04 {
    
    public static void main(String[] args) {
        
        // Primero va a imprimir el número 1 sumándole 1 hasta llegar a 10
        // Luego va a imprimir del 10 hasta el 1 bajando uno a uno, el último
        // número imprimido será el 1, ya que al estar en un do, lo imprime
        // antes de comprobarlo
        
        int numero = 1;
         
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
          }
          do {
               System.out.println("Número: " + --numero);
          } while(numero > 1);
        
    }
    
}

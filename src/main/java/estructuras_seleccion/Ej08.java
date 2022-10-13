/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras_seleccion;

/**
 *
 * @author dario
 */
public class Ej08 {
    
    public static void main(String args[]){
      char departamento = 'B';

      switch(departamento)
      {
         case 'A' :
            System.out.println("Desarrollo");
            break;
         case 'B' :
        System.out.println("Recursos Humanos");
            break;
         case 'C' :
            System.out.println("Finanzas");
            break;
         case 'D' :
            System.out.println("Mercadeo");
         default :
            System.out.println("Departamento no válido");
      }
      System.out.println("Código para el departamento es " + departamento);
   }

// El programa le da un valor de una letra de la A a la D y dependiendo del valor
// que le pongas a "departamento" te imprime el departamento al que equivale
// esa letra, en este caso está puesta la B que equivale a Recursos Humanos    
    
}

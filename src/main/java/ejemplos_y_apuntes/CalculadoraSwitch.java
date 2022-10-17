/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_y_apuntes;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class CalculadoraSwitch {

    public static void main(String[] args) {
        double resultado = 0;

        double operando1 = Double.parseDouble(JOptionPane.
                showInputDialog("Introduce operando 1"));
        double operando2 = Double.parseDouble(JOptionPane.
                showInputDialog("Introduce operando 2"));

        String menu = """
                      ------------------------------
                                 CALCULADORA
                      ------------------------------
                        1.- SUMAR
                        2.- RESTAR
                        3.- MULTIPLICAR
                        4.- DIVIDIR
                      """;

        String opcion = JOptionPane.showInputDialog(menu);

        // Lógica de la aplicación
        // Si es opción 1 --> sumar
        switch (opcion) {
            case "1","9","12":
            case "10": // Antes se tenía que hacer así, ahora se puede poner con
                       // comas
            case "21":    
                resultado = operando1 + operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "2":
                // Si es opción 2 --> restar

                resultado = operando1 - operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "3":
                // Si es opción 3 --> multiplicar

                resultado = operando1 * operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "4":
                // Si es opción 4 --> dividir

                resultado = operando1 / operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta");
                break;
        }

    }
}

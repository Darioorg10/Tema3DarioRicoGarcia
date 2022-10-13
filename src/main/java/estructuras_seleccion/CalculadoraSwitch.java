/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras_seleccion;

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
        if (opcion.equals("1")) {
            resultado = operando1 + operando2;
            System.out.printf("El resultado es %.2f", resultado);
        } else if (opcion.equals("2")) {
            // Si es opción 2 --> restar

            resultado = operando1 - operando2;
            System.out.printf("El resultado es %.2f", resultado);
        } else if (opcion.equals("3")) {
            // Si es opción 3 --> multiplicar

            resultado = operando1 * operando2;
            System.out.printf("El resultado es %.2f", resultado);
        } else if (opcion.equals("4")) {
            // Si es opción 4 --> dividir

            resultado = operando1 / operando2;
            System.out.printf("El resultado es %.2f", resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Opción incorrecta");
        }

    }
}

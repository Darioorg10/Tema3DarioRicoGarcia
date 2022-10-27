/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosentrega;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Ejercicio3D_Bisiesto {

    public static void main(String[] args) {

        int año;

        do {
            año = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce un año, si quieres"
                            + " terminar el programa introduce 0"));
            switch (año) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Termina el programa");

                default:
                    if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                        JOptionPane.showMessageDialog(null, año + " es bisiesto");
                    } else {
                        JOptionPane.showMessageDialog(null, año + " no es bisiesto");
                    }
            }

        } while (año != 0);

    }

}

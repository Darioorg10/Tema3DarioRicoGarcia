/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosapuntesyejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Ejercicio3B {

    public static void main(String[] args) {

        // Introducimos las constantes
        final double COSTEMANODEOBRAM1T1 = 0.15;
        final double COSTEMANODEOBRAM2T2P1 = 0.22;

        // Declaramos las variables
        double costeMateriaPrima = 0;
        double costeProduccionM1 = (costeMateriaPrima + COSTEMANODEOBRAM1T1);
        double costeProduccionT1 = (costeMateriaPrima + COSTEMANODEOBRAM1T1);
        double costeProduccionM2 = (costeMateriaPrima + COSTEMANODEOBRAM2T2P1);
        double costeProduccionT2 = (costeMateriaPrima + COSTEMANODEOBRAM2T2P1);
        double costeProduccionP1 = (costeMateriaPrima + COSTEMANODEOBRAM2T2P1);

        double precioVentaM1 = (costeProduccionM1 + 0.5 * costeProduccionM1);
        double precioVentaM2 = (costeProduccionM2 + 0.5 * costeProduccionM2);
        double precioVentaP1 = (costeProduccionP1 + 0.5 * costeProduccionP1);

        double precioVentaT1 = (costeProduccionT1 + 0.65 * costeProduccionT1);
        double precioVentaT2 = (costeProduccionT2 + 0.65 * costeProduccionT2);

        // Solicitamos el código del dulce
        String opcion = JOptionPane.showInputDialog("Introduce el código "
                + "del dulce");
        
        // Creamos la lógica de la aplicación
        if (opcion.equals("M1")) {
            String costeMateriaPrimaString = JOptionPane.showInputDialog("Introduce "
                    + "el precio de la materia prima");
            costeMateriaPrima = Double.parseDouble(costeMateriaPrimaString);
        } else if (opcion.equals("M2")){
        
        } else if (opcion.equals("P1")){
        
        } else if (opcion.equals("T1")){
        
        } else if (opcion.equals("T2")){
        
        } else {
            JOptionPane.showMessageDialog(null, "No existe "
                    + "el código introducido");
        }

    }

}

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
public class Ejercicio3B {

    public static void main(String[] args) {

        // Introducimos las constantes
        final double COSTEMANODEOBRAM1T1 = 0.15;
        final double COSTEMANODEOBRAM2T2P1 = 0.22;
        final double LIMITEINFERIOR = 0.1;
        final double LIMITESUPERIOR = 1;

        // Declaramos las variables
        double costeProduccionUnitario;
        double costeMateriaPrimaUnitario;
        double precioVentaUnitario;
        int unidadesAProducir;

        // Solicitamos el código del dulce
        String opcion = JOptionPane.showInputDialog("Introduce el código "
                + "del dulce").toUpperCase();
        
        //Comprobamos que el código introducido sea correcto
        if (opcion.equals("M1") | 
                opcion.equals("M2")
                | opcion.equals("T1") | 
                opcion.equals("T2")
                | opcion.equals("P1")) {
        
        // Solicitamos el coste de materia prima unitario    
            costeMateriaPrimaUnitario = Double.parseDouble
            (JOptionPane.showInputDialog("Introduce " + "el coste de materia prima"
            + " unitario (entre 0,1€ y 1€)"));
        
        // Comprobamos que el coste de materia prima esté entre 0,1 y 1    
            if (LIMITEINFERIOR <= costeMateriaPrimaUnitario && costeMateriaPrimaUnitario<=
                    LIMITESUPERIOR)
            
        // Hacemos un switch para calcular según cada caso
            {   switch(opcion) {
            
                case "M2","P1":
                    
                    costeProduccionUnitario = (costeMateriaPrimaUnitario+
                            COSTEMANODEOBRAM2T2P1);
                    precioVentaUnitario = (costeProduccionUnitario + 
                            0.5*costeProduccionUnitario);
                    unidadesAProducir = (2500%(0.5*precioVentaUnitario)==0) ? 
                           (int)(2500/(0.5*precioVentaUnitario)) : (int)
                            (2500/(0.5*precioVentaUnitario)) + 1 ;
                    String texto = """
                                    El coste de producción unitario es %.2f€
                                    El precio de venta unitario es %.2f€
                                    Para llegar a un beneficio de 2500€ serán
                                    necesarias %d unidades a producir"""
                            .formatted(costeProduccionUnitario,
                                    precioVentaUnitario,unidadesAProducir);
                            
                    JOptionPane.showMessageDialog(null, texto);
                    break;
                
                case "M1":
            
                    costeProduccionUnitario = (costeMateriaPrimaUnitario+
                            COSTEMANODEOBRAM1T1);
                    precioVentaUnitario = (costeProduccionUnitario + 
                            0.5*costeProduccionUnitario);
                    unidadesAProducir = (2500%(0.5*precioVentaUnitario)==0) ? 
                           (int)(2500/(0.5*precioVentaUnitario)) : (int)
                            (2500/(0.5*precioVentaUnitario)) + 1;
                    
                    String textoM1 = """
                                    El coste de producción unitario es %.2f€
                                    El precio de venta unitario es %.2f€
                                    Para llegar a un beneficio de 2500€
                                    serán necesarias %d unidades"""
                            .formatted(costeProduccionUnitario,
                                    precioVentaUnitario,unidadesAProducir);
                            
                    JOptionPane.showMessageDialog(null, textoM1);
                    break;
                    
                    case "T1":
            
                    costeProduccionUnitario = (costeMateriaPrimaUnitario+
                            COSTEMANODEOBRAM1T1);
                    precioVentaUnitario = (costeProduccionUnitario + 
                            0.65*costeProduccionUnitario);
                    unidadesAProducir = (2500%(0.5*precioVentaUnitario)==0) ? 
                           (int)(2500/(0.5*precioVentaUnitario)) : (int)
                            (2500/(0.5*precioVentaUnitario)) + 1;
                    
                    String textoT1 = """
                                    El coste de producción unitario es %.2f€
                                    El precio de venta unitario es %.2f€
                                    Para obtener un beneficio de 2500€
                                    serán necesarias %d unidades"""
                            .formatted(costeProduccionUnitario,
                                    precioVentaUnitario,unidadesAProducir);
                            
                    JOptionPane.showMessageDialog(null, textoT1);
                    break;
                    
                    case "T2":
            
                    costeProduccionUnitario = (costeMateriaPrimaUnitario+
                            COSTEMANODEOBRAM2T2P1);
                    precioVentaUnitario = (costeProduccionUnitario + 
                            0.65*costeProduccionUnitario);
                    unidadesAProducir = (2500%(0.5*precioVentaUnitario)==0) ? 
                           (int)(2500/(0.5*precioVentaUnitario)) : (int)
                            (2500/(0.5*precioVentaUnitario)) + 1;
                    String textoT2 = """
                                    El coste de producción unitario es %.2f€
                                    El precio de venta unitario es %.2f€
                                    Para obtener un beneficio de 2500€
                                    seŕan necesarias %d unidades"""
                            .formatted(costeProduccionUnitario,
                                    precioVentaUnitario,unidadesAProducir);
                            
                    JOptionPane.showMessageDialog(null, textoT2);
                    break;
            
            }
                
                    
                
                } else {
                            JOptionPane.showMessageDialog(null,
                                    "El coste no está entre 0,1 y 1");
                        }

        } else {
        
            JOptionPane.showMessageDialog(null, "El código "
                    + "introducido no es correcto");
        }

        
    }

}

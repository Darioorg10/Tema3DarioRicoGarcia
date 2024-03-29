/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdeseleccion;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ej07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        double ladoCuadrado;
        double areaCuadrado;
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        double radioCirculo;
        double areaCirculo;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                System.out.println("Introduzca la medida del lado del cuadrado");
                ladoCuadrado = entrada.nextDouble();
                areaCuadrado = (Math.pow(ladoCuadrado, 2));
                System.out.println("El área del cuadrado es " + areaCuadrado + " unidades cuadradas");
                break;
            case 2:
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Introducza la base del triángulo");
                baseTriangulo = entrada.nextDouble();
                System.out.println("Introduzca la altura del triángulo");
                alturaTriangulo = entrada.nextDouble();
                areaTriangulo = ((baseTriangulo * alturaTriangulo) / 2);
                System.out.println("El área del triángulo es de " + areaTriangulo
                        + " unidades cuadradas");
                break;
            case 3:
                System.out.println("Ha seleccionado calcular el área de un círculo...");
                System.out.println("Introduzca el radio del círculo");
                radioCirculo = entrada.nextDouble();
                areaCirculo = (Math.PI * Math.pow(radioCirculo, 2));
                System.out.println("El área del círculo es de " + areaCirculo
                        + " unidades cuadradas");
                break;
            default:
                System.out.println("Ha seleccionado terminar");
                break;
        }

    }

}

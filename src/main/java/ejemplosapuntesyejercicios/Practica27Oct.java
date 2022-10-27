/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosapuntesyejercicios;

/**
 *
 * @author dario
 */
public class Practica27Oct {

    public static void main(String[] args) {

        int fn1 = 1, fn, fn2 = 0;

        System.out.print(fn2 + "-" + fn1 + "-");

        for (int i = 2; i < 35; i++) {

            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;

            System.out.print(fn + "-");
        }

    }

}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.Arrays;

/**
 *
 * @author eduardo
 */
public class Ej06 {

    /*
    Hacer un programa que determine si dos arrays son iguales. 
    Probarlo con los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2]. 
    Este ejercicio hay que hacerlo de dos formas: la primera, 
    usando la clase Arrays; la segunda, creando un método que vaya comparando los valores 
    de los arrays y devuelva true si todos son iguales o false en caso contrario.
     */
    public static void main(String[] args) {

        int[] comparar1 = {1, 2, 3};
        int[] comparar2 = {1, 2, 3};
        int[] comparar3 = {1, 2, 3, 4};
        int[] comparar4 = {1, 2, 3};
        int[] comparar5 = {1, 2, 3};
        int[] comparar6 = {1, 2, 2};
        
        System.out.println(compararArrays(comparar1, comparar2));
        System.out.println(compararArrays(comparar3, comparar4));
        System.out.println(compararArrays(comparar5, comparar6));

    }

    public static boolean compararArrays(int[] comparar1, int[] comparar2) {
        boolean iguales = true;
        if (comparar1.length != comparar2.length) {
            iguales = false;
        } else {
            for (int i = 0; i < comparar1.length; i++) {
                if (comparar1[i] != comparar2[i]) {
                    iguales = false;
                }
            }
        }
        return iguales;
    }
}

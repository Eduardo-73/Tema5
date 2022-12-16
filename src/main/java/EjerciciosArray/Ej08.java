/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ej08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una serie de números ");

        int numero = teclado.nextInt();

        int[] numArray = new int[numero];

        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Cuantos asteriscos quieres crear ");
            numArray[i] = teclado.nextInt();
        }

        for (int j : numArray) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
        }

    }
}

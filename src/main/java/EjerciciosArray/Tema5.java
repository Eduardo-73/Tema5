/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package EjerciciosArray;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Tema5 {

    public static void main(String[] args) {
        int[] numero = new int[10];//Array de una serie de 10 números; 
        int positivo, negativo, numcero;

        leerNumeros(numero);
        positivo = contarPositivos(numero);
        System.out.println(positivo);
        negativo = contarNegativo(numero);
        System.out.println(negativo);
        numcero = contarCeros(numero);
        System.out.println(numcero);

    }

    public static void leerNumeros(int[] numero) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Introduce una serie de números del 1 al 10 ");
        num = teclado.nextInt();
        
        for (int i = 0; i < num; i++) {
            numero[i] = num;
        }
    }

    public static int contarPositivos(int[] numero) {
        int numeroPositivo = 0;

        for (int i : numero) {
            if (i >= 1) {
                numeroPositivo++;
            }
        }
        return numeroPositivo;
    }

    public static int contarNegativo(int[] numero) {
        int numeroNegativo = 0;

        for (int i : numero) {
            if (i >= 1) {
                numeroNegativo++;
            }
        }
        return numeroNegativo;
    }

    public static int contarCeros(int[] numero) {
        int cero = 0;

        for (int i : numero) {
            if (i >= 1) {
                cero++;
            }
        }
        return cero;
    }
    public void mostrarArray(int[] numero){
        for (int i : numero) {
            System.out.println(i);            
        }
    }
    public void mostrarPositivos(int[] numero){
        
    }
}

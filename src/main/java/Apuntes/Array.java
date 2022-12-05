/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apuntes;

import java.util.Arrays;

/**
 *
 * @author eduardo
 */
public class Array {

    public static void main(String[] args) {
        int numeros[] = {6, 5, 3, 1, 2};
        System.out.println(Arrays.toString(numeros));
        int posicion = Arrays.binarySearch(numeros, 15);
        System.out.println(posicion);
        //ordenarBurbuja(numeros)
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        posicion = Arrays.binarySearch(numeros, 6);
        int pos = busquedaSecuencial(numeros, 10);
        System.out.println("El 10 está en la posición " + pos);
        pos = busquedaSecuencial(numeros, 3);
        System.out.println("El 10 está en la posición " + pos);
//        System.out.println("El elemento de la posición " + pos + " es "
//        + numeros[3]); es lo mismo que abajo
        if (pos >= 0) {//Compreuba que el
            System.out.println("El elemento de la posición " + pos + " es "
                    + numeros[pos]);
        }

    }

    /*Posicion en el array donde se encuentra el elemento
    si hay varios, devuelve la primera
    Si no existe devuelve -1*/
    public static int busquedaSecuencial(int[]array, int numeroBuscar) {
        int indice = -1;
        for (int i = 0; i < array.length; i++) {
            if (numeroBuscar == array[i]) {//Lo he encontrado
                indice = i;//Guarda la posición para devolverla
                break;
            }
        }
        return indice;
    }

    public static void ordenarBurbuja(int[] numeros) {
        int tmp;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    tmp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = tmp;
                }
            }
        }
    }
}

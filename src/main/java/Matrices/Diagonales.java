/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Diagonales {

    public static void main(String[] args) {

        int a;

        int matrix[][] = {
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5}};

        for (int i = 0; i < matrix.length; i++) {
            a = matrix[i][i];
            System.out.print(a);
        }
        System.out.println("\n-------------------");

        mostrar(matrix);

        System.out.println("-------------------");

        List<Integer> diagonal = elementosDiagonalPrincipales(matrix);
        diagonal.forEach(System.out::println);

        System.out.println("-------------------");

        System.out.println(Arrays.toString(elementosDiagonalSecundarios(matrix)));

        System.out.println("-------------------");

        casillasVecinas(0, 0, matrix);

        List<Casilla> listaCasillas = casillasVecinas(2, 2, matrix);

        for (Casilla casilla : listaCasillas) {
            System.out.println(casilla);
        }
    }

    public static void mostrar(int[][] m) {
        for (int[] fila : m) {//Por cada fila de la matriz m
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println("");
        }
    }

    public static List<Integer> elementosDiagonalPrincipales(int[][] m) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            lista.add(m[i][i]);
        }
        return lista;
    }

    public static int[] elementosDiagonalSecundarios(int[][] m) {
        int[] array = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            array[i] = m[i][m.length - 1 - i];
        }

        return array;
    }

    //Ejercicio Vecinas
    public static List<Casilla> casillasVecinas(int fila, int columna, int[][] m) {
        List<Casilla> lista = new ArrayList<>();

        //Comprobar fila y columna para que sean validas
        if (filaValida(fila, m) && columnaValida(columna, m)) {
            //Recorremos fila anterior a la casilla hasta fila posterior
            for (int i = fila - 1; i <= fila + 1; i++) {
                if (filaValida(i, m)) {//si alguna fila no es valida no la mira
                    //Recorremos columna anterior a la casilla hasta columna posterior
                    for (int j = columna - 1; j <= columna + 1; j++) {
                        if (columnaValida(j, m)) {//si alguna columna no es valida no la mira
                            if (i == fila && j == columna) {
                                continue;
                            }
                            System.out.println("Casillas " + i + " " + j);
                            lista.add(new Casilla(i, j, m[i][j]));
                        }
                    }
                }
            }
        }
        return lista;
    }

    public static boolean filaValida(int fila, int[][] matrix) {
        return fila >= 0 && fila < matrix.length;
    }

    public static boolean columnaValida(int columna, int[][] matrix) {
        return columna >= 0 && columna < matrix.length;
    }
}

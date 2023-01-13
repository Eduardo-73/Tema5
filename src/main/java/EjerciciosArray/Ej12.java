/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

/**
 *
 * @author eduardo
 */
public class Ej12 {

    public static void main(String[] args) {

        char[][] matrizUno = {{'a', 'b', 'c'},
        {'d', 'e', 'f'}};

        char[][] matrizDos = new char[2][3];

        matrizDos[0][0] = 'a';
        matrizDos[0][1] = 'b';
        matrizDos[0][2] = 'c';
        matrizDos[1][0] = 'd';
        matrizDos[1][2] = 'e';
        matrizDos[1][1] = 'f';

        char[][] matrizTres = new char[2][3];

        matrizTres[0][0] = 'a';
        matrizTres[0][1] = 'b';
        matrizTres[0][2] = 'c';
        matrizTres[1][0] = 'd';
        matrizTres[1][1] = 'e';
        matrizTres[1][2] = 'f';

        System.out.println("Matriz Uno");
        mostrarMatriz(matrizUno);
        System.out.println("Matriz Dos");
        mostrarMatriz(matrizDos);
        System.out.println("Matriz Tres");
        mostrarMatriz(matrizTres);
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("\n");
    }
}

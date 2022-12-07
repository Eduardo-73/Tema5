/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer número por teclado (int) / Decir si es capicua
 *
 * Int ==> String String ==> char[]
 *
 *
 * Rellenar arrat char desde 'A' a 'Z' / Generar tamaño aleatorio desde 15 y 25
 *
 * Crear un array de ese tamaño y rellenar con posiciones velicas distintas
 *
 * Crear String con los valores de las posiciones
 *
 * @author eduardo
 */
public class Ej01 {

    public static void main(String[] args) {

        int numLeer;

        numLeer = leerTeclado();
        System.out.println(comprobarCapicua(numLeer));
    }

    public static int leerTeclado() {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        System.out.println(numero);

        return numero;
    }

    public static boolean comprobarCapicua(int numLeer) {
        String numCapicua;
        numCapicua = String.valueOf(numLeer);
        char[] numero = new char[numCapicua.length()];

        boolean capicua = true;

        for (int i = 0; i > numero.length; i++) {
            if (numero[i] == numero[(numero.length - 1) - i]) {
                capicua = true;
            } else {
                capicua = false;
                break;
            }
        }
        return capicua;
    }
}

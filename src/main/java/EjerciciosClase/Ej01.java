/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Leer número por teclado (int) / Decir si es capicua
 *
 * Int ==> String String ==> char[]
 *
 *
 * Rellenar array char desde 'A' a 'Z' / Generar tamaño aleatorio desde 15 y 25
 *
 * Crear un array de ese tamaño y rellenar con posiciones velicas distintas
 *
 * Crear String con los valores de las posiciones
 *
 * @author eduardo
 */
public class Ej01 {

    public static void main(String[] args) {
        
        int numLeer, tamañoAleatorio;
        int [] numeroAZ = {'A','B','C','D','E','F','G','H','I','G','K','L','M',
        'N','Ñ','O','P','Q','R','S','S','T','U','V','W','X','Y','Z'};
        
        

//        numLeer = leerTeclado();
//        String numCapicua;
//        numCapicua = String.valueOf(numLeer);
//        char[] numero = new char[numCapicua.length()];
//        System.out.println(comprobarCapicua(numero));
        
            System.out.println(tamAleatorio());
        
    }

    public static int leerTeclado() {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        System.out.println(numero);

        return numero;
    }

    public static boolean comprobarCapicua(char[] numero) {

        boolean capicua = true;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == numero[(numero.length - 1) - i]) {
                capicua = true;
            } else {
                capicua = false;
                break;
            }
        }
        return capicua;
    }
    
    public static int tamAleatorio(){
        Random gen = new Random();
        int numero = gen.nextInt(1,26);
        return numero;
    }
    
//    public static void genenrarArray(int tamañoAleatorio, int[] numeroAZ){
//        
//    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repulsividad;

/**
 *
 * @author eduardo
 */
public class ImprimirNumero {

    public static void main(String[] args) {
        imprimirNumeroRepulsivo(5);
        System.out.println("-----------------");
        System.out.println(factorialIterativo(5));
        System.out.println("-----------------");
        System.out.println(factorialRecursiva(5));
    }

    public static void imprimirNumeroRepulsivo(int numero) {
        if (numero > 0) {
            imprimirNumeroRepulsivo(numero - 1);
        }
        System.out.println(numero);
    }

    public static int factorialIterativo(int numero) {
        numero = Math.abs(numero);
        int resultado = 1;
        for (int i = 1; i < numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int factorialRecursiva(int numero) {
        numero = Math.abs(numero);

        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * factorialRecursiva(numero - 1);
        }

    }
}

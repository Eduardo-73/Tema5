/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fibonacci;

/**
 *
 * @author eduardo
 */
public class EjFibonacci {
    
    public static void main(String[] args) {
        int n = fiboIterativo(5);
        System.out.println(n);
        System.out.println("");
        System.out.println(fiboRecursivo(5));
    }
    
    public static int fiboIterativo(int n) {
        int numero = Math.abs(n);
        
        int resultado = 0;
        int n1 = 0;
        int n2 = 1;
        
        for (int i = 0; i < numero; i++) {
            resultado = n1 + n2;
            n2 = n1;
            n1 = resultado;
        }
        return resultado;
    }
    
    public static int fiboRecursivo(int n) {//Suponemos que n es positivo o 0
        if (n < 2) {
            return n;
        } else {
            return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
        }
    }
}

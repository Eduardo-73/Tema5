/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class Ej23 {

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        ArrayList<Integer> lista4 = new ArrayList<>();
        Random gen = new Random();

        int num1 = gen.nextInt(5, 15 + 1);
        int num2 = gen.nextInt(10, 20 + 1);
        int num3; 

        for (int i = 0; i < num1; i++) {
            num3 = gen.nextInt(50, 100 + 1);
            lista1.add(num3);  
        }
        
        for (int i = 0; i < num2; i++) {
            num3 = gen.nextInt(50, 100 + 1);
            lista2.add(num3);
        }
        System.out.println("---------------");
        lista1.forEach(System.out::println);
        System.out.println("---------------");
        lista2.forEach(System.out::println);
        System.out.println("---------------");
        lista3.contains(lista1);
        for (int i = 0; i < lista3.size(); i++) {
            
        }
        
    }
}
